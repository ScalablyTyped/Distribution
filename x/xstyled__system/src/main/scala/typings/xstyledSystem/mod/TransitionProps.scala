package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionProps[TLength] extends StObject {
  
  val transition: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ js.Any
    ]
  ] = js.undefined
}
object TransitionProps {
  
  @scala.inline
  def apply[TLength](): TransitionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps[TLength]]
  }
  
  @scala.inline
  implicit class TransitionPropsMutableBuilder[Self <: TransitionProps[?], TLength] (val x: Self & TransitionProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setTransition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setTransitionVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ js.Any)*
    ): Self = StObject.set(x, "transition", js.Array(value :_*))
  }
}
