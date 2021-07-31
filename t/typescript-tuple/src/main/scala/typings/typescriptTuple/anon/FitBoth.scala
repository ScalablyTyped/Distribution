package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.equal
import typings.typescriptTuple.typescriptTupleStrings.shorterLeft
import typings.typescriptTuple.typescriptTupleStrings.shorterRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitBoth[Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */] extends StObject {
  
  var fitBoth: equal
  
  var fitLeft: shorterLeft
  
  var fitRight: shorterRight
  
  var unfit: js.Any
}
object FitBoth {
  
  @scala.inline
  def apply[Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */](unfit: js.Any): FitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = "equal", fitLeft = "shorterLeft", fitRight = "shorterRight", unfit = unfit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoth[Left, Right]]
  }
  
  @scala.inline
  implicit class FitBothMutableBuilder[Self <: FitBoth[?, ?], Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */] (val x: Self & (FitBoth[Left, Right])) extends AnyVal {
    
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
