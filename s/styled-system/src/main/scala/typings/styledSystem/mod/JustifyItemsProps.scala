package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object JustifyItemsProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
  
  extension [Self <: JustifyItemsProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & JustifyItemsProps[ThemeType]) {
    
    inline def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyItemsNull: Self = StObject.set(x, "justifyItems", null)
    
    inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    inline def setJustifyItemsVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any) | Null)*
    ): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
  }
}
