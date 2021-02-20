package typings.typedoc.anon

import typings.typedoc.typedocStrings.includeDeclarations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  var name: includeDeclarations = js.native
}
object `16` {
  
  @scala.inline
  def apply(name: includeDeclarations): `16` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: includeDeclarations): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
