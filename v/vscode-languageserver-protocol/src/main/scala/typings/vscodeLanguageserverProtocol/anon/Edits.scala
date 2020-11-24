package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edits extends js.Object {
  
  /**
    * The server supports deltas for full documents.
    */
  var edits: js.UndefOr[Boolean] = js.native
}
object Edits {
  
  @scala.inline
  def apply(): Edits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edits]
  }
  
  @scala.inline
  implicit class EditsOps[Self <: Edits] (val x: Self) extends AnyVal {
    
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
    def setEdits(value: Boolean): Self = this.set("edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
  }
}
