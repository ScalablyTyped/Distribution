package typings.typedoc.anon

import typings.typedoc.typedocStrings.entryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28` extends StObject {
  
  var name: entryPoint = js.native
}
object `28` {
  
  @scala.inline
  def apply(name: entryPoint): `28` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: entryPoint): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
