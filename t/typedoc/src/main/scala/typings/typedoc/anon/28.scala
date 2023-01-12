package typings.typedoc.anon

import typings.typedoc.typedocStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var name: plugin
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal(name = "plugin")
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `28`] (val x: Self) extends AnyVal {
    
    inline def setName(value: plugin): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
