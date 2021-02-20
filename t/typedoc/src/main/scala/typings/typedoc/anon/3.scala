package typings.typedoc.anon

import typings.typedoc.typedocStrings.logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var name: logger = js.native
}
object `3` {
  
  @scala.inline
  def apply(name: logger): `3` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: logger): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
