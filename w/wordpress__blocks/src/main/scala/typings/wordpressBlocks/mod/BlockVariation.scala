package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.anon.AttributesInnerBlocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockVariation[Attributes /* <: BlockAttributes */] extends StObject {
  
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var example: js.UndefOr[BlockExampleInnerBlock | AttributesInnerBlocks[Attributes]] = js.undefined
  
  var icon: js.UndefOr[BlockIcon] = js.undefined
  
  var innerBlocks: js.UndefOr[BlockInstance[StringDictionary[Any]] | js.Array[InnerBlockTemplate]] = js.undefined
  
  var isActive: js.UndefOr[
    js.Function2[
      /* blockAttributes */ Attributes, 
      /* variationAttributes */ Attributes, 
      Boolean | js.Array[String]
    ]
  ] = js.undefined
  
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var scope: js.UndefOr[js.Array[BlockVariationScope]] = js.undefined
  
  var title: String
}
object BlockVariation {
  
  inline def apply[Attributes /* <: BlockAttributes */](name: String, title: String): BlockVariation[Attributes] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockVariation[Attributes]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockVariation[?], Attributes /* <: BlockAttributes */] (val x: Self & BlockVariation[Attributes]) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExample(value: BlockExampleInnerBlock | AttributesInnerBlocks[Attributes]): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setIcon(value: BlockIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInnerBlocks(value: BlockInstance[StringDictionary[Any]] | js.Array[InnerBlockTemplate]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    inline def setInnerBlocksVarargs(value: InnerBlockTemplate*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
    
    inline def setIsActive(
      value: (/* blockAttributes */ Attributes, /* variationAttributes */ Attributes) => Boolean | js.Array[String]
    ): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: js.Array[BlockVariationScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: BlockVariationScope*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
