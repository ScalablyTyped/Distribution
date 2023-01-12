package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdAscending extends StObject {
  
  var idAscending: scala.Double
  
  var idDescending: scala.Double
  
  var nameAscending: scala.Double
  
  var nameDescending: scala.Double
}
object IdAscending {
  
  inline def apply(
    idAscending: scala.Double,
    idDescending: scala.Double,
    nameAscending: scala.Double,
    nameDescending: scala.Double
  ): IdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdAscending] (val x: Self) extends AnyVal {
    
    inline def setIdAscending(value: scala.Double): Self = StObject.set(x, "idAscending", value.asInstanceOf[js.Any])
    
    inline def setIdDescending(value: scala.Double): Self = StObject.set(x, "idDescending", value.asInstanceOf[js.Any])
    
    inline def setNameAscending(value: scala.Double): Self = StObject.set(x, "nameAscending", value.asInstanceOf[js.Any])
    
    inline def setNameDescending(value: scala.Double): Self = StObject.set(x, "nameDescending", value.asInstanceOf[js.Any])
  }
}
