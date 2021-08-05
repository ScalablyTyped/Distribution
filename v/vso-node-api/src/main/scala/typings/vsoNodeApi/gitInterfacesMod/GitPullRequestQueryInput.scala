package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestQueryInput extends StObject {
  
  /**
    * The list of commit IDs to search for.
    */
  var items: js.Array[String]
  
  /**
    * The type of query to perform.
    */
  var `type`: GitPullRequestQueryType
}
object GitPullRequestQueryInput {
  
  inline def apply(items: js.Array[String], `type`: GitPullRequestQueryType): GitPullRequestQueryInput = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestQueryInput]
  }
  
  extension [Self <: GitPullRequestQueryInput](x: Self) {
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setType(value: GitPullRequestQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
