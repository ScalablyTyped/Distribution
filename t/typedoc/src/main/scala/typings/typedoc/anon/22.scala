package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludePrivate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22` extends StObject {
  
  var name: excludePrivate = js.native
}
object `22` {
  
  @scala.inline
  def apply(name: excludePrivate): `22` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludePrivate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
