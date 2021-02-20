package typings.typedoc.anon

import typings.typedoc.typedocStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `30` extends StObject {
  
  var name: mode = js.native
}
object `30` {
  
  @scala.inline
  def apply(name: mode): `30` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: mode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
