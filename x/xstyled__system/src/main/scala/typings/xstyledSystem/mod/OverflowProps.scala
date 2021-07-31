package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowProps extends StObject {
  
  val overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any
    ]
  ] = js.undefined
}
object OverflowProps {
  
  @scala.inline
  def apply(): OverflowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps]
  }
  
  @scala.inline
  implicit class OverflowPropsMutableBuilder[Self <: OverflowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any
        ]
    ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setOverflowVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any)*
    ): Self = StObject.set(x, "overflow", js.Array(value :_*))
  }
}
