package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/merge", JSImport.Namespace)
@js.native
object algorithmMergeMod extends js.Object {
  def includes[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): scala.Boolean = js.native
  def includes[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def inplace_merge[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def inplace_merge[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def merge[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
}

