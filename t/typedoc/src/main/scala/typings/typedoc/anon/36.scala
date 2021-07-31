package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeExternals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var name: excludeExternals
}
object `36` {
  
  @scala.inline
  def apply(): `36` = {
    val __obj = js.Dynamic.literal(name = "excludeExternals")
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: excludeExternals): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
