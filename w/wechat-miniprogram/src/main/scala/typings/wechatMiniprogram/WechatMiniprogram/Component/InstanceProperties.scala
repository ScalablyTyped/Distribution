package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProperties extends js.Object {
  /** 节点dataset */
  var dataset: Record[String, String] = js.native
  /** 节点id */
  var id: String = js.native
  /** 组件的文件路径 */
  var is: String = js.native
}

object InstanceProperties {
  @scala.inline
  def apply(dataset: Record[String, String], id: String, is: String): InstanceProperties = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProperties]
  }
  @scala.inline
  implicit class InstancePropertiesOps[Self <: InstanceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataset(value: Record[String, String]): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
  }
  
}

