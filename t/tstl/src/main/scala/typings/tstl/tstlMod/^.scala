package typings.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Date
import typings.std.Pick
import typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typings.tstl.baseDisposableIPartialContainersMod._IEmpty
import typings.tstl.baseDisposableIPartialContainersMod._IInsert
import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import typings.tstl.baseDisposableIPartialContainersMod._ISize
import typings.tstl.containerVectorMod.VectorNs.Iterator
import typings.tstl.containerVectorMod.VectorNs.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import typings.tstl.numericIComputableMod.IComputable
import typings.tstl.numericINegatableMod.INegatable
import typings.tstl.numericOperationsMod.BinaryOperator
import typings.tstl.numericOperatorsMod.Param
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.tstlStrings.lock
import typings.tstl.tstlStrings.try_lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val barrier: Instantiable1[/* size */ Double, typings.tstl.threadBarrierMod.Barrier] = js.native
  val condition_variable: Instantiable0[typings.tstl.threadConditionVariableMod.ConditionVariable] = js.native
  var domain_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: Instantiable0[typings.tstl.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: Instantiable0[typings.tstl.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: Instantiable0[typings.tstl.exceptionErrorConditionMod.ErrorCondition] = js.native
  val exception: Instantiable0[typings.tstl.exceptionExceptionMod.Exception] = js.native
  val flex_barrier: Instantiable2[
    /* size */ Double, 
    js.UndefOr[/* complete */ js.Function0[Double]], 
    typings.tstl.threadFlexBarrierMod.FlexBarrier
  ] = js.native
  var invalid_argument: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.InvalidArgument] = js.native
  val latch: Instantiable1[/* size */ Double, typings.tstl.threadLatchMod.Latch] = js.native
  var length_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.LengthError] = js.native
  var logic_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.LogicError] = js.native
  val mutex: Instantiable0[typings.tstl.threadMutexMod.Mutex] = js.native
  var out_of_range: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.OutOfRange] = js.native
  var overflow_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.OverflowError] = js.native
  val pair: Instantiable2[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam First */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Second */ /* second */ js.Any, 
    typings.tstl.utilityPairMod.Pair[js.Object, js.Object]
  ] = js.native
  val queue: Instantiable0[typings.tstl.containerQueueMod.Queue[js.Object]] = js.native
  var range_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.RangeError] = js.native
  var runtime_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.RuntimeError] = js.native
  val shared_mutex: Instantiable0[typings.tstl.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: Instantiable0[typings.tstl.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val stack: Instantiable0[typings.tstl.containerStackMod.Stack[js.Object]] = js.native
  var system_error: Instantiable2[
    /* code */ typings.tstl.exceptionErrorCodeMod.ErrorCode, 
    js.UndefOr[/* message */ String], 
    typings.tstl.exceptionSystemErrorMod.SystemError
  ] = js.native
  val timed_mutex: Instantiable0[typings.tstl.threadTimedMutexMod.TimedMutex] = js.native
  var underflow_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.UnderflowError] = js.native
  def accumulate[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def accumulate[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T, op: BinaryOperator[T, T]): T = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def adjacent_find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def advance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  def all_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def any_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def assoc_laguerre(n: Double, m: Double, x: Double): Double = js.native
  def assoc_legendre(n: Double, m: Double, x: Double): Double = js.native
  def back_inserter[T](source: js.Array[T]): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, typings.tstl.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: _IPushBack[T] */](source: Source): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): Iterator[T] = js.native
  def begin[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def beta(x: Double, y: Double): Double = js.native
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Boolean = js.native
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def bit_and(x: Double, y: Double): Double = js.native
  def bit_or(x: Double, y: Double): Double = js.native
  def bit_xor(x: Double, y: Double): Double = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def comp_ellint_1(k: Double): Double = js.native
  def comp_ellint_2(k: Double): Double = js.native
  def comp_ellint_3(k: Double, n: Double): Double = js.native
  def copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IBidirectionalIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def copy_n[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, n: Double, output: OutputIterator): OutputIterator = js.native
  def count[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): Double = js.native
  def count_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Double = js.native
  def cyl_bessel_i(n: Double, x: Double): Double = js.native
  def cyl_bessel_j(n: Double, x: Double): Double = js.native
  def cyl_bessel_k(n: Double, x: Double): Double = js.native
  def cyl_neumann(v: Double, x: Double): Double = js.native
  def distance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def divides[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def ellint_1(k: Double, phi: Double): Double = js.native
  def ellint_2(k: Double, phi: Double): Double = js.native
  def ellint_3(k: Double, v: Double, phi: Double): Double = js.native
  def empty(source: _IEmpty): Boolean = js.native
  def empty[T](source: js.Array[T]): Boolean = js.native
  def end[T](container: js.Array[T]): Iterator[T] = js.native
  def end[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): Boolean = js.native
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator2], Boolean]
  ): Boolean = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_to[T](x: T, y: T): Boolean = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: BinaryOperator[T, T]
  ): OutputIterator = js.native
  def expint(x: Double): Double = js.native
  def fill[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
  def fill_n[OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](first: OutputIterator, n: Double, `val`: ValueType[OutputIterator]): OutputIterator = js.native
  def find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  def find_end[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Iterator1 = js.native
  def find_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def find_if_not[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def for_each[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, n: Double, fn: Func): InputIterator = js.native
  def front_inserter[T, Source /* <: _IPushFront[T] */](source: Source): typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def gcd(x: Double, y: Double): Double = js.native
  def generate[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[ValueType[ForwardIterator]]): Unit = js.native
  def generate_n[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
  def get_terminate(): js.UndefOr[js.Function0[Unit]] = js.native
  def get_uid(): Double = js.native
  def get_uid(obj: js.Object): Double = js.native
  def greater[T](x: T, y: T): Boolean = js.native
  def greater_equal[T](x: T, y: T): Boolean = js.native
  def hash(items: js.Any*): Double = js.native
  def hermite(n: Double, x: Double): Double = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): Boolean = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): Boolean = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: BinaryOperator[T, T],
    init: T
  ): OutputIterator = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X]
  ): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X],
    op2: BinaryOperator[X, Y]
  ): X = js.native
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
  def inserter[T](container: js.Array[T], it: Iterator[T]): typings.tstl.iteratorInsertIteratorMod.InsertIterator[typings.tstl.containerVectorMod.Vector[T], Iterator[T]] = js.native
  def inserter[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def iota[ForwardIterator /* <: General[IForwardIterator[Double, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, value: Double): Unit = js.native
  def is_heap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): Boolean = js.native
  def is_heap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def is_heap_until[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): RandomAccessIterator = js.native
  def is_node(): Boolean = js.native
  def is_partitioned[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[/* x */ ValueType[ForwardIterator1], /* y */ ValueType[ForwardIterator1], Boolean]
  ): Boolean = js.native
  def is_sorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Boolean = js.native
  def is_sorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def is_sorted_until[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def iter_swap[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): Unit = js.native
  def laguerre(n: Double, x: Double): Double = js.native
  def lcm(x: Double, y: Double): Double = js.native
  def legendre(n: Double, x: Double): Double = js.native
  def less[T](x: T, y: T): Boolean = js.native
  def less_equal[T](x: T, y: T): Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator1], Boolean]
  ): Boolean = js.native
  def lgamma(x: Double): Double = js.native
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  def logical_and[T](x: T, y: T): Boolean = js.native
  def logical_not[T](x: T): Boolean = js.native
  def logical_or[T](x: T, y: T): Boolean = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def make_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def make_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def make_pair[First, Second](first: First, second: Second): typings.tstl.utilityPairMod.Pair[First, Second] = js.native
  def make_reverse_iterator[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
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
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def min_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): typings.tstl.utilityPairMod.Pair[T, T] = js.native
  def minmax_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): typings.tstl.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minus[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): typings.tstl.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): typings.tstl.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def modules[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: Double): Ret = js.native
  def negate[Ret](x: INegatable[Ret]): Ret = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def next_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def next_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def none_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def not_equal_to[T](x: T, y: T): Boolean = js.native
  def nth_element[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def nth_element[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: General[IForwardIterator[ValueType[InputIterator], RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: General[IForwardIterator[ValueType[InputIterator], RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): RandomAccessIterator = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ ValueType[InputIterator], ValueType[InputIterator]]
  ): typings.tstl.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def plus[Y, Ret](x: String, y: Y): Ret = js.native
  def plus[Y, Ret](x: Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typings.tstl.tstlStrings.plus with (IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
  def pop_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def pop_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def prev_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def push_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def push_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def randint(x: Double, y: Double): Double = js.native
  def rbegin[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
  def remove[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  def remove_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
  def remove_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def remove_if[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def rend[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rend[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
  def replace[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def replace_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_if[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def reverse[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def reverse_copy[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def riemann_zeta(arg: Double): Double = js.native
  def rotate[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], OutputIterator]] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def sample[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: Double): OutputIterator = js.native
  def search[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator2], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: js.Function2[/* x */ ValueType[ForwardIterator1], /* y */ ValueType[ForwardIterator2], Boolean]
  ): ForwardIterator1 = js.native
  def search_n[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, count: Double, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def search_n[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: Double,
    `val`: ValueType[ForwardIterator],
    pred: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
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
  def set_terminate(func: js.Function0[Unit]): Unit = js.native
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
  def shift_left[ForwardIterator /* <: General[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shift_right[ForwardIterator /* <: General[IBidirectionalIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shuffle[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def size(source: _ISize): Double = js.native
  def size[T](source: js.Array[T]): Double = js.native
  def sleep_for(ms: Double): js.Promise[Unit] = js.native
  def sleep_until(at: Date): js.Promise[Unit] = js.native
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def sort_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def sph_bessel(n: Double, x: Double): Double = js.native
  def sph_neumann(n: Double, x: Double): Double = js.native
  def stable_partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
  def stable_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def stable_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def swap_ranges[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def terminate(): Unit = js.native
  def tgamma(x: Double): Double = js.native
  def transform[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[/* val */ ValueType[InputIterator], ValueType[OutputIterator]]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[
      /* x */ ValueType[InputIterator1], 
      /* y */ ValueType[InputIterator2], 
      ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def transform_exclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: General[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
}

