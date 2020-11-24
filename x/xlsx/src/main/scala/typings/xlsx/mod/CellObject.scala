package typings.xlsx.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellObject extends js.Object {
  
  /** Range of enclosing array if formula is array formula (if applicable) */
  var F: js.UndefOr[String] = js.native
  
  /** Comments associated with the cell */
  var c: js.UndefOr[Comments] = js.native
  
  /** Cell formula (if applicable) */
  var f: js.UndefOr[String] = js.native
  
  /** HTML rendering of the rich text (if applicable) */
  var h: js.UndefOr[String] = js.native
  
  /** Cell hyperlink object (.Target holds link, .tooltip is tooltip) */
  var l: js.UndefOr[Hyperlink] = js.native
  
  /** Rich text encoding (if applicable) */
  var r: js.UndefOr[js.Any] = js.native
  
  /** The style/theme of the cell (if applicable) */
  var s: js.UndefOr[js.Any] = js.native
  
  /**
    * The Excel Data Type of the cell.
    * b Boolean, n Number, e Error, s String, d Date, z Empty
    */
  var t: ExcelDataType = js.native
  
  /** The raw value of the cell.  Can be omitted if a formula is specified */
  var v: js.UndefOr[String | Double | Boolean | Date] = js.native
  
  /** Formatted text (if applicable) */
  var w: js.UndefOr[String] = js.native
  
  /** Number format string associated with the cell (if requested) */
  var z: js.UndefOr[NumberFormat] = js.native
}
object CellObject {
  
  @scala.inline
  def apply(t: ExcelDataType): CellObject = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellObject]
  }
  
  @scala.inline
  implicit class CellObjectOps[Self <: CellObject] (val x: Self) extends AnyVal {
    
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
    def setT(value: ExcelDataType): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("F", js.undefined)
    
    @scala.inline
    def setC(value: Comments): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setH(value: String): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setL(value: Hyperlink): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    
    @scala.inline
    def setR(value: js.Any): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setV(value: String | Double | Boolean | Date): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
    
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setZ(value: NumberFormat): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
