package typings
package typestyleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type CSSClassNames[K /* <: java.lang.String */] = stdLib.Record[K, java.lang.String]
  type CSSClasses[K /* <: java.lang.String */] = stdLib.Record[K, NestedCSSProperties]
  type FontFace = csstypeLib.csstypeMod.FontFace
  type TLength = scala.Double | java.lang.String
}
