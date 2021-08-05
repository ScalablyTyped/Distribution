package typings.tern.ternMod

import typings.tern.ternStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseQuery extends StObject {
  
  var docFormat: js.UndefOr[full] = js.undefined
  
  var lineCharPositions: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
}
object BaseQuery {
  
  inline def apply(`type`: String): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
  
  extension [Self <: BaseQuery](x: Self) {
    
    inline def setDocFormat(value: full): Self = StObject.set(x, "docFormat", value.asInstanceOf[js.Any])
    
    inline def setDocFormatUndefined: Self = StObject.set(x, "docFormat", js.undefined)
    
    inline def setLineCharPositions(value: Boolean): Self = StObject.set(x, "lineCharPositions", value.asInstanceOf[js.Any])
    
    inline def setLineCharPositionsUndefined: Self = StObject.set(x, "lineCharPositions", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
