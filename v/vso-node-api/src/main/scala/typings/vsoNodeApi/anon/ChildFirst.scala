package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildFirst extends StObject {
  
  var childFirst: scala.Double
  
  var parentFirst: scala.Double
}
object ChildFirst {
  
  @scala.inline
  def apply(childFirst: scala.Double, parentFirst: scala.Double): ChildFirst = {
    val __obj = js.Dynamic.literal(childFirst = childFirst.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFirst]
  }
  
  @scala.inline
  implicit class ChildFirstMutableBuilder[Self <: ChildFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildFirst(value: scala.Double): Self = StObject.set(x, "childFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFirst(value: scala.Double): Self = StObject.set(x, "parentFirst", value.asInstanceOf[js.Any])
  }
}
