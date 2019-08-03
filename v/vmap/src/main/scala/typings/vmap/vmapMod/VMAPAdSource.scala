package typings.vmap.vmapMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the player with either an inline ad response or a reference to an ad response
  */
trait VMAPAdSource extends js.Object {
  /**
    * Contains a URI to the VAST
    */
  var adTagURI: String
  /**
    * Indicates whether a VAST ad pod or multple buffet of ads can be served into an ad break
    */
  var allowMultipleAds: Boolean
  /**
    * Contains custom ad data
    */
  var customData: js.Any
  /**
    * Indicates whether the video player should honor the redirects within an ad response
    */
  var followRedirects: Boolean
  /**
    * Ad identifier for the ad source
    */
  var id: String
  /**
    * Contains an embedded VAST response
    */
  var vastAdData: Element
}

object VMAPAdSource {
  @scala.inline
  def apply(
    adTagURI: String,
    allowMultipleAds: Boolean,
    customData: js.Any,
    followRedirects: Boolean,
    id: String,
    vastAdData: Element
  ): VMAPAdSource = {
    val __obj = js.Dynamic.literal(adTagURI = adTagURI, allowMultipleAds = allowMultipleAds, customData = customData, followRedirects = followRedirects, id = id, vastAdData = vastAdData)
  
    __obj.asInstanceOf[VMAPAdSource]
  }
}

