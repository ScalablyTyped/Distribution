package typings.typedoc.anon

import typings.typedoc.typedocStrings.toc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25` extends StObject {
  
  var name: toc = js.native
}
object `25` {
  
  @scala.inline
  def apply(name: toc): `25` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: toc): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
