package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactResource extends StObject {
  
  var _links: js.Any = js.native
  
  /**
    * Type-specific data about the artifact.
    */
  var data: String = js.native
  
  /**
    * A link to download the resource.
    */
  var downloadUrl: String = js.native
  
  /**
    * Type-specific properties of the artifact.
    */
  var properties: StringDictionary[String] = js.native
  
  /**
    * The type of the resource: File container, version control folder, UNC path, etc.
    */
  var `type`: String = js.native
  
  /**
    * The full http link to the resource.
    */
  var url: String = js.native
}
object ArtifactResource {
  
  @scala.inline
  def apply(
    _links: js.Any,
    data: String,
    downloadUrl: String,
    properties: StringDictionary[String],
    `type`: String,
    url: String
  ): ArtifactResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactResource]
  }
  
  @scala.inline
  implicit class ArtifactResourceMutableBuilder[Self <: ArtifactResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
