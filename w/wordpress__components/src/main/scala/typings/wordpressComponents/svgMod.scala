package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGCircleElement
import typings.std.SVGGElement
import typings.std.SVGPathElement
import typings.std.SVGPolygonElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/primitives/svg", JSImport.Namespace)
@js.native
object svgMod extends js.Object {
  @js.native
  class Circle protected ()
    extends Component[SVGProps[SVGCircleElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGCircleElement]) = this()
    def this(props: SVGProps[SVGCircleElement], context: js.Any) = this()
  }
  
  @js.native
  class G protected ()
    extends Component[SVGProps[SVGGElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGGElement]) = this()
    def this(props: SVGProps[SVGGElement], context: js.Any) = this()
  }
  
  @js.native
  class Path protected ()
    extends Component[SVGProps[SVGPathElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGPathElement]) = this()
    def this(props: SVGProps[SVGPathElement], context: js.Any) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends Component[SVGProps[SVGPolygonElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGPolygonElement]) = this()
    def this(props: SVGProps[SVGPolygonElement], context: js.Any) = this()
  }
  
  @js.native
  class Rect protected ()
    extends Component[SVGProps[SVGRectElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGRectElement]) = this()
    def this(props: SVGProps[SVGRectElement], context: js.Any) = this()
  }
  
  @js.native
  class SVG protected ()
    extends Component[SVGProps[SVGSVGElement], ComponentState, js.Any] {
    def this(props: SVGProps[SVGSVGElement]) = this()
    def this(props: SVGProps[SVGSVGElement], context: js.Any) = this()
  }
  
  @js.native
  object Circle extends TopLevel[ComponentType[SVGProps[SVGCircleElement]]]
  
  @js.native
  object G extends TopLevel[ComponentType[SVGProps[SVGGElement]]]
  
  @js.native
  object Path extends TopLevel[ComponentType[SVGProps[SVGPathElement]]]
  
  @js.native
  object Polygon extends TopLevel[ComponentType[SVGProps[SVGPolygonElement]]]
  
  @js.native
  object Rect extends TopLevel[ComponentType[SVGProps[SVGRectElement]]]
  
  @js.native
  object SVG extends TopLevel[ComponentType[SVGProps[SVGSVGElement]]]
  
}

