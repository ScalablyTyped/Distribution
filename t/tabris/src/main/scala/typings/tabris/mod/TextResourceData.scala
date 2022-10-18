package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<string>> */
trait TextResourceData[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: string} */ js.Any */] extends StObject {
  
  var build: Selectable[String]
  
  var constructor: Selectable[String]
}
object TextResourceData {
  
  inline def apply[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: string} */ js.Any */](): TextResourceData[Resources] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextResourceData[Resources]]
  }
  
  extension [Self <: TextResourceData[?], Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: string} */ js.Any */](x: Self & TextResourceData[Resources]) {
    
    inline def setBuild(value: Selectable[String]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConstructor(value: Selectable[String]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
