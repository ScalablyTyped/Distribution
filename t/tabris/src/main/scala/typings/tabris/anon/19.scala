package typings.tabris.anon

import typings.tabris.tabrisStrings.`AES-GCM`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var name: `AES-GCM`
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(name = "AES-GCM")
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `AES-GCM`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
