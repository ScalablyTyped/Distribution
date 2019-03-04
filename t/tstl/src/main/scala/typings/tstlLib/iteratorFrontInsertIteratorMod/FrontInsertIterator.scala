package typings
package tstlLib.iteratorFrontInsertIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/FrontInsertIterator", "FrontInsertIterator")
@js.native
class FrontInsertIterator[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */] protected ()
  extends tstlLib.baseIteratorUnderscoreInsertIteratorMod._InsertIterator[T, FrontInsertIterator[T, Source]] {
  /**
    * Initializer Constructor.
    *
    * @param source The source container.
    */
  def this(source: Source) = this()
  /**
    * @hidden
    */
  var source_ : js.Any = js.native
}

