package typings.stylehacks

import org.scalablytyped.runtime.Shortcut
import typings.stylehacks.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsMod extends Shortcut {
  
  @JSImport("stylehacks/types/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Instantiable] = js.native
  
  type _To = js.Array[Instantiable]
  
  /* This means you don't have to write `^`, but can instead just say `typesPluginsMod.foo` */
  override def _to: js.Array[Instantiable] = ^
}
