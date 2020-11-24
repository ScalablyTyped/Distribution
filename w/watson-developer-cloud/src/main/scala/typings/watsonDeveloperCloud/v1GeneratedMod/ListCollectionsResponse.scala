package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ListCollectionsResponse. */
@js.native
trait ListCollectionsResponse extends js.Object {
  
  /** An array containing information about each collection in the environment. */
  var collections: js.UndefOr[js.Array[Collection]] = js.native
}
object ListCollectionsResponse {
  
  @scala.inline
  def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  @scala.inline
  implicit class ListCollectionsResponseOps[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCollectionsVarargs(value: Collection*): Self = this.set("collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: js.Array[Collection]): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
  }
}
