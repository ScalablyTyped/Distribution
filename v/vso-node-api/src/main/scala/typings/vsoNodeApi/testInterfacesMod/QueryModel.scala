package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryModel extends StObject {
  
  var query: String
}
object QueryModel {
  
  @scala.inline
  def apply(query: String): QueryModel = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryModel]
  }
  
  @scala.inline
  implicit class QueryModelMutableBuilder[Self <: QueryModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
