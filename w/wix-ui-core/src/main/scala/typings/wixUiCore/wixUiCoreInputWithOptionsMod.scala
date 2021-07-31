package typings.wixUiCore

import typings.wixUiCore.anon.FilterPredicate
import typings.wixUiCore.inputWithOptionsInputWithOptionsMod.InputWithOptionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreInputWithOptionsMod {
  
  @JSImport("wix-ui-core/input-with-options", "InputWithOptions")
  @js.native
  class InputWithOptions protected ()
    extends typings.wixUiCore.inputWithOptionsMod.InputWithOptions {
    def this(props: InputWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputWithOptionsProps, context: js.Any) = this()
  }
  /* static members */
  object InputWithOptions {
    
    @JSImport("wix-ui-core/input-with-options", "InputWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/input-with-options", "InputWithOptions.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: js.Any = js.native
    @scala.inline
    def bypassDefaultPropsTypecheck_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/input-with-options", "InputWithOptions.defaultProps")
    @js.native
    def defaultProps: FilterPredicate = js.native
    @scala.inline
    def defaultProps_=(x: FilterPredicate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/input-with-options", "InputWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
