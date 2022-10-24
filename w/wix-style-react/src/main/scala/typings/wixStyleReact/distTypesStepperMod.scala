package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStepperMod {
  
  @JSImport("wix-style-react/dist/types/Stepper", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StepperProps, js.Object, Any]
  
  type Stepper = PureComponent[StepperProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.compact
    - typings.wixStyleReact.wixStyleReactStrings.stretched
  */
  trait StepperFit extends StObject
  object StepperFit {
    
    inline def compact: typings.wixStyleReact.wixStyleReactStrings.compact = "compact".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.compact]
    
    inline def stretched: typings.wixStyleReact.wixStyleReactStrings.stretched = "stretched".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.stretched]
  }
  
  trait StepperProps extends StObject {
    
    var activeStep: Double
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fit: js.UndefOr[StepperFit] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var steps: js.Array[StepperStep]
    
    var `type`: js.UndefOr[StepperType] = js.undefined
  }
  object StepperProps {
    
    inline def apply(activeStep: Double, steps: js.Array[StepperStep]): StepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperProps]
    }
    
    extension [Self <: StepperProps](x: Self) {
      
      inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFit(value: StepperFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setOnClick(value: /* index */ Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSteps(value: js.Array[StepperStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: StepperStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setType(value: StepperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StepperStep extends StObject {
    
    var text: String
    
    var `type`: js.UndefOr[StepperStepType] = js.undefined
  }
  object StepperStep {
    
    inline def apply(text: String): StepperStep = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperStep]
    }
    
    extension [Self <: StepperStep](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: StepperStepType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.completed
    - typings.wixStyleReact.wixStyleReactStrings.disabled
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.normal
  */
  trait StepperStepType extends StObject
  object StepperStepType {
    
    inline def completed: typings.wixStyleReact.wixStyleReactStrings.completed = "completed".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.completed]
    
    inline def disabled: typings.wixStyleReact.wixStyleReactStrings.disabled = "disabled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.disabled]
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def normal: typings.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.circle
    - typings.wixStyleReact.wixStyleReactStrings.text
  */
  trait StepperType extends StObject
  object StepperType {
    
    inline def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
    
    inline def text: typings.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.text]
  }
}
