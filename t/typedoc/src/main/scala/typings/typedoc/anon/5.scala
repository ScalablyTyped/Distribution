package typings.typedoc.anon

import typings.typedoc.typedocStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var name: json
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal(name = "json")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: json): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
