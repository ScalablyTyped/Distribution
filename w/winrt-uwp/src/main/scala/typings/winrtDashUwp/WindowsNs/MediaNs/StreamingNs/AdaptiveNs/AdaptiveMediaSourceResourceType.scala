package typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdaptiveMediaSourceResourceType extends js.Object

/** Specifies the type of an adaptive media resource. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType")
@js.native
object AdaptiveMediaSourceResourceType extends js.Object {
  /** The resource is an initialization segment. */
  @js.native
  sealed trait initializationSegment extends AdaptiveMediaSourceResourceType
  
  /** The resource is a cryptographic initialization vector. */
  @js.native
  sealed trait initializationVector extends AdaptiveMediaSourceResourceType
  
  /** The resource is an encryption key. */
  @js.native
  sealed trait key extends AdaptiveMediaSourceResourceType
  
  /** The resource is an adaptive streaming manifest. */
  @js.native
  sealed trait manifest extends AdaptiveMediaSourceResourceType
  
  /** The resource is a media segment. */
  @js.native
  sealed trait mediaSegment extends AdaptiveMediaSourceResourceType
  
  /* 1 */ val initializationSegment: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType.initializationSegment with Double = js.native
  /* 4 */ val initializationVector: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType.initializationVector with Double = js.native
  /* 3 */ val key: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType.key with Double = js.native
  /* 0 */ val manifest: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType.manifest with Double = js.native
  /* 2 */ val mediaSegment: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType.mediaSegment with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdaptiveMediaSourceResourceType with Double] = js.native
}

