package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyStorageProviderNamesStatics extends js.Object {
  
  var platformKeyStorageProvider: String = js.native
  
  var smartcardKeyStorageProvider: String = js.native
  
  var softwareKeyStorageProvider: String = js.native
}
object IKeyStorageProviderNamesStatics {
  
  @scala.inline
  def apply(
    platformKeyStorageProvider: String,
    smartcardKeyStorageProvider: String,
    softwareKeyStorageProvider: String
  ): IKeyStorageProviderNamesStatics = {
    val __obj = js.Dynamic.literal(platformKeyStorageProvider = platformKeyStorageProvider.asInstanceOf[js.Any], smartcardKeyStorageProvider = smartcardKeyStorageProvider.asInstanceOf[js.Any], softwareKeyStorageProvider = softwareKeyStorageProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
  
  @scala.inline
  implicit class IKeyStorageProviderNamesStaticsOps[Self <: IKeyStorageProviderNamesStatics] (val x: Self) extends AnyVal {
    
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
    def setPlatformKeyStorageProvider(value: String): Self = this.set("platformKeyStorageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartcardKeyStorageProvider(value: String): Self = this.set("smartcardKeyStorageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareKeyStorageProvider(value: String): Self = this.set("softwareKeyStorageProvider", value.asInstanceOf[js.Any])
  }
}
