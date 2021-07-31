package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentLikeObject extends StObject {
  
  var percent: Double
}
object PercentLikeObject {
  
  @scala.inline
  def apply(percent: Double): PercentLikeObject = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentLikeObject]
  }
  
  @scala.inline
  implicit class PercentLikeObjectMutableBuilder[Self <: PercentLikeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
