package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var name: externalPattern
}
object `35` {
  
  @scala.inline
  def apply(): `35` = {
    val __obj = js.Dynamic.literal(name = "externalPattern")
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: externalPattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
