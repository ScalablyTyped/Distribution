package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneAndDeleteOptions extends js.Object {
  
  /**
    * The maximum amount of time to allow the query to run.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * Limits the fields to return for all matching documents.
    */
  var projection: js.UndefOr[js.Object] = js.native
  
  /**
    * Determines which document the operation modifies if the query selects multiple documents.
    */
  var sort: js.UndefOr[js.Object] = js.native
}
object FindOneAndDeleteOptions {
  
  @scala.inline
  def apply(): FindOneAndDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndDeleteOptions]
  }
  
  @scala.inline
  implicit class FindOneAndDeleteOptionsOps[Self <: FindOneAndDeleteOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
