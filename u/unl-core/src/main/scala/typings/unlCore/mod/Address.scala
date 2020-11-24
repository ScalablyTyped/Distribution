package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  var bounds: BoundsWithElevation = js.native
  
  var coordinates: PointWithElevation = js.native
  
  var geohash: String = js.native
  
  var words: String = js.native
}
object Address {
  
  @scala.inline
  def apply(bounds: BoundsWithElevation, coordinates: PointWithElevation, geohash: String, words: String): Address = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], geohash = geohash.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: BoundsWithElevation): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinates(value: PointWithElevation): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeohash(value: String): Self = this.set("geohash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: String): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
