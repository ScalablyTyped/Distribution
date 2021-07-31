package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {getNumOfLabels (): number, getLabels (): std.Array<string>, getLabelAt (index : number): string} & std.Pick<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
trait getNumOfLabelsnumbergetLa extends StObject {
  
  var driver: Blur
  
  def getLabelAt(index: Double): String
  
  def getLabels(): js.Array[String]
  
  def getNumOfLabels(): Double
}
object getNumOfLabelsnumbergetLa {
  
  @scala.inline
  def apply(
    driver: Blur,
    getLabelAt: Double => String,
    getLabels: () => js.Array[String],
    getNumOfLabels: () => Double
  ): getNumOfLabelsnumbergetLa = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], getLabelAt = js.Any.fromFunction1(getLabelAt), getLabels = js.Any.fromFunction0(getLabels), getNumOfLabels = js.Any.fromFunction0(getNumOfLabels))
    __obj.asInstanceOf[getNumOfLabelsnumbergetLa]
  }
  
  @scala.inline
  implicit class getNumOfLabelsnumbergetLaMutableBuilder[Self <: getNumOfLabelsnumbergetLa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: Blur): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabelAt(value: Double => String): Self = StObject.set(x, "getLabelAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabels(value: () => js.Array[String]): Self = StObject.set(x, "getLabels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumOfLabels(value: () => Double): Self = StObject.set(x, "getNumOfLabels", js.Any.fromFunction0(value))
  }
}
