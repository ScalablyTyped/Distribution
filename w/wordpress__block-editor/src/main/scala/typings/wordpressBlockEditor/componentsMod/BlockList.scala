package typings.wordpressBlockEditor.componentsMod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.blockListMod.BlockList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockList extends Shortcut {
  
  @JSImport("@wordpress/block-editor/components", "BlockList")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `BlockList.foo` */
  override def _to: ComponentType[Props] = ^
}
