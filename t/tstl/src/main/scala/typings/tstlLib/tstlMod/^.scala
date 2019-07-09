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
    js.UndefOr[/* message */ java.lang.String], 
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
  def adjacent_difference[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def adjacent_find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def advance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def all_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def any_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def assoc_laguerre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def assoc_legendre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def back_inserter[T](source: js.Array[T]): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, tstlLib.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */](source: Source): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def begin[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def beta(x: scala.Double, y: scala.Double): scala.Double = js.native
  def binary_search[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): scala.Boolean = js.native
  def binary_search[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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
  def bit_and(x: scala.Double, y: scala.Double): scala.Double = js.native
  def bit_or(x: scala.Double, y: scala.Double): scala.Double = js.native
  def bit_xor(x: scala.Double, y: scala.Double): scala.Double = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def comp_ellint_1(k: scala.Double): scala.Double = js.native
  def comp_ellint_2(k: scala.Double): scala.Double = js.native
  def comp_ellint_3(k: scala.Double, n: scala.Double): scala.Double = js.native
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
  def count[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Double = js.native
  def count_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Double = js.native
  def cyl_bessel_i(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_j(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_k(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_neumann(v: scala.Double, x: scala.Double): scala.Double = js.native
  def distance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def divides[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def ellint_1(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_2(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_3(k: scala.Double, v: scala.Double, phi: scala.Double): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def end[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def end[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def equal[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def equal_range[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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
  def equal_to[T](x: T, y: T): scala.Boolean = js.native
  def exclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def expint(x: scala.Double): scala.Double = js.native
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
  def find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): InputIterator = js.native
  def find_end[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): Iterator1 = js.native
  def find_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def find_if_not[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def for_each[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, n: scala.Double, fn: Func): InputIterator = js.native
  def front_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */](source: Source): tstlLib.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def gcd(x: scala.Double, y: scala.Double): scala.Double = js.native
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
  def get_terminate(): js.UndefOr[js.Function0[scala.Unit]] = js.native
  def get_uid(): scala.Double = js.native
  def get_uid(obj: js.Object): scala.Double = js.native
  def greater[T](x: T, y: T): scala.Boolean = js.native
  def greater_equal[T](x: T, y: T): scala.Boolean = js.native
  def hash(items: js.Any*): scala.Double = js.native
  def hermite(n: scala.Double, x: scala.Double): scala.Double = js.native
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
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
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
  def inserter[T](container: js.Array[T], it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): tstlLib.iteratorInsertIteratorMod.InsertIterator[
    tstlLib.containerVectorMod.Vector[T], 
    tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ] = js.native
  def inserter[Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): tstlLib.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def iota[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[scala.Double, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, value: scala.Double): scala.Unit = js.native
  def is_heap[RandomAccessIterator /* <: tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
    RandomAccessIterator
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Boolean = js.native
  def is_heap[RandomAccessIterator /* <: tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
    RandomAccessIterator
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_heap_until[RandomAccessIterator /* <: tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
    RandomAccessIterator
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[RandomAccessIterator /* <: tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
    RandomAccessIterator
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): RandomAccessIterator = js.native
  def is_node(): scala.Boolean = js.native
  def is_partitioned[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator2
  ] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): scala.Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator2
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
  def is_sorted[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_sorted_until[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
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
  def laguerre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def lcm(x: scala.Double, y: scala.Double): scala.Double = js.native
  def legendre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def less[T](x: T, y: T): scala.Boolean = js.native
  def less_equal[T](x: T, y: T): scala.Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def lgamma(x: scala.Double): scala.Double = js.native
  @JSName("lock")
  def lock_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.lock])*): js.Promise[scala.Unit] = js.native
  def logical_and[T](x: T, y: T): scala.Boolean = js.native
  def logical_not[T](x: T): scala.Boolean = js.native
  def logical_or[T](x: T, y: T): scala.Boolean = js.native
  def lower_bound[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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
  def make_pair[First, Second](first: First, second: Second): tstlLib.utilityPairMod.Pair[First, Second] = js.native
  def make_reverse_iterator[IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def max_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
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
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def min_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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
  def minmax_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](first: ForwardIterator, last: ForwardIterator): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minus[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def mismatch[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def modules[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: scala.Double): Ret = js.native
  def negate[Ret](x: tstlLib.numericINegatableMod.INegatable[Ret]): Ret = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
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
  def none_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def not_equal_to[T](x: T, y: T): scala.Boolean = js.native
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
  def partial_sort_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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
  def partial_sort_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
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
  def partial_sum[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator1]
  ] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator2]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
    ]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def plus[Y, Ret](x: java.lang.String, y: Y): Ret = js.native
  def plus[Y, Ret](x: scala.Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ tstlLib.tstlLibStrings.plus with (tstlLib.numericIComputableMod.IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
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
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
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
  def randint(x: scala.Double, y: scala.Double): scala.Double = js.native
  def rbegin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
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
  def rend[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rend[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
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
  def riemann_zeta(arg: scala.Double): scala.Double = js.native
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
  def sample[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: scala.Double): OutputIterator = js.native
  def search[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator2
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator2], 
    ForwardIterator2
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator2], 
      scala.Boolean
    ]
  ): ForwardIterator1 = js.native
  def search_n[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def search_n[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
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
  def set_terminate(func: js.Function0[scala.Unit]): scala.Unit = js.native
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
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
  def sleep_for(ms: scala.Double): js.Promise[scala.Unit] = js.native
  def sleep_until(at: stdLib.Date): js.Promise[scala.Unit] = js.native
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
  def sph_bessel(n: scala.Double, x: scala.Double): scala.Double = js.native
  def sph_neumann(n: scala.Double, x: scala.Double): scala.Double = js.native
  def stable_partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
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
  def terminate(): scala.Unit = js.native
  def tgamma(x: scala.Double): scala.Double = js.native
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
  def transform_exclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.try_lock])*): js.Promise[scala.Double] = js.native
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
  def upper_bound[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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

