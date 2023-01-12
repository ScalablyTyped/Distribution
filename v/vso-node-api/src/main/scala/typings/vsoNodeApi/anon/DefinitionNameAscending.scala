package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionNameAscending extends StObject {
  
  var definitionNameAscending: scala.Double
  
  var definitionNameDescending: scala.Double
  
  var lastModifiedAscending: scala.Double
  
  var lastModifiedDescending: scala.Double
  
  var none: scala.Double
}
object DefinitionNameAscending {
  
  inline def apply(
    definitionNameAscending: scala.Double,
    definitionNameDescending: scala.Double,
    lastModifiedAscending: scala.Double,
    lastModifiedDescending: scala.Double,
    none: scala.Double
  ): DefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNameAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionNameAscending] (val x: Self) extends AnyVal {
    
    inline def setDefinitionNameAscending(value: scala.Double): Self = StObject.set(x, "definitionNameAscending", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNameDescending(value: scala.Double): Self = StObject.set(x, "definitionNameDescending", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAscending(value: scala.Double): Self = StObject.set(x, "lastModifiedAscending", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDescending(value: scala.Double): Self = StObject.set(x, "lastModifiedDescending", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
