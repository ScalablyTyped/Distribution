package typings.tablestore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tablestore.mod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictname
  extends StObject
     with /* name */ StringDictionary[js.UndefOr[CellValue]] {
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Dictname {
  
  inline def apply(): Dictname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictname]
  }
  
  extension [Self <: Dictname](x: Self) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
