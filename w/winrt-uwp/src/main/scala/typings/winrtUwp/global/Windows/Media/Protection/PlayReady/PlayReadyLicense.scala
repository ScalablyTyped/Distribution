package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of a PlayReady license. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicense")
@js.native
abstract class PlayReadyLicense ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicense {
  
  /** Gets the chain depth of the license chain represented by the current PlayReadyLicense class. */
  /* CompleteClass */
  var chainDepth: Double = js.native
  
  /** Gets the domain account identifier to which this license is bound. */
  /* CompleteClass */
  var domainAccountID: String = js.native
  
  /** Gets the expiration date of the current license. */
  /* CompleteClass */
  var expirationDate: Date = js.native
  
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  /* CompleteClass */
  var expireAfterFirstPlay: Double = js.native
  
  /** Gets the state of the license. */
  /* CompleteClass */
  var fullyEvaluated: Boolean = js.native
  
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  /* CompleteClass */
  override def getKIDAtChainDepth(chainDepth: Double): String = js.native
  
  /** Gets whether this license is usable for playback. */
  /* CompleteClass */
  var usableForPlay: Boolean = js.native
}
