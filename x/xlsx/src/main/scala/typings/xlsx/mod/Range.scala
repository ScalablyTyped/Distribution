package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range
  extends StObject
     with _RangeSpec {
  
  /** Ending cell */
  var e: CellAddress
  
  /** Starting cell */
  var s: CellAddress
}
object Range {
  
  @scala.inline
  def apply(e: CellAddress, s: CellAddress): Range = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: CellAddress): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: CellAddress): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
