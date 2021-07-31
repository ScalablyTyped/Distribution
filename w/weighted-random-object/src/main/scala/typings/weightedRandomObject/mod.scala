package typings.weightedRandomObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: Weighted */](objects: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].apply(objects.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("weighted-random-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Weighted extends StObject {
    
    var weight: Double
  }
  object Weighted {
    
    @scala.inline
    def apply(weight: Double): Weighted = {
      val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Weighted]
    }
    
    @scala.inline
    implicit class WeightedMutableBuilder[Self <: Weighted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
