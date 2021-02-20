package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.equal
import typings.typescriptTuple.typescriptTupleStrings.shorterLeft
import typings.typescriptTuple.typescriptTupleStrings.shorterRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitBoth[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends StObject {
  
  var fitBoth: equal = js.native
  
  var fitLeft: shorterLeft = js.native
  
  var fitRight: shorterRight = js.native
  
  var unfit: js.Any = js.native
}
object FitBoth {
  
  @scala.inline
  def apply[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): FitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoth[Left, Right]]
  }
  
  @scala.inline
  implicit class FitBothMutableBuilder[Self <: FitBoth[_, _], Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] (val x: Self with (FitBoth[Left, Right])) extends AnyVal {
    
    @scala.inline
    def setFitBoth(value: equal): Self = StObject.set(x, "fitBoth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitLeft(value: shorterLeft): Self = StObject.set(x, "fitLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitRight(value: shorterRight): Self = StObject.set(x, "fitRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfit(value: js.Any): Self = StObject.set(x, "unfit", value.asInstanceOf[js.Any])
  }
}
