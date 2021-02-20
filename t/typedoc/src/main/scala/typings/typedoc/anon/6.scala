package typings.typedoc.anon

import typings.typedoc.typedocStrings.listInvalidSymbolLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var name: listInvalidSymbolLinks = js.native
}
object `6` {
  
  @scala.inline
  def apply(name: listInvalidSymbolLinks): `6` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: listInvalidSymbolLinks): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
