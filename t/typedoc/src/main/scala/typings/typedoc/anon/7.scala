package typings.typedoc.anon

import typings.typedoc.typedocStrings.includeVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var name: includeVersion
}
object `7` {
  
  @scala.inline
  def apply(): `7` = {
    val __obj = js.Dynamic.literal(name = "includeVersion")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: includeVersion): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
