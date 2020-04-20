package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a PlayReady license. */
trait IPlayReadyLicense extends js.Object {
  /** Gets the chain depth of the license chain represented by the current IPlayReadyLicense interface. */
  var chainDepth: Double
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: String
  /** Gets the expiration date of the current license. */
  var expirationDate: Date
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: Double
  /** Gets the state of the license. */
  var fullyEvaluated: Boolean
  /** Gets whether this license is usable for playback. */
  var usableForPlay: Boolean
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: Double): String
}

object IPlayReadyLicense {
  @scala.inline
  def apply(
    chainDepth: Double,
    domainAccountID: String,
    expirationDate: Date,
    expireAfterFirstPlay: Double,
    fullyEvaluated: Boolean,
    getKIDAtChainDepth: Double => String,
    usableForPlay: Boolean
  ): IPlayReadyLicense = {
    val __obj = js.Dynamic.literal(chainDepth = chainDepth.asInstanceOf[js.Any], domainAccountID = domainAccountID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expireAfterFirstPlay = expireAfterFirstPlay.asInstanceOf[js.Any], fullyEvaluated = fullyEvaluated.asInstanceOf[js.Any], getKIDAtChainDepth = js.Any.fromFunction1(getKIDAtChainDepth), usableForPlay = usableForPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyLicense]
  }
}

