package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageProps extends StObject {
  
  val backgroundImage: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any
    ]
  ] = js.undefined
}
object BackgroundImageProps {
  
  @scala.inline
  def apply(): BackgroundImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps]
  }
  
  @scala.inline
  implicit class BackgroundImagePropsMutableBuilder[Self <: BackgroundImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundImage(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any
        ]
    ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundImageVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ js.Any)*
    ): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
  }
}
