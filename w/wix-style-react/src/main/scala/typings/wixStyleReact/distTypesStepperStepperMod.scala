package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStepperStepperMod {
  
  /** Stepper */
  @JSImport("wix-style-react/dist/types/Stepper/Stepper", JSImport.Default)
  @js.native
  open class default protected () extends Stepper {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Stepper/Stepper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.defaultProps.fit")
      @js.native
      def fit: String = js.native
      inline def fit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fit")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.defaultProps.steps")
      @js.native
      def steps: js.Array[scala.Nothing] = js.native
      inline def steps_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steps")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Index of the active step. */
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes.activeStep")
      @js.native
      def activeStep: Validator[Double] = js.native
      inline def activeStep_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStep")(x.asInstanceOf[js.Any])
      
      /** Hook for testing purposes. */
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /**
        * Fit mode for steps. In `stretched` mode the component will grow to fill parent
        * container width.
        */
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes.fit")
      @js.native
      def fit: Requireable[String] = js.native
      inline def fit_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fit")(x.asInstanceOf[js.Any])
      
      /** Event triggered on step click: `onClick(stepIndex)` */
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /**
        * An array of steps, where each step is an object with the following properties:
        * - `text` - step title text (required).
        * - `type` - step type (`completed`, `disabled`, `error` or default `normal`).
        */
      inline def steps(props: Any, propName: Any, componentName: Any, location: Any): js.UndefOr[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("steps")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
      
      /** Style type. */
      @JSImport("wix-style-react/dist/types/Stepper/Stepper", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
    }
  }
  
  /** Stepper */
  @js.native
  trait Stepper extends PureComponent[Any, Any, Any] {
    
    def _getActiveStepType(): Any = js.native
  }
}
