package typings.twemoji

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("twemoji", JSImport.Default)
  @js.native
  val default: Twemoji = js.native
  
  type _To = Twemoji
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Twemoji = default
}
