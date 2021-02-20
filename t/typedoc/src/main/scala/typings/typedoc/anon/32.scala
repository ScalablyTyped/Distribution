package typings.typedoc.anon

import typings.typedoc.typedocStrings.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends StObject {
  
  var name: options = js.native
}
object `32` {
  
  @scala.inline
  def apply(name: options): `32` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: options): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
