package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoHaystackSearchOptions extends js.Object {
  
  /**
    * Max number of results to return.
    */
  var limit: js.UndefOr[scala.Double] = js.native
  
  /**
    * Include results up to maxDistance from the point.
    */
  var maxDistance: js.UndefOr[scala.Double] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Filter the results by a query.
    */
  var search: js.UndefOr[js.Object] = js.native
}
object GeoHaystackSearchOptions {
  
  @scala.inline
  def apply(): GeoHaystackSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoHaystackSearchOptions]
  }
  
  @scala.inline
  implicit class GeoHaystackSearchOptionsOps[Self <: GeoHaystackSearchOptions] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: scala.Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: scala.Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSearch(value: js.Object): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
