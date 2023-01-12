package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<tabris.tabris.FontValue>> */
trait FontResourceData[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Font} */ js.Any */] extends StObject {
  
  var build: Selectable[FontValue]
  
  var constructor: Selectable[FontValue]
}
object FontResourceData {
  
  inline def apply[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Font} */ js.Any */](): FontResourceData[Resources] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontResourceData[Resources]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontResourceData[?], Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Font} */ js.Any */] (val x: Self & FontResourceData[Resources]) extends AnyVal {
    
    inline def setBuild(value: Selectable[FontValue]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildNull: Self = StObject.set(x, "build", null)
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConstructor(value: Selectable[FontValue]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setConstructorNull: Self = StObject.set(x, "constructor", null)
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
