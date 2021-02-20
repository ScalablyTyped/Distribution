package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Undelete extends StObject {
  
  var add: scala.Double = js.native
  
  var delete: scala.Double = js.native
  
  var undelete: scala.Double = js.native
  
  var update: scala.Double = js.native
}
object Undelete {
  
  @scala.inline
  def apply(add: scala.Double, delete: scala.Double, undelete: scala.Double, update: scala.Double): Undelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Undelete]
  }
  
  @scala.inline
  implicit class UndeleteMutableBuilder[Self <: Undelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: scala.Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndelete(value: scala.Double): Self = StObject.set(x, "undelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: scala.Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
