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
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - LinearGradient
    - RadialGradient
  */
  type Color = _Color | java.lang.String
  type Ellipse = Path
  type Line = Path
  type Polygon = Path
  type Rectangle = Path
  type RoundedRectangle = Path
  type Star = Path
}
