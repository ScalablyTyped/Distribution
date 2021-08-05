package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS align-items property sets the align-self value on all direct children as a group. The align-self
    * property sets the alignment of an item within its containing block.
    *
    * In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment
    * of items on the Block Axis within their grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items)
    */
  var alignItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object AlignItemsProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): AlignItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemsProps[ThemeType]]
  }
  
  extension [Self <: AlignItemsProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & AlignItemsProps[ThemeType]) {
    
    inline def setAlignItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsNull: Self = StObject.set(x, "alignItems", null)
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignItemsVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any) | Null)*
    ): Self = StObject.set(x, "alignItems", js.Array(value :_*))
  }
}
