package typings.typedoc.anon

import typings.typedoc.typedocStrings.gitRemote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var name: gitRemote = js.native
}
object `4` {
  
  @scala.inline
  def apply(name: gitRemote): `4` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: gitRemote): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
