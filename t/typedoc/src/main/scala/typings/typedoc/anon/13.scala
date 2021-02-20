package typings.typedoc.anon

import typings.typedoc.typedocStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends StObject {
  
  var name: plugin = js.native
}
object `13` {
  
  @scala.inline
  def apply(name: plugin): `13` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: plugin): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
