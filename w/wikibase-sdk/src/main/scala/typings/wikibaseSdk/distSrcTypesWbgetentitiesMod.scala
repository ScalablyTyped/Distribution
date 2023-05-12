package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.wikibaseSdkBooleans.`true`
import typings.wikibaseSdk.wikibaseSdkStrings.no
import typings.wikibaseSdk.wikibaseSdkStrings.wbgetentities
import typings.wikibaseSdk.wikibaseSdkStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesWbgetentitiesMod {
  
  trait WbGetEntities extends StObject {
    
    var action: wbgetentities
    
    var format: UrlResultFormat
    
    var ids: js.UndefOr[String] = js.undefined
    
    var languages: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[`true`] = js.undefined
    
    var props: js.UndefOr[String] = js.undefined
    
    var redirects: js.UndefOr[yes | no] = js.undefined
    
    var sites: js.UndefOr[String] = js.undefined
    
    var titles: js.UndefOr[String] = js.undefined
  }
  object WbGetEntities {
    
    inline def apply(format: UrlResultFormat): WbGetEntities = {
      val __obj = js.Dynamic.literal(action = "wbgetentities", format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[WbGetEntities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WbGetEntities] (val x: Self) extends AnyVal {
      
      inline def setAction(value: wbgetentities): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setLanguages(value: String): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setProps(value: String): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRedirects(value: yes | no): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setSites(value: String): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
      
      inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
      
      inline def setTitles(value: String): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    }
  }
}
