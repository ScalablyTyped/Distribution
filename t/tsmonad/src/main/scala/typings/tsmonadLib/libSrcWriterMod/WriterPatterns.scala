package typings
package tsmonadLib.libSrcWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterPatterns[S, T, U] extends js.Object {
  def writer(story: js.Array[S], value: T): U
}

