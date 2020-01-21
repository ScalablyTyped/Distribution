package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of a PlayReady license. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicense")
@js.native
abstract class PlayReadyLicense () extends js.Object {
  /** Gets the chain depth of the license chain represented by the current PlayReadyLicense class. */
  var chainDepth: Double = js.native
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: String = js.native
  /** Gets the expiration date of the current license. */
  var expirationDate: Date = js.native
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: Double = js.native
  /** Gets the state of the license. */
  var fullyEvaluated: Boolean = js.native
  /** Gets whether this license is usable for playback. */
  var usableForPlay: Boolean = js.native
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: Double): String = js.native
}

