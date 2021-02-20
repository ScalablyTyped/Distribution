package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexProps[TLength] extends StObject {
  
  val flex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
    ]
  ] = js.native
}
object FlexProps {
  
  @scala.inline
  def apply[TLength](): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps[TLength]]
  }
  
  @scala.inline
  implicit class FlexPropsMutableBuilder[Self <: FlexProps[_], TLength] (val x: Self with FlexProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setFlex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
        ]
    ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    @scala.inline
    def setFlexVarargs(value: js.Any*): Self = StObject.set(x, "flex", js.Array(value :_*))
  }
}
