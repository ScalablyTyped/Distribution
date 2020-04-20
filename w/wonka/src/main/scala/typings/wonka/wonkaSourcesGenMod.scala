package typings.wonka

import typings.wonka.reasonPervasivesShimMod.list
import typings.wonka.wonkaTypesGenMod.observerT
import typings.wonka.wonkaTypesGenMod.sinkT
import typings.wonka.wonkaTypesGenMod.sourceT
import typings.wonka.wonkaTypesGenMod.subjectT
import typings.wonka.wonkaTypesGenMod.teardownT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/Wonka_sources.gen", JSImport.Namespace)
@js.native
object wonkaSourcesGenMod extends js.Object {
  def empty[a](_1: sinkT[a]): Unit = js.native
  def fromArray[a](_1: js.Array[a]): sourceT[a] = js.native
  def fromList[a](_1: list[a]): sourceT[a] = js.native
  def fromValue[a](_1: a): sourceT[a] = js.native
  def make[a](_1: js.Function1[/* _1 */ observerT[a], teardownT]): sourceT[a] = js.native
  def makeSubject[a](_1: Unit): subjectT[a] = js.native
  def never[a](_1: sinkT[a]): Unit = js.native
}

