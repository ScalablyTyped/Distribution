package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.wordpressComponents.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/drop-zone/provider", JSImport.Namespace)
@js.native
object providerMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[Children, ComponentState, js.Any] {
    def this(props: Children) = this()
    def this(props: Children, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Children]]
  
}

