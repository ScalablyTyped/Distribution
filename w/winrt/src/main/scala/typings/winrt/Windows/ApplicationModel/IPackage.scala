package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPackage extends StObject {
  
  var dependencies: IVectorView[Package]
  
  var description: String
  
  var displayName: String
  
  var id: PackageId
  
  var installedLocation: StorageFolder
  
  var isBundle: Boolean
  
  var isDevelopmentMode: Boolean
  
  var isFramework: Boolean
  
  var isResourcePackage: Boolean
  
  var logo: Uri
  
  var publisherDisplayName: String
}
object IPackage {
  
  inline def apply(
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
  
  extension [Self <: IPackage](x: Self) {
    
    inline def setDependencies(value: IVectorView[Package]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstalledLocation(value: StorageFolder): Self = StObject.set(x, "installedLocation", value.asInstanceOf[js.Any])
    
    inline def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopmentMode(value: Boolean): Self = StObject.set(x, "isDevelopmentMode", value.asInstanceOf[js.Any])
    
    inline def setIsFramework(value: Boolean): Self = StObject.set(x, "isFramework", value.asInstanceOf[js.Any])
    
    inline def setIsResourcePackage(value: Boolean): Self = StObject.set(x, "isResourcePackage", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: Uri): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
  }
}
