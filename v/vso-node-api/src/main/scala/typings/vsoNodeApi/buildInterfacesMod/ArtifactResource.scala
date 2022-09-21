package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactResource extends StObject {
  
  var _links: Any
  
  /**
    * Type-specific data about the artifact.
    */
  var data: String
  
  /**
    * A link to download the resource.
    */
  var downloadUrl: String
  
  /**
    * Type-specific properties of the artifact.
    */
  var properties: StringDictionary[String]
  
  /**
    * The type of the resource: File container, version control folder, UNC path, etc.
    */
  var `type`: String
  
  /**
    * The full http link to the resource.
    */
  var url: String
}
object ArtifactResource {
  
  inline def apply(
    _links: Any,
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
  
  extension [Self <: ArtifactResource](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
