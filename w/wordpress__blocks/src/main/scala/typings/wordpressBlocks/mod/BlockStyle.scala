package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStyle extends StObject {
  
  val isDefault: js.UndefOr[Boolean] = js.undefined
  
  val label: String
  
  val name: String
}
object BlockStyle {
  
  @scala.inline
  def apply(label: String, name: String): BlockStyle = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStyle]
  }
  
  @scala.inline
  implicit class BlockStyleMutableBuilder[Self <: BlockStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
