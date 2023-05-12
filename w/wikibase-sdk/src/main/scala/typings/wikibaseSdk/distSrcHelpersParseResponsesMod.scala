package typings.wikibaseSdk

import typings.wikibaseSdk.anon.Search
import typings.wikibaseSdk.distSrcTypesEntityMod.Entities
import typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersParseResponsesMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/parse_responses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entities(res: WbGetEntitiesResponse): SimplifiedEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("entities")(res.asInstanceOf[js.Any]).asInstanceOf[SimplifiedEntities]
  
  inline def pagesTitles(res: CirrusSearchPagesResponse): Titles = ^.asInstanceOf[js.Dynamic].applyDynamic("pagesTitles")(res.asInstanceOf[js.Any]).asInstanceOf[Titles]
  
  trait CirrusSearchPagesResponse extends StObject {
    
    var query: Search
  }
  object CirrusSearchPagesResponse {
    
    inline def apply(query: Search): CirrusSearchPagesResponse = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirrusSearchPagesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CirrusSearchPagesResponse] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: Search): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait CirrusSearchResult extends StObject {
    
    var title: Title
  }
  object CirrusSearchResult {
    
    inline def apply(title: Title): CirrusSearchResult = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirrusSearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CirrusSearchResult] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Title = String
  
  type Titles = js.Array[String]
  
  trait WbGetEntitiesResponse extends StObject {
    
    var entities: Entities
  }
  object WbGetEntitiesResponse {
    
    inline def apply(entities: Entities): WbGetEntitiesResponse = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
      __obj.asInstanceOf[WbGetEntitiesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WbGetEntitiesResponse] (val x: Self) extends AnyVal {
      
      inline def setEntities(value: Entities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    }
  }
}
