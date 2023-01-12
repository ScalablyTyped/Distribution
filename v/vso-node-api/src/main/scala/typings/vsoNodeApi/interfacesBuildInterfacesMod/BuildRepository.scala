package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildRepository extends StObject {
  
  /**
    * Indicates whether to checkout submodules.
    */
  var checkoutSubmodules: Boolean
  
  /**
    * Indicates whether to clean the target folder when getting code from the repository.
    */
  var clean: String
  
  /**
    * The name of the default branch.
    */
  var defaultBranch: String
  
  /**
    * The ID of the repository.
    */
  var id: String
  
  /**
    * The friendly name of the repository.
    */
  var name: String
  
  var properties: StringDictionary[String]
  
  /**
    * The root folder.
    */
  var rootFolder: String
  
  /**
    * The type of the repository.
    */
  var `type`: String
  
  /**
    * The URL of the repository.
    */
  var url: String
}
object BuildRepository {
  
  inline def apply(
    checkoutSubmodules: Boolean,
    clean: String,
    defaultBranch: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    rootFolder: String,
    `type`: String,
    url: String
  ): BuildRepository = {
    val __obj = js.Dynamic.literal(checkoutSubmodules = checkoutSubmodules.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildRepository] (val x: Self) extends AnyVal {
    
    inline def setCheckoutSubmodules(value: Boolean): Self = StObject.set(x, "checkoutSubmodules", value.asInstanceOf[js.Any])
    
    inline def setClean(value: String): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    inline def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRootFolder(value: String): Self = StObject.set(x, "rootFolder", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
