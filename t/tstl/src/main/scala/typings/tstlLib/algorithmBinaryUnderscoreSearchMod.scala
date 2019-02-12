package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/binary_search", JSImport.Namespace)
@js.native
object algorithmBinaryUnderscoreSearchMod extends js.Object {
  def binary_search[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): scala.Boolean = js.native
  def binary_search[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def equal_range[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def lower_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
}

