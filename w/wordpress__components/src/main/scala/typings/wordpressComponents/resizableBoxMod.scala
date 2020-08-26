package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.reResizable.mod.ResizableProps
import typings.react.mod.ComponentType
import typings.wordpressComponents.resizableBoxMod.ResizableBox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/resizable-box", JSImport.Namespace)
@js.native
object resizableBoxMod extends js.Object {
  @js.native
  object ResizableBox extends js.Object {
    type Props = ResizableProps
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Props]]
  
}

