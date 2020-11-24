package typings.unsplashJs.anon

import typings.unsplashJs.mod.CollectionIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait C extends js.Object {
  
  var c: js.UndefOr[String] = js.native
  
  var collections: js.UndefOr[CollectionIds] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var featured: js.UndefOr[Boolean] = js.native
  
  var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object C {
  
  @scala.inline
  def apply(): C = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[C]
  }
  
  @scala.inline
  implicit class COps[Self <: C] (val x: Self) extends AnyVal {
    
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setCollectionsVarargs(value: (Double | String)*): Self = this.set("collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: CollectionIds): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatured: Self = this.set("featured", js.undefined)
    
    @scala.inline
    def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
