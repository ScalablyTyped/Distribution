package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/mathematics", JSImport.Namespace)
@js.native
object algorithmMathematicsMod extends js.Object {
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def is_permutation[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): scala.Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def max_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def min_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): tstlLib.utilityPairMod.Pair[T, T] = js.native
  def minmax_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def next_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def next_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
}

