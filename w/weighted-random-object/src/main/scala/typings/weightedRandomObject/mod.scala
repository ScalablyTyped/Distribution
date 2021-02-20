package typings.weightedRandomObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("weighted-random-object", JSImport.Namespace)
  @js.native
  def apply[T /* <: Weighted */](objects: js.Array[T]): T = js.native
  
  @js.native
  trait Weighted extends StObject {
    
    var weight: Double = js.native
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
