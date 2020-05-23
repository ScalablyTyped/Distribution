package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/form-toggle", JSImport.Namespace)
@js.native
object formToggleMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[HTMLProps[HTMLInputElement], ComponentState, js.Any] {
    def this(props: HTMLProps[HTMLInputElement]) = this()
    def this(props: HTMLProps[HTMLInputElement], context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[HTMLProps[HTMLInputElement]]]
  
}

