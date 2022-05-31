package typings.wepy

import org.scalablytyped.runtime.Shortcut
import typings.wepy.appMod.default
import typings.wepy.mod.DefaultExport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wepy extends Shortcut {
    
    @JSGlobal("wepy")
    @js.native
    val ^ : DefaultExport = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.app")
    @js.native
    class app () extends default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.component")
    @js.native
    class component ()
      extends typings.wepy.componentMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.event")
    @js.native
    class event protected ()
      extends typings.wepy.eventMod.default {
      def this(name: String, source: js.Any, `type`: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.mixin")
    @js.native
    class mixin ()
      extends typings.wepy.mixinMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.page")
    @js.native
    class page ()
      extends typings.wepy.pageMod.default
    
    type _To = DefaultExport
    
    /* This means you don't have to write `^`, but can instead just say `wepy.foo` */
    override def _to: DefaultExport = ^
  }
}
