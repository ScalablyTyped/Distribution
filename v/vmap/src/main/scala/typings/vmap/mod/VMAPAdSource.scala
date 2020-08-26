package typings.vmap.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the player with either an inline ad response or a reference to an ad response
  */
@js.native
trait VMAPAdSource extends js.Object {
  /**
    * Contains a URI to the VAST
    */
  var adTagURI: String = js.native
  /**
    * Indicates whether a VAST ad pod or multple buffet of ads can be served into an ad break
    */
  var allowMultipleAds: Boolean = js.native
  /**
    * Contains custom ad data
    */
  var customData: js.Any = js.native
  /**
    * Indicates whether the video player should honor the redirects within an ad response
    */
  var followRedirects: Boolean = js.native
  /**
    * Ad identifier for the ad source
    */
  var id: String = js.native
  /**
    * Contains an embedded VAST response
    */
  var vastAdData: Element = js.native
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
    val __obj = js.Dynamic.literal(adTagURI = adTagURI.asInstanceOf[js.Any], allowMultipleAds = allowMultipleAds.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], vastAdData = vastAdData.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPAdSource]
  }
  @scala.inline
  implicit class VMAPAdSourceOps[Self <: VMAPAdSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdTagURI(value: String): Self = this.set("adTagURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowMultipleAds(value: Boolean): Self = this.set("allowMultipleAds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVastAdData(value: Element): Self = this.set("vastAdData", value.asInstanceOf[js.Any])
  }
  
}

