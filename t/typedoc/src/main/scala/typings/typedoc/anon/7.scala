package typings.typedoc.anon

import typings.typedoc.typedocStrings.includeVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends StObject {
  
  var name: includeVersion = js.native
}
object `7` {
  
  @scala.inline
  def apply(name: includeVersion): `7` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: includeVersion): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
