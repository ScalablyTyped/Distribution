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
}
