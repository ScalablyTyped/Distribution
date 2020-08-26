package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a NodeList. */
@js.native
trait INodeList extends js.Object {
  /** NodeList value */
  var value: js.UndefOr[js.Array[String] | Null] = js.native
}

object INodeList {
  @scala.inline
  def apply(): INodeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeList]
  }
  @scala.inline
  implicit class INodeListOps[Self <: INodeList] (val x: Self) extends AnyVal {
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
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

