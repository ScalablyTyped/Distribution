package typings.typedoc.anon

import typings.typedoc.typedocStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var name: theme = js.native
}
object `12` {
  
  @scala.inline
  def apply(name: theme): `12` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: theme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
