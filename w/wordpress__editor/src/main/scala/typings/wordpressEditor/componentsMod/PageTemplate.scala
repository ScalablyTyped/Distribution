package typings.wordpressEditor.componentsMod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.templateMod.PageTemplate.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageTemplate extends Shortcut {
  
  @JSImport("@wordpress/editor/components", "PageTemplate")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `PageTemplate.foo` */
  override def _to: ComponentType[Props] = ^
}
