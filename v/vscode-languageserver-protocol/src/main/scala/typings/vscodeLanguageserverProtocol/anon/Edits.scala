package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edits extends StObject {
  
  /**
    * The server supports deltas for full documents.
    */
  var edits: js.UndefOr[Boolean] = js.undefined
}
object Edits {
  
  inline def apply(): Edits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edits]
  }
  
  extension [Self <: Edits](x: Self) {
    
    inline def setEdits(value: Boolean): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
  }
}
