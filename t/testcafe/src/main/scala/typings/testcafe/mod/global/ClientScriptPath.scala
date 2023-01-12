package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScriptPath
  extends StObject
     with ClientScriptCommon
     with ClientScript {
  
  var path: js.UndefOr[String] = js.undefined
}
object ClientScriptPath {
  
  inline def apply(): ClientScriptPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScriptPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientScriptPath] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
