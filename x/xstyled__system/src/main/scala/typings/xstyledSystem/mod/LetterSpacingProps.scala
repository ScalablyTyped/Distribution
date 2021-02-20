package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetterSpacingProps[TLength] extends StObject {
  
  val letterSpacing: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
    ]
  ] = js.native
}
object LetterSpacingProps {
  
  @scala.inline
  def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  
  @scala.inline
  implicit class LetterSpacingPropsMutableBuilder[Self <: LetterSpacingProps[_], TLength] (val x: Self with LetterSpacingProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setLetterSpacing(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
        ]
    ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLetterSpacingVarargs(value: js.Any*): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
  }
}
