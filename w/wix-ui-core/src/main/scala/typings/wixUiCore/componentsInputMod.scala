package typings.wixUiCore

import typings.wixUiCore.componentsInputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInputMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/input", "Input")
  @js.native
  class Input protected ()
    extends typings.wixUiCore.componentsInputInputMod.Input {
    def this(props: InputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputProps, context: js.Any) = this()
  }
  /* static members */
  object Input {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/input", "Input")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/input", "Input.defaultProps")
    @js.native
    def defaultProps: InputProps = js.native
    inline def defaultProps_=(x: InputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/input", "Input.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
