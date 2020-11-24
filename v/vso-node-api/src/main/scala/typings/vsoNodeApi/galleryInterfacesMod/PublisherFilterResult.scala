package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherFilterResult extends js.Object {
  
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var publishers: js.Array[Publisher] = js.native
}
object PublisherFilterResult {
  
  @scala.inline
  def apply(publishers: js.Array[Publisher]): PublisherFilterResult = {
    val __obj = js.Dynamic.literal(publishers = publishers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherFilterResult]
  }
  
  @scala.inline
  implicit class PublisherFilterResultOps[Self <: PublisherFilterResult] (val x: Self) extends AnyVal {
    
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
    def setPublishersVarargs(value: Publisher*): Self = this.set("publishers", js.Array(value :_*))
    
    @scala.inline
    def setPublishers(value: js.Array[Publisher]): Self = this.set("publishers", value.asInstanceOf[js.Any])
  }
}
