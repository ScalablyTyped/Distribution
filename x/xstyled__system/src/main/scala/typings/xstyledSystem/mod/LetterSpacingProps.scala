package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingProps[TLength] extends StObject {
  
  val letterSpacing: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any
    ]
  ] = js.undefined
}
object LetterSpacingProps {
  
  inline def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  
  extension [Self <: LetterSpacingProps[?], TLength](x: Self & LetterSpacingProps[TLength]) {
    
    inline def setLetterSpacing(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterSpacingVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any)*
    ): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
  }
}
