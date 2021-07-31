package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var `type`: boolean
}
object Default {
  
  @scala.inline
  def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
