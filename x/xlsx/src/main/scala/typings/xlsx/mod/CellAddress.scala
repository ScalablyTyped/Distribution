package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellAddress extends _RangeSpec {
  
  /** Column number */
  var c: Double = js.native
  
  /** Row number */
  var r: Double = js.native
}
object CellAddress {
  
  @scala.inline
  def apply(c: Double, r: Double): CellAddress = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
  
  @scala.inline
  implicit class CellAddressMutableBuilder[Self <: CellAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
