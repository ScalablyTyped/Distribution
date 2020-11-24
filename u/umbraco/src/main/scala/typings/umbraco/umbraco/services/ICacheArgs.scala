package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cache args
  */
@js.native
trait ICacheArgs extends js.Object {
  
  var cacheKey: String = js.native
  
  var childrenOf: js.UndefOr[Double] = js.native
  
  var section: js.UndefOr[String] = js.native
}
object ICacheArgs {
  
  @scala.inline
  def apply(cacheKey: String): ICacheArgs = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheArgs]
  }
  
  @scala.inline
  implicit class ICacheArgsOps[Self <: ICacheArgs] (val x: Self) extends AnyVal {
    
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
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenOf(value: Double): Self = this.set("childrenOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenOf: Self = this.set("childrenOf", js.undefined)
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
