package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/heap", JSImport.Namespace)
@js.native
object algorithmHeapMod extends js.Object {
  def is_heap[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Boolean = js.native
  def is_heap[RandomAccessIterator /* <: stdLib.Readonly[
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
  ): scala.Boolean = js.native
  def is_heap_until[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[RandomAccessIterator /* <: stdLib.Readonly[
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
  ): RandomAccessIterator = js.native
  def make_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def make_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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
  def pop_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def pop_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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
  def push_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def push_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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
  def sort_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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

