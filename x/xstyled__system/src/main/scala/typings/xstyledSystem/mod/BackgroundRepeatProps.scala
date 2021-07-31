package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundRepeatProps extends StObject {
  
  val backgroundRepeat: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ js.Any
    ]
  ] = js.undefined
}
object BackgroundRepeatProps {
  
  @scala.inline
  def apply(): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
  
  @scala.inline
  implicit class BackgroundRepeatPropsMutableBuilder[Self <: BackgroundRepeatProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundRepeat(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ js.Any
        ]
    ): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundRepeatVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ js.Any)*
    ): Self = StObject.set(x, "backgroundRepeat", js.Array(value :_*))
  }
}
