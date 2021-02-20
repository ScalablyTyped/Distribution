package typings.typedoc.anon

import typings.typedoc.typedocStrings.disableOutputCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `27` extends StObject {
  
  var name: disableOutputCheck = js.native
}
object `27` {
  
  @scala.inline
  def apply(name: disableOutputCheck): `27` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit class `27MutableBuilder`[Self <: `27`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: disableOutputCheck): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
