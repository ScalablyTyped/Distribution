package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.FoldingRangeKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  /**
    * The folding range kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.UndefOr[js.Array[FoldingRangeKind]] = js.undefined
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setValueSet(value: js.Array[FoldingRangeKind]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setValueSetVarargs(value: FoldingRangeKind*): Self = StObject.set(x, "valueSet", js.Array(value*))
  }
}
