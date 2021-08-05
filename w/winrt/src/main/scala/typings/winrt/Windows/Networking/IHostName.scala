package typings.winrt.Windows.Networking

import typings.winrt.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHostName extends StObject {
  
  var canonicalName: String
  
  var displayName: String
  
  var iPInformation: IPInformation
  
  def isEqual(hostName: HostName): Boolean
  
  var rawName: String
  
  var `type`: HostNameType
}
object IHostName {
  
  inline def apply(
    canonicalName: String,
    displayName: String,
    iPInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): IHostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], iPInformation = iPInformation.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rawName = rawName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHostName]
  }
  
  extension [Self <: IHostName](x: Self) {
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIPInformation(value: IPInformation): Self = StObject.set(x, "iPInformation", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: HostName => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    inline def setType(value: HostNameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
