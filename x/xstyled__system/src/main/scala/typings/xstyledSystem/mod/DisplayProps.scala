package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayProps extends StObject {
  
  val display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
    ]
  ] = js.native
}
object DisplayProps {
  
  @scala.inline
  def apply(): DisplayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayProps]
  }
  
  @scala.inline
  implicit class DisplayPropsMutableBuilder[Self <: DisplayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
        ]
    ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(value: js.Any*): Self = StObject.set(x, "display", js.Array(value :_*))
  }
}
