package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.BlockInstance<{[k: string] : any}>> */
trait PartialBlockInstancekstri extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var innerBlocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[js.Any]]]] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var originalContent: js.UndefOr[String] = js.undefined
}
object PartialBlockInstancekstri {
  
  @scala.inline
  def apply(): PartialBlockInstancekstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBlockInstancekstri]
  }
  
  @scala.inline
  implicit class PartialBlockInstancekstriMutableBuilder[Self <: PartialBlockInstancekstri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[js.Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    @scala.inline
    def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
  }
}
