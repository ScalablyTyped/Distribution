package typings.typedoc.anon

import typings.typedoc.typedocStrings.titleLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var name: titleLink
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(name = "titleLink")
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`] (val x: Self) extends AnyVal {
    
    inline def setName(value: titleLink): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
