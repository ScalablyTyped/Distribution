package typings.typedoc.anon

import typings.typedoc.typedocStrings.ignoreCompilerErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29` extends StObject {
  
  var name: ignoreCompilerErrors = js.native
}
object `29` {
  
  @scala.inline
  def apply(name: ignoreCompilerErrors): `29` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ignoreCompilerErrors): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
