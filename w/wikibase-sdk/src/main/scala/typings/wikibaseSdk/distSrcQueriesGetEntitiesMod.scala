package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesOptionsMod.Props
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.distSrcTypesOptionsMod.WmLanguageCode
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetEntitiesMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEntitiesFactory(buildUrl: BuildUrlFunction): js.Function1[/* param0 */ GetEntitiesOptions, Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitiesFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ GetEntitiesOptions, Url]]
  
  trait GetEntitiesOptions extends StObject {
    
    var format: js.UndefOr[UrlResultFormat] = js.undefined
    
    var ids: EntityId | js.Array[EntityId]
    
    var languages: js.UndefOr[WmLanguageCode | js.Array[WmLanguageCode]] = js.undefined
    
    var props: js.UndefOr[Props | js.Array[Props]] = js.undefined
    
    var redirects: js.UndefOr[Boolean] = js.undefined
  }
  object GetEntitiesOptions {
    
    inline def apply(ids: EntityId | js.Array[EntityId]): GetEntitiesOptions = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEntitiesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetEntitiesOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIds(value: EntityId | js.Array[EntityId]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: EntityId*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setLanguages(value: WmLanguageCode | js.Array[WmLanguageCode]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: WmLanguageCode*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setProps(value: Props | js.Array[Props]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: Props*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setRedirects(value: Boolean): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    }
  }
}
