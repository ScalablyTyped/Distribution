package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZIndexProps extends StObject {
  
  val zIndex: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
    ]
  ] = js.native
}
object ZIndexProps {
  
  @scala.inline
  def apply(): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps]
  }
  
  @scala.inline
  implicit class ZIndexPropsMutableBuilder[Self <: ZIndexProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZIndex(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
        ]
    ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZIndexVarargs(value: (js.Any | AliasKey)*): Self = StObject.set(x, "zIndex", js.Array(value :_*))
  }
}
