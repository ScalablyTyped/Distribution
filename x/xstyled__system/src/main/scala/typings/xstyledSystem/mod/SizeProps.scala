package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeProps[TLength] extends StObject {
  
  val size: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
    ]
  ] = js.native
}
object SizeProps {
  
  @scala.inline
  def apply[TLength](): SizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[TLength]]
  }
  
  @scala.inline
  implicit class SizePropsMutableBuilder[Self <: SizeProps[_], TLength] (val x: Self with SizeProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
        ]
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: js.Any*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
