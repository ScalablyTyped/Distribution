package typings.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.std.Record

  type CSSClassNames[K /* <: String */] = Record[K, String]
  type CSSClasses[K /* <: String */] = Record[K, NestedCSSProperties]
  type FontFace = typings.csstype.csstypeMod.FontFace
  type TLength = Double | String
}
