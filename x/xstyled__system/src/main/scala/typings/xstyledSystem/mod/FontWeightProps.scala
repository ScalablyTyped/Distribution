package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeightProps extends StObject {
  
  val fontWeight: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
    ]
  ] = js.native
}
object FontWeightProps {
  
  @scala.inline
  def apply(): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps]
  }
  
  @scala.inline
  implicit class FontWeightPropsMutableBuilder[Self <: FontWeightProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontWeight(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
        ]
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFontWeightVarargs(value: (js.Any | AliasKey)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
  }
}
