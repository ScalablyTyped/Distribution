package typings.wixStyleReact

import typings.react.mod.ReactElement
import typings.wixStyleReact.anon.OnEnd
import typings.wixStyleReact.anon.TransitionPropstimeoutnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionToggleToggleMod {
  
  /** Toggle is a component to solve ReactTransitionGroup bug with lagging collapse and expand transitions. */
  object default {
    
    inline def apply(param0: TransitionPropstimeoutnum): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle/Toggle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle/Toggle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle/Toggle", "default.propTypes")
    @js.native
    def propTypes: OnEnd = js.native
    inline def propTypes_=(x: OnEnd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
