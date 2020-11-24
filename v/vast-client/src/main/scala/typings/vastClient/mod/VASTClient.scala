package typings.vastClient.mod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vast-client", "VASTClient")
@js.native
class VASTClient () extends js.Object {
  def this(/**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: Double) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: js.UndefOr[scala.Nothing],
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: Double
  ) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: Double,
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: Double
  ) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: js.UndefOr[scala.Nothing],
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: js.UndefOr[scala.Nothing],
    /**
    * Optional custom storage to be used instead of the default one
    */
  customStorage: VASTClientCustomStorage
  ) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: js.UndefOr[scala.Nothing],
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: Double,
    /**
    * Optional custom storage to be used instead of the default one
    */
  customStorage: VASTClientCustomStorage
  ) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: Double,
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: js.UndefOr[scala.Nothing],
    /**
    * Optional custom storage to be used instead of the default one
    */
  customStorage: VASTClientCustomStorage
  ) = this()
  def this(
    /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  cappingFreeLunch: Double,
    /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  cappingMinimumTimeInterval: Double,
    /**
    * Optional custom storage to be used instead of the default one
    */
  customStorage: VASTClientCustomStorage
  ) = this()
  
  var cappingFreeLunch: Double = js.native
  
  var cappingMinimumTimeInterval: Double = js.native
  
  /**
    * Fetch a URL and parse the response into a valid VAST object.
    *
    * @param url Contains the URL for fetching the VAST XML document.
    * @param options An optional set of key/value to configure the Ajax request
    */
  def get(url: String): js.Promise[VastResponse] = js.native
  def get(url: String, options: VastRequestOptions): js.Promise[VastResponse] = js.native
  
  /**
    * Resolves the next group of ads. If all is true resolves all the remaining ads.
    */
  def getNextAds(): js.Promise[VastResponse] = js.native
  def getNextAds(all: Boolean): js.Promise[VastResponse] = js.native
  
  /**
    * Returns the instance of VASTParser used by the client to parse the VAST.
    * Use it to directly call a method provided by the VASTParser class.
    */
  def getParser(): VASTParser = js.native
  
  /**
    * Returns a boolean indicating if there are more ads to resolve for the current parsing.
    */
  def hasRemainingAds(): Boolean = js.native
  
  var storage: VASTClientCustomStorage | Storage = js.native
}
