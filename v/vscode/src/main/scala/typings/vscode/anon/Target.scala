package typings.vscode.anon

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * A target URI to open with more information about the diagnostic error.
    */
  var target: Uri
  
  /**
    * A code or identifier for this diagnostic.
    * Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}.
    */
  var value: String | Double
}
object Target {
  
  inline def apply(target: Uri, value: String | Double): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setTarget(value: Uri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
