package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod._PrepareRenameResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultBehavior
  extends StObject
     with _PrepareRenameResult {
  
  var defaultBehavior: Boolean
}
object DefaultBehavior {
  
  inline def apply(defaultBehavior: Boolean): DefaultBehavior = {
    val __obj = js.Dynamic.literal(defaultBehavior = defaultBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultBehavior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultBehavior] (val x: Self) extends AnyVal {
    
    inline def setDefaultBehavior(value: Boolean): Self = StObject.set(x, "defaultBehavior", value.asInstanceOf[js.Any])
  }
}
