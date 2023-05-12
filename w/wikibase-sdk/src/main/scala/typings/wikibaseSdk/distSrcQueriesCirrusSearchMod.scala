package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesOptionsMod.UrlResultFormat
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesCirrusSearchMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/cirrus_search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cirrusSearchPagesFactory(buildUrl: BuildUrlFunction): js.Function1[/* options */ CirrusSearchPagesOptions, Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("cirrusSearchPagesFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ CirrusSearchPagesOptions, Url]]
  
  trait CirrusSearchPagesOptions extends StObject {
    
    var format: js.UndefOr[UrlResultFormat] = js.undefined
    
    var haswbstatement: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[String | Double] = js.undefined
    
    var namespace: js.UndefOr[String | (js.Array[Double | String]) | Double] = js.undefined
    
    var offset: js.UndefOr[String | Double] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var prop: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[String] = js.undefined
  }
  object CirrusSearchPagesOptions {
    
    inline def apply(): CirrusSearchPagesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CirrusSearchPagesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CirrusSearchPagesOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: UrlResultFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHaswbstatement(value: String | js.Array[String]): Self = StObject.set(x, "haswbstatement", value.asInstanceOf[js.Any])
      
      inline def setHaswbstatementUndefined: Self = StObject.set(x, "haswbstatement", js.undefined)
      
      inline def setHaswbstatementVarargs(value: String*): Self = StObject.set(x, "haswbstatement", js.Array(value*))
      
      inline def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNamespace(value: String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNamespaceVarargs(value: (Double | String)*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setOffset(value: String | Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setProp(value: String | js.Array[String]): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setPropVarargs(value: String*): Self = StObject.set(x, "prop", js.Array(value*))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
