package typings.wonka

import typings.wonka.domShimMod.element
import typings.wonka.domShimMod.event
import typings.wonka.pipeMod.UnaryFn
import typings.wonka.reasonPervasivesShimMod.list
import typings.wonka.wonkaCallbagGenMod.callbagT
import typings.wonka.wonkaObservableGenMod.observableT
import typings.wonka.wonkaSinksGenMod.forEachConsumerT
import typings.wonka.wonkaSinksGenMod.subscribeConsumerT
import typings.wonka.wonkaTypesGenMod.observerT
import typings.wonka.wonkaTypesGenMod.operatorT
import typings.wonka.wonkaTypesGenMod.sinkT
import typings.wonka.wonkaTypesGenMod.sourceT
import typings.wonka.wonkaTypesGenMod.subjectT
import typings.wonka.wonkaTypesGenMod.subscriptionT
import typings.wonka.wonkaTypesGenMod.teardownT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buffer[a, b](_1: sourceT[a]): operatorT[b, js.Array[b]] = js.native
  def combine[a, b](_1: sourceT[a], _2: sourceT[b]): sourceT[js.Tuple2[a, b]] = js.native
  def concat[a](_1: js.Array[sourceT[a]]): sourceT[a] = js.native
  def concatAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def concatMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def debounce[a](_1: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  def delay[a](_1: Double): operatorT[a, a] = js.native
  def empty[a](_1: sinkT[a]): Unit = js.native
  def filter[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def flatten[T1](_1: sourceT[sourceT[T1]]): sourceT[T1] = js.native
  def forEach[a](_1: js.Function1[/* _1 */ a, Unit]): forEachConsumerT[a] = js.native
  def fromArray[a](_1: js.Array[a]): sourceT[a] = js.native
  def fromCallbag[T1](_1: callbagT[T1]): sourceT[T1] = js.native
  def fromDomEvent(_1: element, _2: String): sourceT[event] = js.native
  def fromList[a](_1: list[a]): sourceT[a] = js.native
  def fromObservable[T1](_1: observableT[T1]): sourceT[T1] = js.native
  def fromPromise[a](_1: js.Promise[a]): sourceT[a] = js.native
  def fromValue[a](_1: a): sourceT[a] = js.native
  def interval(_1: Double): sourceT[Double] = js.native
  def make[a](_1: js.Function1[/* _1 */ observerT[a], teardownT]): sourceT[a] = js.native
  def makeSubject[a](_1: Unit): subjectT[a] = js.native
  def map[a, b](_1: js.Function1[/* _1 */ a, b]): operatorT[a, b] = js.native
  def merge[a](_1: js.Array[sourceT[a]]): sourceT[a] = js.native
  def mergeAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def mergeMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def never[a](_1: sinkT[a]): Unit = js.native
  def onEnd[a](_1: js.Function0[Unit]): operatorT[a, a] = js.native
  def onPush[a](_1: js.Function1[/* _1 */ a, Unit]): operatorT[a, a] = js.native
  def onStart[a](_1: js.Function0[Unit]): operatorT[a, a] = js.native
  def pipe[T, R](source: sourceT[T], consumer: UnaryFn[sourceT[T], R]): R = js.native
  def pipe[T, A, B](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]], op2: UnaryFn[sourceT[A], sourceT[B]]): sourceT[B] = js.native
  def pipe[T, A, B, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    consumer: UnaryFn[sourceT[B], R]
  ): R = js.native
  def pipe[T, A, B, C, D](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]]
  ): sourceT[D] = js.native
  def pipe[T, A, B, C, D, E](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]]
  ): sourceT[E] = js.native
  def pipe[T, A, B, C, D, E, F](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]]
  ): sourceT[F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]]
  ): sourceT[G] = js.native
  def pipe[T, A, B, C, D, E, F, G, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    consumer: UnaryFn[sourceT[G], R]
  ): R = js.native
  def pipe[T, A, B, C, D, E, F, G, H, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    op8: UnaryFn[sourceT[G], sourceT[H]],
    consumer: UnaryFn[sourceT[H], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDEFGH_sourceT[T, A, B, C, D, E, F, G, H](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    op8: UnaryFn[sourceT[G], sourceT[H]]
  ): sourceT[H] = js.native
  @JSName("pipe")
  def pipe_TABCDEFR_R[T, A, B, C, D, E, F, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    consumer: UnaryFn[sourceT[F], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDER_R[T, A, B, C, D, E, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    consumer: UnaryFn[sourceT[E], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDR_R[T, A, B, C, D, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    consumer: UnaryFn[sourceT[D], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCR_R[T, A, B, C, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    consumer: UnaryFn[sourceT[C], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABC_sourceT[T, A, B, C](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]]
  ): sourceT[C] = js.native
  @JSName("pipe")
  def pipe_TAR_R[T, A, R](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]], consumer: UnaryFn[sourceT[A], R]): R = js.native
  @JSName("pipe")
  def pipe_TA_sourceT[T, A](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]]): sourceT[A] = js.native
  def publish[a](_1: sourceT[a]): subscriptionT = js.native
  def sample[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def scan[a, acc](_1: js.Function2[/* _1 */ acc, /* _2 */ a, acc], _2: acc): operatorT[a, acc] = js.native
  def share[a](_1: sourceT[a]): sourceT[a] = js.native
  def skip[a](_1: Double): operatorT[a, a] = js.native
  def skipUntil[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def skipWhile[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def subscribe[a](_1: js.Function1[/* _1 */ a, Unit]): subscribeConsumerT[a] = js.native
  def switchAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def switchMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def take[a](_1: Double): operatorT[a, a] = js.native
  def takeLast[a](_1: Double): operatorT[a, a] = js.native
  def takeUntil[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def takeWhile[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def tap[T1](_1: js.Function1[/* _1 */ T1, Unit]): operatorT[T1, T1] = js.native
  def throttle[a](_1: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  def toArray[a](_1: sourceT[a]): js.Array[a] = js.native
  def toCallbag[T1](_1: sourceT[T1]): callbagT[T1] = js.native
  def toObservable[T1](_1: sourceT[T1]): observableT[T1] = js.native
  def toPromise[a](_1: sourceT[a]): js.Promise[a] = js.native
}

