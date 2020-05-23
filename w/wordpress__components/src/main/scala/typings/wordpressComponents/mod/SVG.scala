package typings.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "SVG")
@js.native
class SVG protected ()
  extends Component[SVGProps[SVGSVGElement], ComponentState, js.Any] {
  def this(props: SVGProps[SVGSVGElement]) = this()
  def this(props: SVGProps[SVGSVGElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "SVG")
@js.native
object SVG extends TopLevel[ComponentType[SVGProps[SVGSVGElement]]]

