package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeProtected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var name: excludeProtected
}
object `14` {
  
  @scala.inline
  def apply(): `14` = {
    val __obj = js.Dynamic.literal(name = "excludeProtected")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeProtected): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
