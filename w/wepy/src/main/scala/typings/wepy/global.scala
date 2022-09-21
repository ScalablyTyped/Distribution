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
    open class app () extends default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.component")
    @js.native
    open class component ()
      extends typings.wepy.componentMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.event")
    @js.native
    open class event protected ()
      extends typings.wepy.eventMod.default {
      def this(name: String, source: Any, `type`: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.mixin")
    @js.native
    open class mixin ()
      extends typings.wepy.mixinMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("wepy.page")
    @js.native
    open class page ()
      extends typings.wepy.pageMod.default
    
    type _To = DefaultExport
    
    /* This means you don't have to write `^`, but can instead just say `wepy.foo` */
    override def _to: DefaultExport = ^
  }
}
