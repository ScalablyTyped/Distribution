package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPackage extends StObject {
  
  var dependencies: IVectorView[Package] = js.native
  
  var description: String = js.native
  
  var displayName: String = js.native
  
  var id: PackageId = js.native
  
  var installedLocation: StorageFolder = js.native
  
  var isBundle: Boolean = js.native
  
  var isDevelopmentMode: Boolean = js.native
  
  var isFramework: Boolean = js.native
  
  var isResourcePackage: Boolean = js.native
  
  var logo: Uri = js.native
  
  var publisherDisplayName: String = js.native
}
object IPackage {
  
  @scala.inline
  def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    id: PackageId,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    logo: Uri,
    publisherDisplayName: String
  ): IPackage = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackage]
  }
  
  @scala.inline
  implicit class IPackageMutableBuilder[Self <: IPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: IVectorView[Package]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledLocation(value: StorageFolder): Self = StObject.set(x, "installedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDevelopmentMode(value: Boolean): Self = StObject.set(x, "isDevelopmentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFramework(value: Boolean): Self = StObject.set(x, "isFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResourcePackage(value: Boolean): Self = StObject.set(x, "isResourcePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: Uri): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
  }
}
