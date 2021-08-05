package typings.wixStyleReact

import typings.wixStyleReact.stepperMod.StepperFit
import typings.wixStyleReact.stepperMod.StepperStepType
import typings.wixStyleReact.stepperMod.StepperType
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperUniDriverMod {
  
  trait StepperUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickStep(index: Double): js.Promise[Unit]
    
    def getFit(): js.Promise[StepperFit]
    
    def getNumberOfSteps(): js.Promise[Double]
    
    def getStepText(index: Double): js.Promise[String]
    
    def getStepType(index: Double): js.Promise[StepperStepType]
    
    def getType(): js.Promise[StepperType]
    
    def hoverStep(index: Double): js.Promise[Unit]
    
    def isStepActive(index: Double): js.Promise[Boolean]
  }
  object StepperUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickStep: Double => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getFit: () => js.Promise[StepperFit],
      getNumberOfSteps: () => js.Promise[Double],
      getStepText: Double => js.Promise[String],
      getStepType: Double => js.Promise[StepperStepType],
      getType: () => js.Promise[StepperType],
      hoverStep: Double => js.Promise[Unit],
      isStepActive: Double => js.Promise[Boolean]
    ): StepperUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickStep = js.Any.fromFunction1(clickStep), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getFit = js.Any.fromFunction0(getFit), getNumberOfSteps = js.Any.fromFunction0(getNumberOfSteps), getStepText = js.Any.fromFunction1(getStepText), getStepType = js.Any.fromFunction1(getStepType), getType = js.Any.fromFunction0(getType), hoverStep = js.Any.fromFunction1(hoverStep), isStepActive = js.Any.fromFunction1(isStepActive))
      __obj.asInstanceOf[StepperUniDriver]
    }
    
    extension [Self <: StepperUniDriver](x: Self) {
      
      inline def setClickStep(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickStep", js.Any.fromFunction1(value))
      
      inline def setGetFit(value: () => js.Promise[StepperFit]): Self = StObject.set(x, "getFit", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfSteps(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumberOfSteps", js.Any.fromFunction0(value))
      
      inline def setGetStepText(value: Double => js.Promise[String]): Self = StObject.set(x, "getStepText", js.Any.fromFunction1(value))
      
      inline def setGetStepType(value: Double => js.Promise[StepperStepType]): Self = StObject.set(x, "getStepType", js.Any.fromFunction1(value))
      
      inline def setGetType(value: () => js.Promise[StepperType]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHoverStep(value: Double => js.Promise[Unit]): Self = StObject.set(x, "hoverStep", js.Any.fromFunction1(value))
      
      inline def setIsStepActive(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isStepActive", js.Any.fromFunction1(value))
    }
  }
}
