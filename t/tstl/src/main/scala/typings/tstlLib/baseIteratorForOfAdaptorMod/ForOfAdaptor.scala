package typings
package tstlLib.baseIteratorForOfAdaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ForOfAdaptor", "ForOfAdaptor")
@js.native
class ForOfAdaptor[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */] protected ()
  extends stdLib.IterableIterator[T] {
  /**
    * Initializer Constructor.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def this(first: InputIterator, last: InputIterator) = this()
  /**
    * @hidden
    */
  var `it_`: js.Any = js.native
  /**
    * @hidden
    */
  var `last_`: js.Any = js.native
}

