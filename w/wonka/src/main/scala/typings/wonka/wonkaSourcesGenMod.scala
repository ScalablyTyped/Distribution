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
  def empty[a](sink: sinkT[a]): Unit = js.native
  def fromArray[a](arr: js.Array[a]): sourceT[a] = js.native
  def fromList[a](ls: list[a]): sourceT[a] = js.native
  def fromValue[a](x: a): sourceT[a] = js.native
  def make[a](f: js.Function1[/* _1 */ observerT[a], teardownT]): sourceT[a] = js.native
  def makeSubject[a](): subjectT[a] = js.native
  def never[a](sink: sinkT[a]): Unit = js.native
}

