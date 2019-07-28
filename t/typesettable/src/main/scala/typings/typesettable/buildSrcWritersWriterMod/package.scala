package typings.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcWritersWriterMod {
  type IPenFactory[T] = js.Function3[/* text */ String, /* transform */ ITransform, /* container */ js.UndefOr[T], IPen]
}
