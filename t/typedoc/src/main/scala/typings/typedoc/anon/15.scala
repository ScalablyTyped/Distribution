package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeNotDocumented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var name: excludeNotDocumented
}
object `15` {
  
  @scala.inline
  def apply(): `15` = {
    val __obj = js.Dynamic.literal(name = "excludeNotDocumented")
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeNotDocumented): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
