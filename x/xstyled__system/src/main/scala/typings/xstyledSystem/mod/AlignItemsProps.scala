package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsProps extends StObject {
  
  val alignItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any
    ]
  ] = js.undefined
}
object AlignItemsProps {
  
  @scala.inline
  def apply(): AlignItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemsProps]
  }
  
  @scala.inline
  implicit class AlignItemsPropsMutableBuilder[Self <: AlignItemsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any
        ]
    ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def setAlignItemsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ js.Any)*
    ): Self = StObject.set(x, "alignItems", js.Array(value :_*))
  }
}
