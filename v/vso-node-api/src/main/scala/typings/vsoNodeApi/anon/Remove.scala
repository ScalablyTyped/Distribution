package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove extends StObject {
  
  var create: scala.Double
  
  var remove: scala.Double
}
object Remove {
  
  @scala.inline
  def apply(create: scala.Double, remove: scala.Double): Remove = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
  
  @scala.inline
  implicit class RemoveMutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: scala.Double): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: scala.Double): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
