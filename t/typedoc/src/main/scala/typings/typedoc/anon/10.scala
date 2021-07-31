package typings.typedoc.anon

import typings.typedoc.typedocStrings.inputFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var name: inputFiles
}
object `10` {
  
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal(name = "inputFiles")
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: inputFiles): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
