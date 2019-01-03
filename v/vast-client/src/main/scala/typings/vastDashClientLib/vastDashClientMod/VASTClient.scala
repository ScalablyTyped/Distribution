package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vast-client", "VASTClient")
@js.native
class VASTClient () extends js.Object {
  def this(/**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: scala.Double) = this()
  def this(/**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: scala.Double, /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: scala.Double) = this()
  def this(/**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: scala.Double, /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: scala.Double, /**
    * Optional custom storage to be used instead of the default one
    */
  customStorage: VASTClientCustomStorage) = this()
  var cappingFreeLunch: scala.Double = js.native
  var cappingMinimumTimeInterval: scala.Double = js.native
  var storage: VASTClientCustomStorage | stdLib.Storage = js.native
  /**
    * Fetch a URL and parse the response into a valid VAST object.
    *
    * @param url Contains the URL for fetching the VAST XML document.
    * @param options An optional set of key/value to configure the Ajax request
    */
  def get(url: java.lang.String): js.Promise[VastResponse] = js.native
  def get(url: java.lang.String, options: VastRequestOptions): js.Promise[VastResponse] = js.native
  /**
    * Resolves the next group of ads. If all is true resolves all the remaining ads.
    */
  def getNextAds(): js.Promise[VastResponse] = js.native
  def getNextAds(all: scala.Boolean): js.Promise[VastResponse] = js.native
  /**
    * Returns the instance of VASTParser used by the client to parse the VAST.
    * Use it to directly call a method provided by the VASTParser class.
    */
  def getParser(): VASTParser = js.native
  /**
    * Returns a boolean indicating if there are more ads to resolve for the current parsing.
    */
  def hasRemainingAds(): scala.Boolean = js.native
}

