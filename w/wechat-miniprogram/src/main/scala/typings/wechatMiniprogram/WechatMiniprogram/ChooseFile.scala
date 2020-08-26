package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.file
import typings.wechatMiniprogram.wechatMiniprogramStrings.image
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 返回选择的文件的本地临时文件对象数组 */
@js.native
trait ChooseFile extends js.Object {
  /** 选择的文件名称 */
  var name: String = js.native
  /** 本地临时文件路径 (本地路径) */
  var path: String = js.native
  /** 本地临时文件大小，单位 B */
  var size: Double = js.native
  /** 选择的文件的会话发送时间，Unix时间戳，工具暂不支持此属性 */
  var time: Double = js.native
  /** 选择的文件类型
    *
    * 可选值：
    * - 'video': 选择了视频文件;
    * - 'image': 选择了图片文件;
    * - 'file': 选择了除图片和视频的文件; */
  var `type`: video | image | file = js.native
}

object ChooseFile {
  @scala.inline
  def apply(name: String, path: String, size: Double, time: Double, `type`: video | image | file): ChooseFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFile]
  }
  @scala.inline
  implicit class ChooseFileOps[Self <: ChooseFile] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: video | image | file): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

