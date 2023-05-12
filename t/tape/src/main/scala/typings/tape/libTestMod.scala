package typings.tape

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestMod extends Shortcut {
  
  @JSImport("tape/lib/test", JSImport.Namespace)
  @js.native
  val ^ : Test = js.native
  
  type Test = typings.tape.mod.Test
  
  type _To = Test
  
  /* This means you don't have to write `^`, but can instead just say `libTestMod.foo` */
  override def _to: Test = ^
}
