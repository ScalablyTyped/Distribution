package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.System.ProcessorArchitecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPackageId extends StObject {
  
  var architecture: ProcessorArchitecture
  
  var familyName: String
  
  var fullName: String
  
  var name: String
  
  var publisher: String
  
  var publisherId: String
  
  var resourceId: String
  
  var version: PackageVersion
}
object IPackageId {
  
  inline def apply(
    architecture: ProcessorArchitecture,
    familyName: String,
    fullName: String,
    name: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): IPackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageId]
  }
  
  extension [Self <: IPackageId](x: Self) {
    
    inline def setArchitecture(value: ProcessorArchitecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
