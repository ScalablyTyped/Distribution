package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceGroupOptions extends StObject {
  
  var groupBy: js.UndefOr[Boolean] = js.undefined
  
  var groupHeader: js.UndefOr[Boolean] = js.undefined
  
  var groupStartOpen: js.UndefOr[Boolean] = js.undefined
}
object PersistenceGroupOptions {
  
  inline def apply(): PersistenceGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceGroupOptions]
  }
  
  extension [Self <: PersistenceGroupOptions](x: Self) {
    
    inline def setGroupBy(value: Boolean): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setGroupHeader(value: Boolean): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
    
    inline def setGroupStartOpen(value: Boolean): Self = StObject.set(x, "groupStartOpen", value.asInstanceOf[js.Any])
    
    inline def setGroupStartOpenUndefined: Self = StObject.set(x, "groupStartOpen", js.undefined)
  }
}
