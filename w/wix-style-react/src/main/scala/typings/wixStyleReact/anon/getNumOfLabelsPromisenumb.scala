package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {getNumOfLabels (): std.Promise<number>, getLabels (): std.Promise<std.Array<string>>, getLabelAt (index : number): std.Promise<string>} & std.Pick<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> & wix-ui-test-utils.wix-ui-test-utils/base-driver.BaseUniDriver */
trait getNumOfLabelsPromisenumb extends StObject {
  
  /** click on the element */
  def click(): js.Promise[Unit]
  
  var driver: Focus
  
  /** returns the component element */
  def element(): js.Promise[js.Any]
  
  /** returns true if component exists */
  def exists(): js.Promise[Boolean]
  
  def getLabelAt(index: Double): js.Promise[String]
  
  def getLabels(): js.Promise[js.Array[String]]
  
  def getNumOfLabels(): js.Promise[Double]
}
object getNumOfLabelsPromisenumb {
  
  @scala.inline
  def apply(
    click: () => js.Promise[Unit],
    driver: Focus,
    element: () => js.Promise[js.Any],
    exists: () => js.Promise[Boolean],
    getLabelAt: Double => js.Promise[String],
    getLabels: () => js.Promise[js.Array[String]],
    getNumOfLabels: () => js.Promise[Double]
  ): getNumOfLabelsPromisenumb = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabelAt = js.Any.fromFunction1(getLabelAt), getLabels = js.Any.fromFunction0(getLabels), getNumOfLabels = js.Any.fromFunction0(getNumOfLabels))
    __obj.asInstanceOf[getNumOfLabelsPromisenumb]
  }
  
  @scala.inline
  implicit class getNumOfLabelsPromisenumbMutableBuilder[Self <: getNumOfLabelsPromisenumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDriver(value: Focus): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabels(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getLabels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumOfLabels(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumOfLabels", js.Any.fromFunction0(value))
  }
}
