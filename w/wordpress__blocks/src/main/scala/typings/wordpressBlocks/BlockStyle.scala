package typings.wordpressBlocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStyle extends StObject {
  
  val isDefault: js.UndefOr[Boolean] = js.undefined
  
  val label: String
  
  val name: String
}
object BlockStyle {
  
  inline def apply(label: String, name: String): BlockStyle = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockStyle] (val x: Self) extends AnyVal {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
