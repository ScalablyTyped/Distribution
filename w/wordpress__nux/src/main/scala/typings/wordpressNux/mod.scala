package typings.wordpressNux

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressNux.anon.TypeofimportedActions
import typings.wordpressNux.anon.TypeofimportedSelectors
import typings.wordpressNux.dotTipMod.DotTip.Props
import typings.wordpressNux.wordpressNuxStrings.coreSlashnux
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DotTip extends Shortcut {
    
    @JSImport("@wordpress/nux", "DotTip")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `DotTip.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dispatch_corenux(key: coreSlashnux): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    @scala.inline
    def select_corenux(key: coreSlashnux): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
}
