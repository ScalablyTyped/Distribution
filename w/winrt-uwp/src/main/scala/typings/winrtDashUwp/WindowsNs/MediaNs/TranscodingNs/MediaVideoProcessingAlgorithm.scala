package typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaVideoProcessingAlgorithm extends js.Object

/** Defines the available algorithms used by the Transcode Video Processor (XVP). */
@JSGlobal("Windows.Media.Transcoding.MediaVideoProcessingAlgorithm")
@js.native
object MediaVideoProcessingAlgorithm extends js.Object {
  /** Default video processing algorithm. This algorithm prefers performance, speed, and space over quality. This algorithm will makes use of hardware. */
  @js.native
  sealed trait default extends MediaVideoProcessingAlgorithm
  
  /** Prefers quality over performance. This mode always runs in software and insures that hardware implementations, which may differ from the XVP are not used. */
  @js.native
  sealed trait mrfCrf444 extends MediaVideoProcessingAlgorithm
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.MediaVideoProcessingAlgorithm.default with Double = js.native
  /* 1 */ val mrfCrf444: typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.MediaVideoProcessingAlgorithm.mrfCrf444 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaVideoProcessingAlgorithm with Double] = js.native
}

