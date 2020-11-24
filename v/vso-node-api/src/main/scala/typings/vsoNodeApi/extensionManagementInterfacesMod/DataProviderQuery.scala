package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderQuery extends js.Object {
  
  /**
    * Contextual information to pass to the data providers
    */
  var context: DataProviderContext = js.native
  
  /**
    * The contribution ids of the data providers to resolve
    */
  var contributionIds: js.Array[String] = js.native
}
object DataProviderQuery {
  
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderQuery]
  }
  
  @scala.inline
  implicit class DataProviderQueryOps[Self <: DataProviderQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: DataProviderContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionIdsVarargs(value: String*): Self = this.set("contributionIds", js.Array(value :_*))
    
    @scala.inline
    def setContributionIds(value: js.Array[String]): Self = this.set("contributionIds", value.asInstanceOf[js.Any])
  }
}
