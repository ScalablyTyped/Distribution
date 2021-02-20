package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifyItemsProps extends StObject {
  
  val justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
    ]
  ] = js.native
}
object JustifyItemsProps {
  
  @scala.inline
  def apply(): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps]
  }
  
  @scala.inline
  implicit class JustifyItemsPropsMutableBuilder[Self <: JustifyItemsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
        ]
    ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    @scala.inline
    def setJustifyItemsVarargs(value: js.Any*): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
  }
}
