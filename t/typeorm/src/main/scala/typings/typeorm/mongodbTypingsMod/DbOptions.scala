package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbOptions extends js.Object {
  
  /**
    * Do not make the db an event listener to the original connection.
    */
  var noListener: js.UndefOr[Boolean] = js.native
  
  /**
    * Control if you want to return a cached instance or have a new one created.
    */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.native
}
object DbOptions {
  
  @scala.inline
  def apply(): DbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbOptions]
  }
  
  @scala.inline
  implicit class DbOptionsOps[Self <: DbOptions] (val x: Self) extends AnyVal {
    
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
    def setNoListener(value: Boolean): Self = this.set("noListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoListener: Self = this.set("noListener", js.undefined)
    
    @scala.inline
    def setReturnNonCachedInstance(value: Boolean): Self = this.set("returnNonCachedInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnNonCachedInstance: Self = this.set("returnNonCachedInstance", js.undefined)
  }
}
