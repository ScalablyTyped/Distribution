package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderQuery extends StObject {
  
  /**
    * Contextual information to pass to the data providers
    */
  var context: DataProviderContext
  
  /**
    * The contribution ids of the data providers to resolve
    */
  var contributionIds: js.Array[String]
}
object DataProviderQuery {
  
  inline def apply(context: DataProviderContext, contributionIds: js.Array[String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderQuery]
  }
  
  extension [Self <: DataProviderQuery](x: Self) {
    
    inline def setContext(value: DataProviderContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContributionIds(value: js.Array[String]): Self = StObject.set(x, "contributionIds", value.asInstanceOf[js.Any])
    
    inline def setContributionIdsVarargs(value: String*): Self = StObject.set(x, "contributionIds", js.Array(value :_*))
  }
}
