package typings.wonka

import typings.wonka.wonkaTypesGenMod.operatorT
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/Wonka_operators.gen", JSImport.Namespace)
@js.native
object wonkaOperatorsGenMod extends js.Object {
  def buffer[a, b](_1: sourceT[a]): operatorT[b, js.Array[b]] = js.native
  def combine[a, b](_1: sourceT[a], _2: sourceT[b]): sourceT[js.Tuple2[a, b]] = js.native
  def concat[a](_1: js.Array[sourceT[a]]): sourceT[a] = js.native
  def concatAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def concatMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def filter[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def flatten[T1](_1: sourceT[sourceT[T1]]): sourceT[T1] = js.native
  def map[a, b](_1: js.Function1[/* _1 */ a, b]): operatorT[a, b] = js.native
  def merge[a](_1: js.Array[sourceT[a]]): sourceT[a] = js.native
  def mergeAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def mergeMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def onEnd[a](_1: js.Function0[Unit]): operatorT[a, a] = js.native
  def onPush[a](_1: js.Function1[/* _1 */ a, Unit]): operatorT[a, a] = js.native
  def onStart[a](_1: js.Function0[Unit]): operatorT[a, a] = js.native
  def sample[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def scan[a, acc](_1: js.Function2[/* _1 */ acc, /* _2 */ a, acc], _2: acc): operatorT[a, acc] = js.native
  def share[a](_1: sourceT[a]): sourceT[a] = js.native
  def skip[a](_1: Double): operatorT[a, a] = js.native
  def skipUntil[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def skipWhile[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def switchAll[a](_1: sourceT[sourceT[a]]): sourceT[a] = js.native
  def switchMap[a, b](_1: js.Function1[/* _1 */ a, sourceT[b]]): operatorT[a, b] = js.native
  def take[a](_1: Double): operatorT[a, a] = js.native
  def takeLast[a](_1: Double): operatorT[a, a] = js.native
  def takeUntil[a, b](_1: sourceT[a]): operatorT[b, b] = js.native
  def takeWhile[a](_1: js.Function1[/* _1 */ a, Boolean]): operatorT[a, a] = js.native
  def tap[T1](_1: js.Function1[/* _1 */ T1, Unit]): operatorT[T1, T1] = js.native
}

