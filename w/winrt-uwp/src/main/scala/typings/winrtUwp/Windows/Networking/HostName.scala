package typings.winrtUwp.Windows.Networking

import typings.winrtUwp.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a hostname or an IP address. */
trait HostName extends StObject {
  
  /** Gets the canonical name for the HostName object. */
  var canonicalName: String
  
  /** Gets the display name for the HostName object. */
  var displayName: String
  
  /** Gets the IPInformation object for a local IP address assigned to a HostName object. */
  var ipInformation: IPInformation
  
  /**
    * Determines whether the specified HostName object has an equivalent value to the current HostName object.
    * @param hostName A HostName object that is compared with the current HostName.
    * @return A Boolean value that indicates whether the specified HostName object is equal to the current HostName object.
    */
  def isEqual(hostName: HostName): Boolean
  
  /** Gets the original string used to construct the HostName object. */
  var rawName: String
  
  /** Gets the HostNameType of the HostName object. */
  var `type`: HostNameType
}
object HostName {
  
  inline def apply(
    canonicalName: String,
    displayName: String,
    ipInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): HostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], ipInformation = ipInformation.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rawName = rawName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostName] (val x: Self) extends AnyVal {
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIpInformation(value: IPInformation): Self = StObject.set(x, "ipInformation", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: HostName => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    inline def setType(value: HostNameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
