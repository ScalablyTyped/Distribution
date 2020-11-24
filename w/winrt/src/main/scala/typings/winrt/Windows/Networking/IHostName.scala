package typings.winrt.Windows.Networking

import typings.winrt.Windows.Networking.Connectivity.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHostName extends js.Object {
  
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
  implicit class IHostNameOps[Self <: IHostName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanonicalName(value: String): Self = this.set("canonicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPInformation(value: IPInformation): Self = this.set("iPInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: HostName => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRawName(value: String): Self = this.set("rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HostNameType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
