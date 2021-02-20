package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RangeSpec extends StObject
object _RangeSpec {
  
  @scala.inline
  def CellAddress(c: Double, r: Double): typings.xlsx.mod.CellAddress = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xlsx.mod.CellAddress]
  }
  
  @scala.inline
  def Range(e: CellAddress, s: CellAddress): typings.xlsx.mod.Range = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xlsx.mod.Range]
  }
}
