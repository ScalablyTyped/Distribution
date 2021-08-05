package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.CompletionItemKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * The completion item kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the completion items kinds from `Text` to `Reference` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[CompletionItemKind]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setValueSet(value: js.Array[CompletionItemKind]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setValueSetVarargs(value: CompletionItemKind*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
  }
}
