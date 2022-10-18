package typings.voidElements

import org.scalablytyped.runtime.Shortcut
import typings.std.Partial
import typings.std.Record
import typings.voidElements.voidElementsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("void-elements", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Partial[Record[String, `true`]]) = js.native
  
  type _To = js.Object & (Partial[Record[String, `true`]])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Partial[Record[String, `true`]]) = ^
}
