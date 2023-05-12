package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityType
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesSearchEntitiesMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/search_entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchEntitiesFactory(buildUrl: BuildUrlFunction): js.Function1[/* param0 */ SearchEntitiesOptions, Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchEntitiesFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ SearchEntitiesOptions, Url]]
  
  trait SearchEntitiesOptions extends StObject {
    
    var continue: js.UndefOr[String | Double] = js.undefined
    
    var format: js.UndefOr[UrlResultFormat] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[String | Double] = js.undefined
    
    var search: String
    
    var `type`: js.UndefOr[EntityType] = js.undefined
    
    var uselang: js.UndefOr[String] = js.undefined
  }
  object SearchEntitiesOptions {
    
    inline def apply(search: String): SearchEntitiesOptions = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchEntitiesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchEntitiesOptions] (val x: Self) extends AnyVal {
      
      inline def setContinue(value: String | Double): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
      
      inline def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setType(value: EntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUselang(value: String): Self = StObject.set(x, "uselang", value.asInstanceOf[js.Any])
      
      inline def setUselangUndefined: Self = StObject.set(x, "uselang", js.undefined)
    }
  }
}
