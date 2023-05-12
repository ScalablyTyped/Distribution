package typings.wikibaseSdk

import typings.wikibaseSdk.anon.Language
import typings.wikibaseSdk.anon.SearchString
import typings.wikibaseSdk.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesSearchMod {
  
  trait SearchResponse extends StObject {
    
    var error: js.UndefOr[_empty] = js.undefined
    
    var search: js.Array[SearchResult]
    
    var `search-continue`: Double
    
    var searchinfo: SearchString
    
    var servedby: String
    
    var success: Double
  }
  object SearchResponse {
    
    inline def apply(
      search: js.Array[SearchResult],
      `search-continue`: Double,
      searchinfo: SearchString,
      servedby: String,
      success: Double
    ): SearchResponse = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any], searchinfo = searchinfo.asInstanceOf[js.Any], servedby = servedby.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.updateDynamic("search-continue")(`search-continue`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: _empty): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSearch(value: js.Array[SearchResult]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def `setSearch-continue`(value: Double): Self = StObject.set(x, "search-continue", value.asInstanceOf[js.Any])
      
      inline def setSearchVarargs(value: SearchResult*): Self = StObject.set(x, "search", js.Array(value*))
      
      inline def setSearchinfo(value: SearchString): Self = StObject.set(x, "searchinfo", value.asInstanceOf[js.Any])
      
      inline def setServedby(value: String): Self = StObject.set(x, "servedby", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResult extends StObject {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var concepturi: String
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var label: String
    
    var `match`: Language
    
    var pageid: Double
    
    var repository: String
    
    var title: String
    
    var url: String
  }
  object SearchResult {
    
    inline def apply(
      concepturi: String,
      id: String,
      label: String,
      `match`: Language,
      pageid: Double,
      repository: String,
      title: String,
      url: String
    ): SearchResult = {
      val __obj = js.Dynamic.literal(concepturi = concepturi.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], pageid = pageid.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setConcepturi(value: String): Self = StObject.set(x, "concepturi", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Language): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setPageid(value: Double): Self = StObject.set(x, "pageid", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
