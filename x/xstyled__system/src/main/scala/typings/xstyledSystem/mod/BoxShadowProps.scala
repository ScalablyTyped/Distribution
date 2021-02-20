package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxShadowProps extends StObject {
  
  val boxShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
    ]
  ] = js.native
}
object BoxShadowProps {
  
  @scala.inline
  def apply(): BoxShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps]
  }
  
  @scala.inline
  implicit class BoxShadowPropsMutableBuilder[Self <: BoxShadowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
        ]
    ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    @scala.inline
    def setBoxShadowVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "boxShadow", js.Array(value :_*))
  }
}
