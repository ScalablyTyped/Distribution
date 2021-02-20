package typings.sugar

import org.scalablytyped.runtime.Shortcut
import typings.sugar.sugarjs.Object.ChainableBase
import typings.sugar.sugarjs.Sugar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sugar", JSImport.Namespace)
  @js.native
  val ^ : Sugar = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Object")
  @js.native
  class Object ()
    extends ChainableBase[js.Object] {
    def this(raw: js.Object) = this()
  }
  
  type _To = Sugar
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sugar = ^
}
