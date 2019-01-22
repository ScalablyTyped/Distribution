package typings
package tstlLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "ForOfAdaptor")
@js.native
class ForOfAdaptor[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */] protected ()
  extends tstlLib.baseIteratorForOfAdaptorMod.ForOfAdaptor[T, InputIterator] {
  /**
    * Initializer Constructor.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def this(first: InputIterator, last: InputIterator) = this()
}

