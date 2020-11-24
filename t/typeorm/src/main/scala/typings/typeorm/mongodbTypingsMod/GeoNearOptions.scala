package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoNearOptions extends js.Object {
  
  /**
    * Include a value to multiply the distances with allowing for range conversions.
    */
  var distanceMultiplier: js.UndefOr[scala.Double] = js.native
  
  /**
    * Include the location data fields in the top level of the results MongoDB > 2.X.
    */
  var includeLocs: js.UndefOr[Boolean] = js.native
  
  /**
    * Include results up to maxDistance from the point.
    */
  var maxDistance: js.UndefOr[scala.Double] = js.native
  
  /**
    * Include results starting at minDistance from a point (2.6 or higher).
    */
  var minDistance: js.UndefOr[scala.Double] = js.native
  
  /**
    * Max number of results to return.
    */
  var num: js.UndefOr[scala.Double] = js.native
  
  /**
    * Filter the results by a query.
    */
  var query: js.UndefOr[js.Object] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Perform query using a spherical model.
    */
  var spherical: js.UndefOr[Boolean] = js.native
  
  /**
    * The closest location in a document to the center of the search region will always be returned MongoDB > 2.X.
    */
  var uniqueDocs: js.UndefOr[Boolean] = js.native
}
object GeoNearOptions {
  
  @scala.inline
  def apply(): GeoNearOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoNearOptions]
  }
  
  @scala.inline
  implicit class GeoNearOptionsOps[Self <: GeoNearOptions] (val x: Self) extends AnyVal {
    
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
    def setDistanceMultiplier(value: scala.Double): Self = this.set("distanceMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceMultiplier: Self = this.set("distanceMultiplier", js.undefined)
    
    @scala.inline
    def setIncludeLocs(value: Boolean): Self = this.set("includeLocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLocs: Self = this.set("includeLocs", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: scala.Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    
    @scala.inline
    def setMinDistance(value: scala.Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
    
    @scala.inline
    def setNum(value: scala.Double): Self = this.set("num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSpherical(value: Boolean): Self = this.set("spherical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpherical: Self = this.set("spherical", js.undefined)
    
    @scala.inline
    def setUniqueDocs(value: Boolean): Self = this.set("uniqueDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueDocs: Self = this.set("uniqueDocs", js.undefined)
  }
}
