package typings.wixUiCore

import typings.react.mod.LiHTMLAttributes
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.PartialStepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperStepperMod {
  
  @JSImport("wix-ui-core/dist/src/components/stepper/Stepper", "Stepper")
  @js.native
  class Stepper protected ()
    extends PureComponent[StepperProps, js.Object, js.Any] {
    def this(props: StepperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StepperProps, context: js.Any) = this()
    
    def getStepProps(): GetStepProps = js.native
  }
  
  trait ChildrenArgs extends StObject {
    
    var getStepProps: GetStepProps
  }
  object ChildrenArgs {
    
    @scala.inline
    def apply(getStepProps: (/* stepIndex */ Double, /* overrides */ js.UndefOr[PartialStepProps]) => StepProps): ChildrenArgs = {
      val __obj = js.Dynamic.literal(getStepProps = js.Any.fromFunction2(getStepProps))
      __obj.asInstanceOf[ChildrenArgs]
    }
    
    @scala.inline
    implicit class ChildrenArgsMutableBuilder[Self <: ChildrenArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStepProps(value: (/* stepIndex */ Double, /* overrides */ js.UndefOr[PartialStepProps]) => StepProps): Self = StObject.set(x, "getStepProps", js.Any.fromFunction2(value))
    }
  }
  
  type GetStepProps = js.Function2[/* stepIndex */ Double, /* overrides */ js.UndefOr[PartialStepProps], StepProps]
  
  trait StepProps
    extends StObject
       with LiHTMLAttributes[js.Any] {
    
    var active: Boolean
    
    var visited: Boolean
  }
  object StepProps {
    
    @scala.inline
    def apply(active: Boolean, visited: Boolean): StepProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class StepPropsMutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepperProps extends StObject {
    
    var activeStep: Double
    
    var children: js.UndefOr[js.Function1[/* args */ ChildrenArgs, Element]] = js.undefined
  }
  object StepperProps {
    
    @scala.inline
    def apply(activeStep: Double): StepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperProps]
    }
    
    @scala.inline
    implicit class StepperPropsMutableBuilder[Self <: StepperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: /* args */ ChildrenArgs => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
