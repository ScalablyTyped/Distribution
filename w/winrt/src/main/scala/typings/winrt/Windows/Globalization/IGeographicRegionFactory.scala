package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeographicRegionFactory extends js.Object {
  
  def createGeographicRegion(geographicRegionCode: String): GeographicRegion = js.native
}
object IGeographicRegionFactory {
  
  @scala.inline
  def apply(createGeographicRegion: String => GeographicRegion): IGeographicRegionFactory = {
    val __obj = js.Dynamic.literal(createGeographicRegion = js.Any.fromFunction1(createGeographicRegion))
    __obj.asInstanceOf[IGeographicRegionFactory]
  }
  
  @scala.inline
  implicit class IGeographicRegionFactoryOps[Self <: IGeographicRegionFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateGeographicRegion(value: String => GeographicRegion): Self = this.set("createGeographicRegion", js.Any.fromFunction1(value))
  }
}
