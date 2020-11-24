package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of `begin` and `end` indexes that indicate the locations of the elements in the input document. */
@js.native
trait ElementLocations extends js.Object {
  
  /** An integer that indicates the starting position of the element in the input document. */
  var begin: js.UndefOr[Double] = js.native
  
  /** An integer that indicates the ending position of the element in the input document. */
  var end: js.UndefOr[Double] = js.native
}
object ElementLocations {
  
  @scala.inline
  def apply(): ElementLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementLocations]
  }
  
  @scala.inline
  implicit class ElementLocationsOps[Self <: ElementLocations] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: Double): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
  }
}
