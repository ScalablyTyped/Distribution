package typings.winrt.Windows.Networking

import typings.winrt.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHostName extends StObject {
  
  var canonicalName: String = js.native
  
  var displayName: String = js.native
  
  var iPInformation: IPInformation = js.native
  
  def isEqual(hostName: HostName): Boolean = js.native
  
  var rawName: String = js.native
  
  var `type`: HostNameType = js.native
}
object IHostName {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IHostNameMutableBuilder[Self <: IHostName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPInformation(value: IPInformation): Self = StObject.set(x, "iPInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: HostName => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HostNameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
