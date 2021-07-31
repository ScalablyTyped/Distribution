package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copy extends StObject {
  
  var add: scala.Double
  
  var copy: scala.Double
  
  var move: scala.Double
  
  var remove: scala.Double
  
  var replace: scala.Double
  
  var test: scala.Double
}
object Copy {
  
  @scala.inline
  def apply(
    add: scala.Double,
    copy: scala.Double,
    move: scala.Double,
    remove: scala.Double,
    replace: scala.Double,
    test: scala.Double
  ): Copy = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: scala.Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: scala.Double): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: scala.Double): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: scala.Double): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: scala.Double): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: scala.Double): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
