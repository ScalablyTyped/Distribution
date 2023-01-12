package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegularExpressionsClientCapabilities extends StObject {
  
  /**
    * The engine's name.
    */
  var engine: String
  
  /**
    * The engine's version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object RegularExpressionsClientCapabilities {
  
  inline def apply(engine: String): RegularExpressionsClientCapabilities = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularExpressionsClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegularExpressionsClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
