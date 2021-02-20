package typings.typedoc.anon

import typings.typedoc.typedocStrings.includes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  var name: includes = js.native
}
object `11` {
  
  @scala.inline
  def apply(name: includes): `11` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: includes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
