package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandScale extends StObject {
  
  var band: Double | Boolean = js.native
  
  var scale: typings.vegaTypings.encodeMod.Field = js.native
}
object BandScale {
  
  @scala.inline
  def apply(band: Double | Boolean, scale: typings.vegaTypings.encodeMod.Field): BandScale = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandScale]
  }
  
  @scala.inline
  implicit class BandScaleMutableBuilder[Self <: BandScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double | Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
