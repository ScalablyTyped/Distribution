package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edits extends StObject {
  
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
  implicit class EditsMutableBuilder[Self <: Edits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: Boolean): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
  }
}
