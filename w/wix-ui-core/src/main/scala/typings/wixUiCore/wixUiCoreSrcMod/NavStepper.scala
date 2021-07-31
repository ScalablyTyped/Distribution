package typings.wixUiCore.wixUiCoreSrcMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixUiCore.componentsNavStepperNavStepMod.ExternalNavStepProps
import typings.wixUiCore.srcComponentsNavStepperNavStepperMod.NavStepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src", "NavStepper")
@js.native
class NavStepper protected ()
  extends typings.wixUiCore.srcComponentsNavStepperMod.NavStepper {
  def this(props: NavStepperProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NavStepperProps, context: js.Any) = this()
}
/* static members */
object NavStepper {
  
  @JSImport("wix-ui-core/src", "NavStepper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src", "NavStepper.Step")
  @js.native
  def Step: ComponentClass[ExternalNavStepProps, ComponentState] = js.native
  @scala.inline
  def Step_=(x: ComponentClass[ExternalNavStepProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
}
