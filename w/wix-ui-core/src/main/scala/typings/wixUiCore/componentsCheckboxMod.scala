package typings.wixUiCore

import typings.wixUiCore.anon.PartialCheckboxProps
import typings.wixUiCore.checkboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCheckboxMod {
  
  @JSImport("wix-ui-core/dist/src/components/checkbox", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends typings.wixUiCore.checkboxCheckboxMod.Checkbox {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  /* static members */
  object Checkbox {
    
    @JSImport("wix-ui-core/dist/src/components/checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: PartialCheckboxProps = js.native
    inline def defaultProps_=(x: PartialCheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/checkbox", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
