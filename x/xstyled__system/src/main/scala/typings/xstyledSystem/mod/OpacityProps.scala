package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityProps extends StObject {
  
  val opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
    ]
  ] = js.native
}
object OpacityProps {
  
  @scala.inline
  def apply(): OpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps]
  }
  
  @scala.inline
  implicit class OpacityPropsMutableBuilder[Self <: OpacityProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
        ]
    ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: js.Any*): Self = StObject.set(x, "opacity", js.Array(value :_*))
  }
}
