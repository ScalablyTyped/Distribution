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
  
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderQuery]
  }
  
  @scala.inline
  implicit class DataProviderQueryMutableBuilder[Self <: DataProviderQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: DataProviderContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionIds(value: js.Array[String]): Self = StObject.set(x, "contributionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionIdsVarargs(value: String*): Self = StObject.set(x, "contributionIds", js.Array(value :_*))
  }
}
