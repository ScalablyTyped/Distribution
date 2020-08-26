package typings.xummApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummCustomMeta extends js.Object {
  var blob: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var identifier: js.UndefOr[String | Null] = js.native
  var instruction: js.UndefOr[String | Null] = js.native
}

object XummCustomMeta {
  @scala.inline
  def apply(): XummCustomMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummCustomMeta]
  }
  @scala.inline
  implicit class XummCustomMetaOps[Self <: XummCustomMeta] (val x: Self) extends AnyVal {
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
    def setBlob(value: StringDictionary[js.Any]): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    @scala.inline
    def setBlobNull: Self = this.set("blob", null)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIdentifierNull: Self = this.set("identifier", null)
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    @scala.inline
    def setInstructionNull: Self = this.set("instruction", null)
  }
  
}

