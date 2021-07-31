package typings.wordpressEditor.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.postAuthorMod.PostAuthor.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostAuthor extends Shortcut {
  
  @JSImport("@wordpress/editor", "PostAuthor")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `PostAuthor.foo` */
  override def _to: ComponentType[Props] = ^
}
