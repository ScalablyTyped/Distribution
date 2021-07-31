package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultType extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var `type`: string
}
object DefaultType {
  
  @scala.inline
  def apply(): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit class DefaultTypeMutableBuilder[Self <: DefaultType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
