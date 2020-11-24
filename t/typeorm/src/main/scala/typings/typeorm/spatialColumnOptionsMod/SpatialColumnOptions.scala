package typings.typeorm.spatialColumnOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialColumnOptions extends js.Object {
  
  /**
    * Column type's feature type.
    * Geometry, Point, Polygon, etc.
    */
  var spatialFeatureType: js.UndefOr[String] = js.native
  
  /**
    * Column type's SRID.
    * Spatial Reference ID or EPSG code.
    */
  var srid: js.UndefOr[Double] = js.native
}
object SpatialColumnOptions {
  
  @scala.inline
  def apply(): SpatialColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialColumnOptions]
  }
  
  @scala.inline
  implicit class SpatialColumnOptionsOps[Self <: SpatialColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setSpatialFeatureType(value: String): Self = this.set("spatialFeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialFeatureType: Self = this.set("spatialFeatureType", js.undefined)
    
    @scala.inline
    def setSrid(value: Double): Self = this.set("srid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrid: Self = this.set("srid", js.undefined)
  }
}
