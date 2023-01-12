package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.BlockInstance<{[k: string] : any}>> */
trait PartialBlockInstancekstri extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var innerBlocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[Any]]]] = js.undefined
  
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var originalContent: js.UndefOr[String] = js.undefined
}
object PartialBlockInstancekstri {
  
  inline def apply(): PartialBlockInstancekstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBlockInstancekstri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBlockInstancekstri] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    inline def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    inline def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
  }
}
