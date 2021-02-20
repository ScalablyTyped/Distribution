package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftProps[TLength] extends StObject {
  
  val left: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
    ]
  ] = js.native
}
object LeftProps {
  
  @scala.inline
  def apply[TLength](): LeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftProps[TLength]]
  }
  
  @scala.inline
  implicit class LeftPropsMutableBuilder[Self <: LeftProps[_], TLength] (val x: Self with LeftProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
        ]
    ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLeftVarargs(value: js.Any*): Self = StObject.set(x, "left", js.Array(value :_*))
  }
}
