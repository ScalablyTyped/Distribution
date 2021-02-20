package typings.tern.anon

import typings.tern.ternMod.PropertiesQuery
import typings.tern.ternMod.PropertiesQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryPropertiesQuery extends StObject {
  
  var query: PropertiesQuery = js.native
  
  var result: PropertiesQueryResult = js.native
}
object QueryPropertiesQuery {
  
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): QueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPropertiesQuery]
  }
  
  @scala.inline
  implicit class QueryPropertiesQueryMutableBuilder[Self <: QueryPropertiesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: PropertiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: PropertiesQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
