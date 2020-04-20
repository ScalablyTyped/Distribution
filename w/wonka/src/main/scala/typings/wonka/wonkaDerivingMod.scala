package typings.wonka

import typings.wonka.jsShimMod.signalT
import typings.wonka.jsShimMod.talkbackT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/helpers/Wonka_deriving", JSImport.Namespace)
@js.native
object wonkaDerivingMod extends js.Object {
  val close: talkbackT = js.native
  val pull: talkbackT = js.native
  def end[a](): signalT[a] = js.native
  def isEnd[a](s: signalT[a]): Boolean = js.native
  def isPush[a](s: signalT[a]): Boolean = js.native
  def isStart[a](s: signalT[a]): Boolean = js.native
  def push[a](x: a): signalT[a] = js.native
  def start[a](tb: talkbackCb): signalT[a] = js.native
  def unboxPush[a](s: signalT[a]): a = js.native
  def unboxStart[a](s: signalT[a]): talkbackCb = js.native
  type talkbackCb = js.Function1[/* tb */ typings.wonka.wonkaTypesGenMod.talkbackT, Unit]
}

