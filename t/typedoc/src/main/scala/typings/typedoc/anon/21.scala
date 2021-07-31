package typings.typedoc.anon

import typings.typedoc.typedocStrings.help
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var name: help
}
object `21` {
  
  @scala.inline
  def apply(): `21` = {
    val __obj = js.Dynamic.literal(name = "help")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: help): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
