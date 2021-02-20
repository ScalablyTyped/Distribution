package typings.typedoc.anon

import typings.typedoc.typedocStrings.categoryOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `24` extends StObject {
  
  var name: categoryOrder = js.native
}
object `24` {
  
  @scala.inline
  def apply(name: categoryOrder): `24` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: categoryOrder): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
