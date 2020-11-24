package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionProps[TLength] extends js.Object {
  
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
  implicit class TransitionPropsOps[Self <: TransitionProps[_], TLength] (val x: Self with TransitionProps[TLength]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitionVarargs(value: js.Any*): Self = this.set("transition", js.Array(value :_*))
    
    @scala.inline
    def setTransition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
        ]
    ): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
