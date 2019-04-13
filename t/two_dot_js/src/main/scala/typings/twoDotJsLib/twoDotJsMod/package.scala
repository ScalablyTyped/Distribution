package typings
package twoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twoDotJsMod {
  type BoundingClientRect = stdLib.Record[
    twoDotJsLib.twoDotJsLibStrings.top | twoDotJsLib.twoDotJsLibStrings.left | twoDotJsLib.twoDotJsLibStrings.right | twoDotJsLib.twoDotJsLibStrings.bottom | twoDotJsLib.twoDotJsLibStrings.width | twoDotJsLib.twoDotJsLibStrings.height, 
    scala.Double
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - LinearGradient
    - RadialGradient
  */
  type Color = _Color | java.lang.String
}
