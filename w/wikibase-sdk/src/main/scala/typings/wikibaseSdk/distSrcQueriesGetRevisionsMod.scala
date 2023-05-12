package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityPageTitle
import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetRevisionsMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_revisions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRevisionsFactory(buildUrl: BuildUrlFunction): js.Function1[/* param0 */ GetRevisionsOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRevisionsFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ GetRevisionsOptions, String]]
  
  trait GetRevisionsOptions extends StObject {
    
    var end: js.UndefOr[js.Date | String | Double] = js.undefined
    
    var excludeuser: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[UrlResultFormat] = js.undefined
    
    var ids: EntityPageTitle | js.Array[EntityPageTitle]
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var prop: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var start: js.UndefOr[js.Date | String | Double] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object GetRevisionsOptions {
    
    inline def apply(ids: EntityPageTitle | js.Array[EntityPageTitle]): GetRevisionsOptions = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRevisionsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRevisionsOptions] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: js.Date | String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setExcludeuser(value: String): Self = StObject.set(x, "excludeuser", value.asInstanceOf[js.Any])
      
      inline def setExcludeuserUndefined: Self = StObject.set(x, "excludeuser", js.undefined)
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIds(value: EntityPageTitle | js.Array[EntityPageTitle]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: EntityPageTitle*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setProp(value: String | js.Array[String]): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setPropVarargs(value: String*): Self = StObject.set(x, "prop", js.Array(value*))
      
      inline def setStart(value: js.Date | String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
