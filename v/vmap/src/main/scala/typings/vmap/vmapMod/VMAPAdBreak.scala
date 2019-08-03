package typings.vmap.vmapMod

import typings.vmap.vmapStrings.display
import typings.vmap.vmapStrings.linear
import typings.vmap.vmapStrings.nonlinear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about an ad break
  */
@js.native
trait VMAPAdBreak extends js.Object {
  /**
    * A VMAPAdSource object
    */
  var adSource: VMAPAdSource = js.native
  /**
    * An optional string identifier for the ad break
    */
  var breakId: js.UndefOr[String] = js.native
  /**
    * Identifies whether the ad break allows "linear", "nonlinear" or "display" ads
    */
  var breakType: linear | nonlinear | display = js.native
  /**
    * An array of VMAPExtension objects
    */
  var extensions: js.Array[VMAPExtension] = js.native
  /**
    * An option used to distribute ad breaks equally spaced apart from one another along a linear timeline
    */
  var repeatAfter: String = js.native
  /**
    * Represents the timing of the ad break
    */
  var timeOffset: String = js.native
  /**
    * An array of VMAPTrackingEvent objects with tracking URLs
    */
  var trackingEvents: js.Array[VMAPTrackingEvent] = js.native
  /**
    * Call the trackers for the given event with an option error code parameter for error events
    */
  def track(event: String): Unit = js.native
  def track(event: String, errorCode: String): Unit = js.native
}

