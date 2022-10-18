package typings.tern.libTernMod

import typings.tern.ternStrings.properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesQuery
  extends StObject
     with BaseQuery
     with Query {
  
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[String] = js.undefined
  
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.undefined
  
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: properties
}
object PropertiesQuery {
  
  inline def apply(): PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("properties")
    __obj.asInstanceOf[PropertiesQuery]
  }
  
  extension [Self <: PropertiesQuery](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: properties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
