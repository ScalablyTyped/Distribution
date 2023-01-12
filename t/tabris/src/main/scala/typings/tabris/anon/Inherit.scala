package typings.tabris.anon

import typings.tabris.mod._Selectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherit
  extends StObject
     with _Selectable[Any] {
  
  var inherit: Boolean
}
object Inherit {
  
  inline def apply(inherit: Boolean): Inherit = {
    val __obj = js.Dynamic.literal(inherit = inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inherit] (val x: Self) extends AnyVal {
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
  }
}
