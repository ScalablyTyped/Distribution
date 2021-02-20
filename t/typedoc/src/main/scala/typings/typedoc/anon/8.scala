package typings.typedoc.anon

import typings.typedoc.typedocStrings.exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var name: exclude = js.native
}
object `8` {
  
  @scala.inline
  def apply(name: exclude): `8` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: exclude): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
