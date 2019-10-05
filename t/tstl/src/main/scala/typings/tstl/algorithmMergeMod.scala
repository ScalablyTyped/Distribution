package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/merge", JSImport.Namespace)
@js.native
object algorithmMergeMod extends js.Object {
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): Boolean = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): Boolean = js.native
  def inplace_merge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def inplace_merge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Unit = js.native
  def merge[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
}

