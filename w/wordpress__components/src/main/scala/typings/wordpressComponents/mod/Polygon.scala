package typings.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGPolygonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "Polygon")
@js.native
class Polygon protected ()
  extends Component[SVGProps[SVGPolygonElement], ComponentState, js.Any] {
  def this(props: SVGProps[SVGPolygonElement]) = this()
  def this(props: SVGProps[SVGPolygonElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "Polygon")
@js.native
object Polygon extends TopLevel[ComponentType[SVGProps[SVGPolygonElement]]]

