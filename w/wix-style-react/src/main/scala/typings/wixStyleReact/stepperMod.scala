package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("wix-style-react/dist/es/src/Stepper", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StepperProps, js.Object, js.Any]
  
  type Stepper = PureComponent[StepperProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.compact
    - typings.wixStyleReact.wixStyleReactStrings.stretched
  */
  trait StepperFit extends StObject
  object StepperFit {
    
    @scala.inline
    def compact: typings.wixStyleReact.wixStyleReactStrings.compact = "compact".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.compact]
    
    @scala.inline
    def stretched: typings.wixStyleReact.wixStyleReactStrings.stretched = "stretched".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.stretched]
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
    
    @scala.inline
    def apply(activeStep: Double, steps: js.Array[StepperStep]): StepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperProps]
    }
    
    @scala.inline
    implicit class StepperPropsMutableBuilder[Self <: StepperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFit(value: StepperFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* index */ Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[StepperStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: StepperStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setType(value: StepperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StepperStep extends StObject {
    
    var text: String
    
    var `type`: js.UndefOr[StepperStepType] = js.undefined
  }
  object StepperStep {
    
    @scala.inline
    def apply(text: String): StepperStep = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperStep]
    }
    
    @scala.inline
    implicit class StepperStepMutableBuilder[Self <: StepperStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: StepperStepType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    @scala.inline
    def completed: typings.wixStyleReact.wixStyleReactStrings.completed = "completed".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.completed]
    
    @scala.inline
    def disabled: typings.wixStyleReact.wixStyleReactStrings.disabled = "disabled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.disabled]
    
    @scala.inline
    def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    @scala.inline
    def normal: typings.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.circle
    - typings.wixStyleReact.wixStyleReactStrings.text
  */
  trait StepperType extends StObject
  object StepperType {
    
    @scala.inline
    def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
    
    @scala.inline
    def text: typings.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.text]
  }
}
