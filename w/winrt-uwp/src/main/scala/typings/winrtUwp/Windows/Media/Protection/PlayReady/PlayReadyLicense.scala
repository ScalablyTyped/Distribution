package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of a PlayReady license. */
trait PlayReadyLicense extends StObject {
  
  /** Gets the chain depth of the license chain represented by the current PlayReadyLicense class. */
  var chainDepth: Double
  
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: String
  
  /** Gets the expiration date of the current license. */
  var expirationDate: js.Date
  
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: Double
  
  /** Gets the state of the license. */
  var fullyEvaluated: Boolean
  
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: Double): String
  
  /** Gets whether this license is usable for playback. */
  var usableForPlay: Boolean
}
object PlayReadyLicense {
  
  inline def apply(
    chainDepth: Double,
    domainAccountID: String,
    expirationDate: js.Date,
    expireAfterFirstPlay: Double,
    fullyEvaluated: Boolean,
    getKIDAtChainDepth: Double => String,
    usableForPlay: Boolean
  ): PlayReadyLicense = {
    val __obj = js.Dynamic.literal(chainDepth = chainDepth.asInstanceOf[js.Any], domainAccountID = domainAccountID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expireAfterFirstPlay = expireAfterFirstPlay.asInstanceOf[js.Any], fullyEvaluated = fullyEvaluated.asInstanceOf[js.Any], getKIDAtChainDepth = js.Any.fromFunction1(getKIDAtChainDepth), usableForPlay = usableForPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyLicense]
  }
  
  extension [Self <: PlayReadyLicense](x: Self) {
    
    inline def setChainDepth(value: Double): Self = StObject.set(x, "chainDepth", value.asInstanceOf[js.Any])
    
    inline def setDomainAccountID(value: String): Self = StObject.set(x, "domainAccountID", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterFirstPlay(value: Double): Self = StObject.set(x, "expireAfterFirstPlay", value.asInstanceOf[js.Any])
    
    inline def setFullyEvaluated(value: Boolean): Self = StObject.set(x, "fullyEvaluated", value.asInstanceOf[js.Any])
    
    inline def setGetKIDAtChainDepth(value: Double => String): Self = StObject.set(x, "getKIDAtChainDepth", js.Any.fromFunction1(value))
    
    inline def setUsableForPlay(value: Boolean): Self = StObject.set(x, "usableForPlay", value.asInstanceOf[js.Any])
  }
}
