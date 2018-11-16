package typings
package typesettableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcWritersWriterMod {
  type IPenFactory[T] = js.Function3[
    /* text */ java.lang.String, 
    /* transform */ ITransform, 
    /* container */ js.UndefOr[T], 
    IPen
  ]
  type IXAlign = typesettableLib.typesettableLibStrings.left | typesettableLib.typesettableLibStrings.center | typesettableLib.typesettableLibStrings.right
  type IYAlign = typesettableLib.typesettableLibStrings.top | typesettableLib.typesettableLibStrings.center | typesettableLib.typesettableLibStrings.bottom
}
