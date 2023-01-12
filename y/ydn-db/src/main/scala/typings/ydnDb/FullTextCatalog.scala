package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullTextCatalog extends StObject {
  
  var lang: String
  
  var name: String
  
  var sources: js.Array[FullTextSource]
}
object FullTextCatalog {
  
  inline def apply(lang: String, name: String, sources: js.Array[FullTextSource]): FullTextCatalog = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextCatalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullTextCatalog] (val x: Self) extends AnyVal {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Array[FullTextSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: FullTextSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
