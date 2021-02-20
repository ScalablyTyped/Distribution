package typings.typedoc.anon

import typings.typedoc.typedocStrings.hideGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var name: hideGenerator = js.native
}
object `2` {
  
  @scala.inline
  def apply(name: hideGenerator): `2` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: hideGenerator): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
