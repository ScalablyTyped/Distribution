package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bindingsversion extends StObject {
  
  var bindings_version: String
  
  var lang: String
  
  var lang_version: String
  
  var platform: String
  
  var publisher: String
  
  var uname: String
}
object Bindingsversion {
  
  inline def apply(
    bindings_version: String,
    lang: String,
    lang_version: String,
    platform: String,
    publisher: String,
    uname: String
  ): Bindingsversion = {
    val __obj = js.Dynamic.literal(bindings_version = bindings_version.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lang_version = lang_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindingsversion]
  }
  
  extension [Self <: Bindingsversion](x: Self) {
    
    inline def setBindings_version(value: String): Self = StObject.set(x, "bindings_version", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLang_version(value: String): Self = StObject.set(x, "lang_version", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
  }
}
