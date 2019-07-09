package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/modifiers", JSImport.Namespace)
@js.native
object algorithmModifiersMod extends js.Object {
  def copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[InputIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def copy_n[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, n: scala.Double, output: OutputIterator): OutputIterator = js.native
  def fill[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): scala.Unit = js.native
  def fill_n[OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first: OutputIterator,
    n: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
  ): OutputIterator = js.native
  def generate[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    gen: js.Function0[tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]]
  ): scala.Unit = js.native
  def generate_n[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    n: scala.Double,
    gen: js.Function0[tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  def iter_swap[ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](x: ForwardIterator1, y: ForwardIterator2): scala.Unit = js.native
  def remove[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): InputIterator = js.native
  def remove_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def remove_copy_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def remove_if[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def replace[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    old_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Unit = js.native
  def replace_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_copy_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_if[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Unit = js.native
  def reverse[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def reverse_copy[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      OutputIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def rotate[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      OutputIterator
    ]
  ] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def shift_left[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shift_right[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shuffle[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def swap_ranges[ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def transform[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def unique[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def unique_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
}

