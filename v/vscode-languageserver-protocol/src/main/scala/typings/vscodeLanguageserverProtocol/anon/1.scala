package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.SymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  /**
    * The symbol kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the symbol kinds from `File` to `Array` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[SymbolKind]] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueSet(value: js.Array[SymbolKind]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    @scala.inline
    def setValueSetVarargs(value: SymbolKind*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
  }
}
