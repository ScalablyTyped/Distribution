package typings.wordpressEditor.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.tableOfContentsMod.TableOfContents.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableOfContents extends Shortcut {
  
  @JSImport("@wordpress/editor", "TableOfContents")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `TableOfContents.foo` */
  override def _to: ComponentType[Props] = ^
}
