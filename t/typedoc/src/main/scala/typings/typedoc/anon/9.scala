package typings.typedoc.anon

import typings.typedoc.typedocStrings.defaultCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9` extends StObject {
  
  var name: defaultCategory = js.native
}
object `9` {
  
  @scala.inline
  def apply(name: defaultCategory): `9` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: defaultCategory): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
