package typings.typedoc.anon

import typings.typedoc.typedocStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var name: theme
}
object `12` {
  
  @scala.inline
  def apply(): `12` = {
    val __obj = js.Dynamic.literal(name = "theme")
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: theme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
