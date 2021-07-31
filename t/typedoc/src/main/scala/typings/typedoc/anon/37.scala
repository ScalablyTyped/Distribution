package typings.typedoc.anon

import typings.typedoc.typedocStrings.readme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var name: readme
}
object `37` {
  
  @scala.inline
  def apply(): `37` = {
    val __obj = js.Dynamic.literal(name = "readme")
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: readme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
