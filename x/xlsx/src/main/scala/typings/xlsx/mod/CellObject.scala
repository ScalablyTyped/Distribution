package typings.xlsx.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellObject extends StObject {
  
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
  implicit class CellObjectMutableBuilder[Self <: CellObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Comments): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    @scala.inline
    def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFUndefined: Self = StObject.set(x, "F", js.undefined)
    
    @scala.inline
    def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setL(value: Hyperlink): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    @scala.inline
    def setR(value: js.Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setT(value: ExcelDataType): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String | Double | Boolean | Date): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    @scala.inline
    def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setZ(value: NumberFormat): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
