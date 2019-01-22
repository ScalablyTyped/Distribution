package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val condition_variable: org.scalablytyped.runtime.Instantiable0[tstlLib.threadConditionVariableMod.ConditionVariable] = js.native
  var domain_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorConditionMod.ErrorCondition] = js.native
  val exception: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionExceptionMod.Exception] = js.native
  var invalid_argument: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.InvalidArgument] = js.native
  var length_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.LengthError] = js.native
  var logic_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.LogicError] = js.native
  val mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadMutexMod.Mutex] = js.native
  var out_of_range: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.OutOfRange] = js.native
  var overflow_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.OverflowError] = js.native
  val pair: org.scalablytyped.runtime.Instantiable2[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam First */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Second */ /* second */ js.Any, 
    tstlLib.utilityPairMod.Pair[js.Object, js.Object]
  ] = js.native
  val queue: org.scalablytyped.runtime.Instantiable0[tstlLib.containerQueueMod.Queue[js.Object]] = js.native
  var range_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.RangeError] = js.native
  var runtime_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.RuntimeError] = js.native
  val shared_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val stack: org.scalablytyped.runtime.Instantiable0[tstlLib.containerStackMod.Stack[js.Object]] = js.native
  var system_error: org.scalablytyped.runtime.Instantiable2[
    /* code */ tstlLib.exceptionErrorCodeMod.ErrorCode, 
    /* message */ js.UndefOr[/* message */ java.lang.String], 
    tstlLib.exceptionSystemErrorMod.SystemError
  ] = js.native
  val timed_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadTimedMutexMod.TimedMutex] = js.native
  var underflow_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.UnderflowError] = js.native
  def accumulate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def accumulate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    init: T,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): T = js.native
  def adjacent_difference[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def advance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def all_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def any_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def assoc_laguerre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def assoc_legendre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def back_inserter[T](source: js.Array[T]): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, tstlLib.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */](source: Source): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def begin[T, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[T, Iterator]): Iterator = js.native
  def beta(x: scala.Double, y: scala.Double): scala.Double = js.native
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Boolean = js.native
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def bit_and(x: scala.Double, y: scala.Double): scala.Double = js.native
  def bit_or(x: scala.Double, y: scala.Double): scala.Double = js.native
  def bit_xor(x: scala.Double, y: scala.Double): scala.Double = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def comp_ellint_1(k: scala.Double): scala.Double = js.native
  def comp_ellint_2(k: scala.Double): scala.Double = js.native
  def comp_ellint_3(k: scala.Double, n: scala.Double): scala.Double = js.native
  def copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[T, BidirectionalIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator1]
  ] */, BidirectionalIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator2]
  ] */](first: BidirectionalIterator1, last: BidirectionalIterator1, output: BidirectionalIterator2): BidirectionalIterator2 = js.native
  def copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): OutputIterator = js.native
  def copy_n[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, n: scala.Double, output: OutputIterator): OutputIterator = js.native
  def count[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): scala.Double = js.native
  def count_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Double = js.native
  def cyl_bessel_i(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_j(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_k(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_neumann(v: scala.Double, x: scala.Double): scala.Double = js.native
  def distance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def divides[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def ellint_1(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_2(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_3(k: scala.Double, v: scala.Double, phi: scala.Double): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def end[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def end[T, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[T, Iterator]): Iterator = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_to[T](x: T, y: T): scala.Boolean = js.native
  def exclusive_scan[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def expint(x: scala.Double): scala.Double = js.native
  def fill[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Unit = js.native
  def fill_n[T, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: OutputIterator, n: scala.Double, `val`: T): OutputIterator = js.native
  def find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): InputIterator = js.native
  def find_end[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): Iterator1 = js.native
  def find_first_of[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): Iterator1 = js.native
  def find_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def find_if_not[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def for_each[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, Func /* <: js.Function1[/* val */ T, scala.Unit] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, Func /* <: js.Function1[/* val */ T, scala.Unit] */](first: InputIterator, n: scala.Double, fn: Func): InputIterator = js.native
  def front_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */](source: Source): tstlLib.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def gcd(x: scala.Double, y: scala.Double): scala.Double = js.native
  def generate[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[T]): scala.Unit = js.native
  def generate_n[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, n: scala.Double, gen: js.Function0[T]): ForwardIterator = js.native
  def get_terminate(): js.Function0[scala.Unit] = js.native
  def get_uid(obj: js.Object): scala.Double = js.native
  def greater[T](x: T, y: T): scala.Boolean = js.native
  def greater_equal[T](x: T, y: T): scala.Boolean = js.native
  def hash(items: js.Any*): scala.Double = js.native
  def hermite(n: scala.Double, x: scala.Double): scala.Double = js.native
  def includes[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): scala.Boolean = js.native
  def includes[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def inclusive_scan[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T],
    init: T
  ): OutputIterator = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: tstlLib.numericOperationsMod.BinaryOperator[X, X]
  ): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: tstlLib.numericOperationsMod.BinaryOperator[X, X],
    op2: tstlLib.numericOperationsMod.BinaryOperator[X, Y]
  ): X = js.native
  def inplace_merge[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def inplace_merge[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def inserter[T](container: js.Array[T], it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): tstlLib.iteratorInsertIteratorMod.InsertIterator[
    T, 
    tstlLib.containerVectorMod.Vector[T], 
    tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ] = js.native
  def inserter[T, Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[T, Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: Container, it: Iterator): tstlLib.iteratorInsertIteratorMod.InsertIterator[T, Container, Iterator] = js.native
  def iota[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[scala.Double, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, value: scala.Double): scala.Unit = js.native
  def is_heap[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Boolean = js.native
  def is_heap[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def is_heap_until[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): RandomAccessIterator = js.native
  def is_node(): scala.Boolean = js.native
  def is_partitioned[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean = js.native
  def is_permutation[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): scala.Boolean = js.native
  def is_permutation[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Boolean = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def iter_swap[T, ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): scala.Unit = js.native
  def laguerre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def lcm(x: scala.Double, y: scala.Double): scala.Double = js.native
  def legendre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def less[T](x: T, y: T): scala.Boolean = js.native
  def less_equal[T](x: T, y: T): scala.Boolean = js.native
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def lgamma(x: scala.Double): scala.Double = js.native
  @JSName("lock")
  def lock_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.lock])*): js.Promise[scala.Unit] = js.native
  def logical_and[T](x: T, y: T): scala.Boolean = js.native
  def logical_not[T](x: T): scala.Boolean = js.native
  def logical_or[T](x: T, y: T): scala.Boolean = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def make_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def make_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def make_pair[First, Second](first: First, second: Second): tstlLib.utilityPairMod.Pair[First, Second] = js.native
  def make_reverse_iterator[T, IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def max_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def merge[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def min_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): tstlLib.utilityPairMod.Pair[T, T] = js.native
  def minmax_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minus[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def modules[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[X /* <: scala.Double | tstlLib.numericINegatableMod.INegatable[Ret] */, Ret](x: X): Ret = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def next_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def next_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    compare: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def none_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def not_equal_to[T](x: T, y: T): scala.Boolean = js.native
  def nth_element[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def nth_element[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* left */ T, /* right */ T, scala.Boolean]
  ): scala.Unit = js.native
  def partial_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def partial_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def partial_sort_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): RandomAccessIterator = js.native
  def partial_sum[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator1]] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ T, T]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): ForwardIterator = js.native
  def plus[X /* <: tstlLib.numericOperatorsMod.PlusParam[Y, Ret] */, Y, Ret](x: X, y: Y): Ret = js.native
  def pop_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def pop_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
  def prev_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def prev_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def push_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def push_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def randint(x: scala.Double, y: scala.Double): scala.Double = js.native
  def rbegin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rbegin[T, Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, Iterator, ReverseIterator] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, Iterator, ReverseIterator] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[T, Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def remove[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): InputIterator = js.native
  def remove_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: T): OutputIterator = js.native
  def remove_copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): OutputIterator = js.native
  def remove_if[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def rend[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rend[T, Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, Iterator, ReverseIterator] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, Iterator, ReverseIterator] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[T, Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def replace[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, old_val: T, new_val: T): scala.Unit = js.native
  def replace_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, old_val: T, new_val: T): OutputIterator = js.native
  def replace_copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ T, scala.Boolean],
    new_val: T
  ): OutputIterator = js.native
  def replace_if[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ T, scala.Boolean],
    new_val: T
  ): scala.Unit = js.native
  def reverse[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def reverse_copy[T, BidirectionalIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def riemann_zeta(arg: scala.Double): scala.Double = js.native
  def rotate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def sample[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: scala.Double): OutputIterator = js.native
  def search[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator1 = js.native
  def search_n[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, count: scala.Double, `val`: T): ForwardIterator = js.native
  def search_n[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: T,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def set_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_intersection[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_symmetric_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_terminate(func: js.Function0[scala.Unit]): scala.Unit = js.native
  def set_union[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def shift_left[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shift_right[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shuffle[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
  def sleep_for(ms: scala.Double): js.Promise[scala.Unit] = js.native
  def sleep_until(at: stdLib.Date): js.Promise[scala.Unit] = js.native
  def sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def sort_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def sph_bessel(n: scala.Double, x: scala.Double): scala.Double = js.native
  def sph_neumann(n: scala.Double, x: scala.Double): scala.Double = js.native
  def stable_partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
  def stable_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def stable_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def swap_ranges[T, ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def terminate(): scala.Unit = js.native
  def tgamma(x: scala.Double): scala.Double = js.native
  def transform[T, Ret, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform[T, Ret, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[/* x */ T, /* y */ T, Ret]
  ): OutputIterator = js.native
  def transform_exclusive_scan[T, Ret, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
  @JSName("try_lock")
  def try_lock_try_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.try_lock])*): js.Promise[scala.Double] = js.native
  def unique[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def unique_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
}

