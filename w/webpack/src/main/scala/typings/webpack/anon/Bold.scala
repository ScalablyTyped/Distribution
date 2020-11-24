package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bold extends js.Object {
  
  /**
  				 * Custom color for bold text
  				 */
  var bold: js.UndefOr[String] = js.native
  
  /**
  				 * Custom color for cyan text
  				 */
  var cyan: js.UndefOr[String] = js.native
  
  /**
  				 * Custom color for green text
  				 */
  var green: js.UndefOr[String] = js.native
  
  /**
  				 * Custom color for magenta text
  				 */
  var magenta: js.UndefOr[String] = js.native
  
  /**
  				 * Custom color for red text
  				 */
  var red: js.UndefOr[String] = js.native
  
  /**
  				 * Custom color for yellow text
  				 */
  var yellow: js.UndefOr[String] = js.native
}
object Bold {
  
  @scala.inline
  def apply(): Bold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bold]
  }
  
  @scala.inline
  implicit class BoldOps[Self <: Bold] (val x: Self) extends AnyVal {
    
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
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCyan(value: String): Self = this.set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCyan: Self = this.set("cyan", js.undefined)
    
    @scala.inline
    def setGreen(value: String): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    
    @scala.inline
    def setMagenta(value: String): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagenta: Self = this.set("magenta", js.undefined)
    
    @scala.inline
    def setRed(value: String): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    
    @scala.inline
    def setYellow(value: String): Self = this.set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellow: Self = this.set("yellow", js.undefined)
  }
}
