package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a PlayReady license. */
@js.native
trait IPlayReadyLicense extends StObject {
  
  /** Gets the chain depth of the license chain represented by the current IPlayReadyLicense interface. */
  var chainDepth: Double = js.native
  
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: String = js.native
  
  /** Gets the expiration date of the current license. */
  var expirationDate: Date = js.native
  
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: Double = js.native
  
  /** Gets the state of the license. */
  var fullyEvaluated: Boolean = js.native
  
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: Double): String = js.native
  
  /** Gets whether this license is usable for playback. */
  var usableForPlay: Boolean = js.native
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
  
  @scala.inline
  implicit class IPlayReadyLicenseMutableBuilder[Self <: IPlayReadyLicense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChainDepth(value: Double): Self = StObject.set(x, "chainDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAccountID(value: String): Self = StObject.set(x, "domainAccountID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterFirstPlay(value: Double): Self = StObject.set(x, "expireAfterFirstPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyEvaluated(value: Boolean): Self = StObject.set(x, "fullyEvaluated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKIDAtChainDepth(value: Double => String): Self = StObject.set(x, "getKIDAtChainDepth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsableForPlay(value: Boolean): Self = StObject.set(x, "usableForPlay", value.asInstanceOf[js.Any])
  }
}
