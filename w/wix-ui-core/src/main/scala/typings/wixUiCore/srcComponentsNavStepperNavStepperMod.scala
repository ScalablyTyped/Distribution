package typings.wixUiCore

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.wixUiCore.componentsNavStepperNavStepMod.ExternalNavStepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsNavStepperNavStepperMod {
  
  @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper", "NavStepper")
  @js.native
  class NavStepper protected ()
    extends PureComponent[NavStepperProps, js.Object, js.Any] {
    def this(props: NavStepperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavStepperProps, context: js.Any) = this()
  }
  /* static members */
  object NavStepper {
    
    @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper", "NavStepper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/nav-stepper/NavStepper", "NavStepper.Step")
    @js.native
    def Step: ComponentClass[ExternalNavStepProps, ComponentState] = js.native
    @scala.inline
    def Step_=(x: ComponentClass[ExternalNavStepProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
  }
  
  trait NavStepperProps extends StObject {
    
    var activeStep: Double
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var onStepClick: js.UndefOr[js.Function2[/* stepIndex */ Double, /* e */ js.Any, Unit]] = js.undefined
  }
  object NavStepperProps {
    
    @scala.inline
    def apply(activeStep: Double): NavStepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavStepperProps]
    }
    
    @scala.inline
    implicit class NavStepperPropsMutableBuilder[Self <: NavStepperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setOnStepClick(value: (/* stepIndex */ Double, /* e */ js.Any) => Unit): Self = StObject.set(x, "onStepClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStepClickUndefined: Self = StObject.set(x, "onStepClick", js.undefined)
    }
  }
}
