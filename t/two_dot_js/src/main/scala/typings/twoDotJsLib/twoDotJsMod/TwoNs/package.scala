package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TwoNs {
  type ArcSegment = Path
  type BoundingClientRect = stdLib.Record[
    twoDotJsLib.twoDotJsLibStrings.top | twoDotJsLib.twoDotJsLibStrings.left | twoDotJsLib.twoDotJsLibStrings.right | twoDotJsLib.twoDotJsLibStrings.bottom | twoDotJsLib.twoDotJsLibStrings.width | twoDotJsLib.twoDotJsLibStrings.height, 
    scala.Double
  ]
  type Circle = Path
  type Color = java.lang.String | LinearGradient | RadialGradient
  type Ellipse = Path
  type Line = Path
  type Object = Path | Group
  type Polygon = Path
  type Rectangle = Path
  type Renderer = SVGRenderer | WebGLRenderer | CanvasRenderer
  type RoundedRectangle = Path
  type Star = Path
}
