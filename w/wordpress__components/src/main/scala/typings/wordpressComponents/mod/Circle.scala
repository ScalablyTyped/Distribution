package typings.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGCircleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "Circle")
@js.native
class Circle protected ()
  extends Component[SVGProps[SVGCircleElement], ComponentState, js.Any] {
  def this(props: SVGProps[SVGCircleElement]) = this()
  def this(props: SVGProps[SVGCircleElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "Circle")
@js.native
object Circle extends TopLevel[ComponentType[SVGProps[SVGCircleElement]]]

