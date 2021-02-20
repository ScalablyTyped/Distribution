package typings.sugar

import org.scalablytyped.runtime.Shortcut
import typings.sugar.sugarjs.Object.ChainableBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Sugar extends Shortcut {
    
    @JSGlobal("Sugar")
    @js.native
    val ^ : typings.sugar.sugarjs.Sugar = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Sugar.Object")
    @js.native
    class Object ()
      extends ChainableBase[js.Object] {
      def this(raw: js.Object) = this()
    }
    
    type _To = typings.sugar.sugarjs.Sugar
    
    /* This means you don't have to write `^`, but can instead just say `Sugar.foo` */
    override def _to: typings.sugar.sugarjs.Sugar = ^
  }
}
