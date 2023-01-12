package typings.typedoc.anon

import typings.typedoc.typedocStrings.sourceLinkTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var name: sourceLinkTemplate
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal(name = "sourceLinkTemplate")
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `63`] (val x: Self) extends AnyVal {
    
    inline def setName(value: sourceLinkTemplate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
