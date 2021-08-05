package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignSelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object AlignSelfProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): AlignSelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelfProps[ThemeType]]
  }
  
  extension [Self <: AlignSelfProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & AlignSelfProps[ThemeType]) {
    
    inline def setAlignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfNull: Self = StObject.set(x, "alignSelf", null)
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAlignSelfVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any) | Null)*
    ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
  }
}
