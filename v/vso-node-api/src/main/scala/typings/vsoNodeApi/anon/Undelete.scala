package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Undelete extends StObject {
  
  var add: scala.Double
  
  var delete: scala.Double
  
  var undelete: scala.Double
  
  var update: scala.Double
}
object Undelete {
  
  inline def apply(add: scala.Double, delete: scala.Double, undelete: scala.Double, update: scala.Double): Undelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Undelete]
  }
  
  extension [Self <: Undelete](x: Self) {
    
    inline def setAdd(value: scala.Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setUndelete(value: scala.Double): Self = StObject.set(x, "undelete", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: scala.Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
