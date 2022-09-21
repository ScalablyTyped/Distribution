package typings.supportsWebp

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("supports-webp", JSImport.Default)
  @js.native
  val default: js.Promise[Boolean] = js.native
  
  type _To = js.Promise[Boolean]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Promise[Boolean] = default
}
