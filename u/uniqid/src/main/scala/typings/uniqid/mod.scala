package typings.uniqid

import org.scalablytyped.runtime.Shortcut
import typings.uniqid.anon.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("uniqid", JSImport.Namespace)
  @js.native
  val ^ : Process with (js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String]) = js.native
  
  type _To = Process with (js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Process with (js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String]) = ^
}
