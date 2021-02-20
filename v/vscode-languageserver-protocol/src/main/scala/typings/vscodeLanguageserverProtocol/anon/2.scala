package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind] = js.native
}
object `2` {
  
  @scala.inline
  def apply(valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): `2` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueSet(value: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetVarargs(value: typings.vscodeLanguageserverTypes.mod.CodeActionKind*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
  }
}
