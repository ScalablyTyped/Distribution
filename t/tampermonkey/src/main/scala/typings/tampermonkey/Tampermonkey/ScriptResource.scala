package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resources from the metadata block (@resources)
  * that tampermonkey should preload
  */
trait ScriptResource extends StObject {
  
  var content: String
  
  var meta: String
  
  var name: String
  
  var url: String
}
object ScriptResource {
  
  inline def apply(content: String, meta: String, name: String, url: String): ScriptResource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptResource]
  }
  
  extension [Self <: ScriptResource](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
