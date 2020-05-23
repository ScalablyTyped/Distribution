package typings.wonka

import typings.wonka.wonkaTypesGenMod.operatorT
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/Wonka_operators.gen", JSImport.Namespace)
@js.native
object wonkaOperatorsGenMod extends js.Object {
  def buffer[a, b](notifier: sourceT[a]): operatorT[b, js.Array[b]] = js.native
  def combine[a, b](sourceA: sourceT[a], sourceB: sourceT[b]): sourceT[js.Tuple2[a, b]] = js.native
  def concat[a](sources: js.Array[sourceT[a]]): sourceT[a] = js.native
  def concatAll[a](source: sourceT[sourceT[a]]): sourceT[a] = js.native
  def concatMap[a, b](f: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def filter[a](f: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def flatten[T1](_1: sourceT[sourceT[T1]]): sourceT[T1] = js.native
  def map[a, b](f: js.Function1[/* _1 */ a, b]): operatorT[a, b] = js.native
  def merge[a](sources: js.Array[sourceT[a]]): sourceT[a] = js.native
  def mergeAll[a](source: sourceT[sourceT[a]]): sourceT[a] = js.native
  def mergeMap[a, b](f: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def onEnd[a](f: js.Function0[Unit]): operatorT[a, a] = js.native
  def onPush[a](f: js.Function1[/* _1 */ a, Unit]): operatorT[a, a] = js.native
  def onStart[a](f: js.Function0[Unit]): operatorT[a, a] = js.native
  def sample[a, b](notifier: sourceT[a]): operatorT[b, b] = js.native
  def scan[a, acc](f: js.Function2[/* _1 */ acc, /* _2 */ a, acc], seed: acc): operatorT[a, acc] = js.native
  def share[a](source: sourceT[a]): sourceT[a] = js.native
  def skip[a](wait: Double): operatorT[a, a] = js.native
  def skipUntil[a, b](notifier: sourceT[a]): operatorT[b, b] = js.native
  def skipWhile[a](f: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def switchAll[a](source: sourceT[sourceT[a]]): sourceT[a] = js.native
  def switchMap[a, b](f: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def take[a](max: Double): operatorT[a, a] = js.native
  def takeLast[a](max: Double): operatorT[a, a] = js.native
  def takeUntil[a, b](notifier: sourceT[a]): operatorT[b, b] = js.native
  def takeWhile[a](f: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def tap[T1](_1: js.Function1[/* _1 */ T1, Unit]): operatorT[T1, T1] = js.native
}

