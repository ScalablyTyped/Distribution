package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The pagination data for the returned objects. */
@js.native
trait Pagination extends js.Object {
  
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.native
  
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  
  /** The URL that will return the next page of results. */
  var next_url: js.UndefOr[String] = js.native
  
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.native
  
  /** The URL that will return the same page of results. */
  var refresh_url: String = js.native
  
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.native
}
object Pagination {
  
  @scala.inline
  def apply(refresh_url: String): Pagination = {
    val __obj = js.Dynamic.literal(refresh_url = refresh_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
    
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
    def setRefresh_url(value: String): Self = this.set("refresh_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: Double): Self = this.set("matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatched: Self = this.set("matched", js.undefined)
    
    @scala.inline
    def setNext_cursor(value: String): Self = this.set("next_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_cursor: Self = this.set("next_cursor", js.undefined)
    
    @scala.inline
    def setNext_url(value: String): Self = this.set("next_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_url: Self = this.set("next_url", js.undefined)
    
    @scala.inline
    def setRefresh_cursor(value: String): Self = this.set("refresh_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh_cursor: Self = this.set("refresh_cursor", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
