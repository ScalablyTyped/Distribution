package typings.typedoc.anon

import typings.typedoc.typedocStrings.readme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `37` extends StObject {
  
  var name: readme = js.native
}
object `37` {
  
  @scala.inline
  def apply(name: readme): `37` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: readme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
