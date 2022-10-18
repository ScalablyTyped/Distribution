package typings.sugarCore

import org.scalablytyped.runtime.Shortcut
import typings.sugarCore.sugarjs.Sugar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sugarMod extends Shortcut {
  
  @JSImport("sugar", JSImport.Namespace)
  @js.native
  val ^ : Sugar = js.native
  
  type _To = Sugar
  
  /* This means you don't have to write `^`, but can instead just say `sugarMod.foo` */
  override def _to: Sugar = ^
}
