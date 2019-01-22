package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/binary_search", JSImport.Namespace)
@js.native
object algorithmBinaryUnderscoreSearchMod extends js.Object {
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Boolean = js.native
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
}

