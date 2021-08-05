package typings.umbraco.umbraco.services

import typings.umbraco.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search content
  */
trait ISearchContent extends StObject {
  
  var editorPath: String
  
  var id: Double
  
  var menuUrl: String
  
  var metaData: Url
  
  var subTitle: String
}
object ISearchContent {
  
  inline def apply(editorPath: String, id: Double, menuUrl: String, metaData: Url, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchContent]
  }
  
  extension [Self <: ISearchContent](x: Self) {
    
    inline def setEditorPath(value: String): Self = StObject.set(x, "editorPath", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMenuUrl(value: String): Self = StObject.set(x, "menuUrl", value.asInstanceOf[js.Any])
    
    inline def setMetaData(value: Url): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
  }
}
