package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistencePageOptions extends StObject {
  
  var page: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Boolean] = js.undefined
}
object PersistencePageOptions {
  
  inline def apply(): PersistencePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistencePageOptions]
  }
  
  extension [Self <: PersistencePageOptions](x: Self) {
    
    inline def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
