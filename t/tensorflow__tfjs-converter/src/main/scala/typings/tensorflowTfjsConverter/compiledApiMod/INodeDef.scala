package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeDef extends js.Object {
  /** NodeDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.native
  /** NodeDef device */
  var device: js.UndefOr[String | Null] = js.native
  /** NodeDef input */
  var input: js.UndefOr[js.Array[String] | Null] = js.native
  /** NodeDef name */
  var name: js.UndefOr[String | Null] = js.native
  /** NodeDef op */
  var op: js.UndefOr[String | Null] = js.native
}

object INodeDef {
  @scala.inline
  def apply(): INodeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeDef]
  }
  @scala.inline
  implicit class INodeDefOps[Self <: INodeDef] (val x: Self) extends AnyVal {
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
    def setAttr(value: StringDictionary[IAttrValue]): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setAttrNull: Self = this.set("attr", null)
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setDeviceNull: Self = this.set("device", null)
    @scala.inline
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    @scala.inline
    def setInput(value: js.Array[String]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setOpNull: Self = this.set("op", null)
  }
  
}

