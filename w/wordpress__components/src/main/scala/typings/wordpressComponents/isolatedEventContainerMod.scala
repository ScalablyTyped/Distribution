package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import typings.wordpressComponents.isolatedEventContainerMod.IsolatedEventContainer.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/isolated-event-container", JSImport.Namespace)
@js.native
object isolatedEventContainerMod extends js.Object {
  @js.native
  object IsolatedEventContainer extends js.Object {
    type Props = HTMLProps[HTMLDivElement]
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Props]]
  
}

