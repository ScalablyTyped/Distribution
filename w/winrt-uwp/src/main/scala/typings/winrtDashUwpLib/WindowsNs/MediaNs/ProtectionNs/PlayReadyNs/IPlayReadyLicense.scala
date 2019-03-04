package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a PlayReady license. */
trait IPlayReadyLicense extends js.Object {
  /** Gets the chain depth of the license chain represented by the current IPlayReadyLicense interface. */
  var chainDepth: scala.Double
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: java.lang.String
  /** Gets the expiration date of the current license. */
  var expirationDate: stdLib.Date
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: scala.Double
  /** Gets the state of the license. */
  var fullyEvaluated: scala.Boolean
  /** Gets whether this license is usable for playback. */
  var usableForPlay: scala.Boolean
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: scala.Double): java.lang.String
}

object IPlayReadyLicense {
  @scala.inline
  def apply(
    chainDepth: scala.Double,
    domainAccountID: java.lang.String,
    expirationDate: stdLib.Date,
    expireAfterFirstPlay: scala.Double,
    fullyEvaluated: scala.Boolean,
    getKIDAtChainDepth: js.Function1[scala.Double, java.lang.String],
    usableForPlay: scala.Boolean
  ): IPlayReadyLicense = {
    val __obj = js.Dynamic.literal(chainDepth = chainDepth, domainAccountID = domainAccountID, expirationDate = expirationDate, expireAfterFirstPlay = expireAfterFirstPlay, fullyEvaluated = fullyEvaluated, getKIDAtChainDepth = getKIDAtChainDepth, usableForPlay = usableForPlay)
  
    __obj.asInstanceOf[IPlayReadyLicense]
  }
}

