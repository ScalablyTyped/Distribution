package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRepository extends StObject {
  
  /**
    * The name of the default branch.
    */
  var defaultBranch: String = js.native
  
  /**
    * The full name of the repository.
    */
  var fullName: String = js.native
  
  /**
    * The ID of the repository.
    */
  var id: String = js.native
  
  /**
    * The friendly name of the repository.
    */
  var name: String = js.native
  
  var properties: StringDictionary[String] = js.native
  
  /**
    * The name of the source provider the repository is from.
    */
  var sourceProviderName: String = js.native
  
  /**
    * The URL of the repository.
    */
  var url: String = js.native
}
object SourceRepository {
  
  @scala.inline
  def apply(
    defaultBranch: String,
    fullName: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    sourceProviderName: String,
    url: String
  ): SourceRepository = {
    val __obj = js.Dynamic.literal(defaultBranch = defaultBranch.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sourceProviderName = sourceProviderName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepository]
  }
  
  @scala.inline
  implicit class SourceRepositoryMutableBuilder[Self <: SourceRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceProviderName(value: String): Self = StObject.set(x, "sourceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
