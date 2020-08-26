package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceEntry extends js.Object {
  var fileName: String = js.native
  var isWriteAccess: Boolean = js.native
  var limChar: Double = js.native
  var minChar: Double = js.native
}

object ReferenceEntry {
  @scala.inline
  def apply(fileName: String, isWriteAccess: Boolean, limChar: Double, minChar: Double): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  @scala.inline
  implicit class ReferenceEntryOps[Self <: ReferenceEntry] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWriteAccess(value: Boolean): Self = this.set("isWriteAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimChar(value: Double): Self = this.set("limChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
  }
  
}

