package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/sorting", JSImport.Namespace)
@js.native
object algorithmSortingMod extends js.Object {
  def is_sorted[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_sorted_until[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def nth_element[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def nth_element[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def partial_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def partial_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def partial_sort_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): RandomAccessIterator = js.native
  def sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def stable_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def stable_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
}

