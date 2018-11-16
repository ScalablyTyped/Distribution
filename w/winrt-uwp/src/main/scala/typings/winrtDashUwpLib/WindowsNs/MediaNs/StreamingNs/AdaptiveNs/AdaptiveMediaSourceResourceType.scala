package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

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
  sealed trait initializationSegment
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType
  
  /** The resource is a cryptographic initialization vector. */
  @js.native
  sealed trait initializationVector
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType
  
  /** The resource is an encryption key. */
  @js.native
  sealed trait key
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType
  
  /** The resource is an adaptive streaming manifest. */
  @js.native
  sealed trait manifest
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType
  
  /** The resource is a media segment. */
  @js.native
  sealed trait mediaSegment
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType
  
  val initializationSegment: initializationSegment with java.lang.String = js.native
  val initializationVector: initializationVector with java.lang.String = js.native
  val key: key with java.lang.String = js.native
  val manifest: manifest with java.lang.String = js.native
  val mediaSegment: mediaSegment with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceResourceType with java.lang.String
  ] = js.native
}

