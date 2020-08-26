package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveSurferBackend extends js.Object {
  def getPeaks(length: Double): js.Array[js.Array[Double] | Double] = js.native
  def getPeaks(length: Double, first: js.UndefOr[scala.Nothing], last: Double): js.Array[js.Array[Double] | Double] = js.native
  def getPeaks(length: Double, first: Double): js.Array[js.Array[Double] | Double] = js.native
  def getPeaks(length: Double, first: Double, last: Double): js.Array[js.Array[Double] | Double] = js.native
}

