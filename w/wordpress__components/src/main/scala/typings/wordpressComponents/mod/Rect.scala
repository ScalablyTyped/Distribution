package typings.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGRectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "Rect")
@js.native
class Rect protected ()
  extends Component[SVGProps[SVGRectElement], ComponentState, js.Any] {
  def this(props: SVGProps[SVGRectElement]) = this()
  def this(props: SVGProps[SVGRectElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "Rect")
@js.native
object Rect extends TopLevel[ComponentType[SVGProps[SVGRectElement]]]

