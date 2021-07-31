package typings.wixUiCore

import typings.wixUiCore.anon.PartialCheckboxPropsAccept
import typings.wixUiCore.srcComponentsCheckboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreCheckboxMod {
  
  @JSImport("wix-ui-core/src/components/checkbox", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends typings.wixUiCore.srcComponentsCheckboxCheckboxMod.Checkbox {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  /* static members */
  object Checkbox {
    
    @JSImport("wix-ui-core/src/components/checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: PartialCheckboxPropsAccept = js.native
    @scala.inline
    def defaultProps_=(x: PartialCheckboxPropsAccept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/checkbox", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
