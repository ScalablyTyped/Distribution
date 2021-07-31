package typings.typedoc.anon

import typings.typedoc.typedocStrings.disableSources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var name: disableSources
}
object `18` {
  
  @scala.inline
  def apply(): `18` = {
    val __obj = js.Dynamic.literal(name = "disableSources")
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: disableSources): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
