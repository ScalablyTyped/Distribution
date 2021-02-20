package typings.typedoc.anon

import typings.typedoc.typedocStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var name: out = js.native
}
object `0` {
  
  @scala.inline
  def apply(name: out): `0` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: out): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
