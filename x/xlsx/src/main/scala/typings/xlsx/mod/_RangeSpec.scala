package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RangeSpec extends js.Object
object _RangeSpec {
  
  @scala.inline
  def Range(e: CellAddress, s: CellAddress): _RangeSpec = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RangeSpec]
  }
  
  @scala.inline
  def CellAddress(c: Double, r: Double): _RangeSpec = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RangeSpec]
  }
}
