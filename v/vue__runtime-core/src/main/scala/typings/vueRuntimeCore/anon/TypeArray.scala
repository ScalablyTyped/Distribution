package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArray extends StObject {
  
  var `type`: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ]
}
object TypeArray {
  
  inline def apply(
    `type`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
    ]
  ): TypeArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArray]
  }
  
  extension [Self <: TypeArray](x: Self) {
    
    inline def setType(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
