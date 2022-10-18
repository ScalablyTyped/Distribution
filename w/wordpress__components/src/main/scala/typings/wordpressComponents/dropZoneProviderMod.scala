package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.anon.ChildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropZoneProviderMod extends Shortcut {
  
  @JSImport("@wordpress/components/drop-zone/provider", JSImport.Default)
  @js.native
  val default: ComponentType[ChildrenReactNode] = js.native
  
  type _To = ComponentType[ChildrenReactNode]
  
  /* This means you don't have to write `default`, but can instead just say `dropZoneProviderMod.foo` */
  override def _to: ComponentType[ChildrenReactNode] = default
}
