package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  type :string} */ js.Any */] extends StObject {
  
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
}
object `2` {
  
  inline def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  type :string} */ js.Any */](`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): `2`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[T]]
  }
  
  extension [Self <: `2`[?], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  type :string} */ js.Any */](x: Self & `2`[T]) {
    
    inline def setType(value: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
