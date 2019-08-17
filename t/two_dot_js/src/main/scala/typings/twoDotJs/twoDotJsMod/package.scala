package typings.twoDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twoDotJsMod {
  import typings.std.Record
  import typings.twoDotJs.twoDotJsStrings.bottom
  import typings.twoDotJs.twoDotJsStrings.height
  import typings.twoDotJs.twoDotJsStrings.left
  import typings.twoDotJs.twoDotJsStrings.right
  import typings.twoDotJs.twoDotJsStrings.top
  import typings.twoDotJs.twoDotJsStrings.width

  type BoundingClientRect = Record[top | left | right | bottom | width | height, Double]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.twoDotJs.twoDotJsMod.LinearGradient
    - typings.twoDotJs.twoDotJsMod.RadialGradient
  */
  type Color = _Color | String
  type _Object = Object
}
