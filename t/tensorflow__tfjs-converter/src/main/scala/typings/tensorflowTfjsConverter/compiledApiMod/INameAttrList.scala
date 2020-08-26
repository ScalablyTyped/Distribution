package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INameAttrList extends js.Object {
  /** NameAttrList attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.native
  /** NameAttrList name */
  var name: js.UndefOr[String | Null] = js.native
}

object INameAttrList {
  @scala.inline
  def apply(): INameAttrList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INameAttrList]
  }
  @scala.inline
  implicit class INameAttrListOps[Self <: INameAttrList] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
  
}

