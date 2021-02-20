package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionProps[TLength] extends StObject {
  
  val transition: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
    ]
  ] = js.native
}
object TransitionProps {
  
  @scala.inline
  def apply[TLength](): TransitionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps[TLength]]
  }
  
  @scala.inline
  implicit class TransitionPropsMutableBuilder[Self <: TransitionProps[_], TLength] (val x: Self with TransitionProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setTransition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
        ]
    ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setTransitionVarargs(value: js.Any*): Self = StObject.set(x, "transition", js.Array(value :_*))
  }
}
