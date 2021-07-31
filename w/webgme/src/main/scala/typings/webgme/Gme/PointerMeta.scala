package typings.webgme.Gme

import typings.webgme.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerMeta extends StObject {
  
  var items: js.Array[Id]
  
  /**
    * the maximum allowed targets for a pointer is 1.
    * more than 1 requires a set.
    */
  var max: Double
}
object PointerMeta {
  
  @scala.inline
  def apply(items: js.Array[Id], max: Double): PointerMeta = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerMeta]
  }
  
  @scala.inline
  implicit class PointerMetaMutableBuilder[Self <: PointerMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Id]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Id*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
