package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.Props
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.distSrcTypesOptionsMod.WmLanguageCode
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Site
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetEntitiesFromSitelinksMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_entities_from_sitelinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEntitiesFromSitelinksFactory(buildUrl: BuildUrlFunction): js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitiesFromSitelinksFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url]]
  
  trait GetEntitiesFromSitelinksOptions extends StObject {
    
    var format: js.UndefOr[UrlResultFormat] = js.undefined
    
    var languages: js.UndefOr[WmLanguageCode | js.Array[WmLanguageCode]] = js.undefined
    
    var props: js.UndefOr[Props | js.Array[Props]] = js.undefined
    
    var redirects: js.UndefOr[Boolean] = js.undefined
    
    var sites: js.UndefOr[Site | js.Array[Site]] = js.undefined
    
    var titles: String | js.Array[String]
  }
  object GetEntitiesFromSitelinksOptions {
    
    inline def apply(titles: String | js.Array[String]): GetEntitiesFromSitelinksOptions = {
      val __obj = js.Dynamic.literal(titles = titles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEntitiesFromSitelinksOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetEntitiesFromSitelinksOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLanguages(value: WmLanguageCode | js.Array[WmLanguageCode]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: WmLanguageCode*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setProps(value: Props | js.Array[Props]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: Props*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setRedirects(value: Boolean): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setSites(value: Site | js.Array[Site]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
      
      inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
      
      inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
      
      inline def setTitles(value: String | js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      inline def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value*))
    }
  }
}
