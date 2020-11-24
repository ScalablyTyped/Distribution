package typings.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledConfig[O /* <: js.Object */] extends js.Object {
  
  // TODO: Add all types from the original StyledComponentWrapperProperties
  var shouldForwardProp: js.UndefOr[
    js.Function2[
      /* keyof O */ /* prop */ String, 
      /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean], 
      Boolean
    ]
  ] = js.native
}
object StyledConfig {
  
  @scala.inline
  def apply[O /* <: js.Object */](): StyledConfig[O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledConfig[O]]
  }
  
  @scala.inline
  implicit class StyledConfigOps[Self <: StyledConfig[_], O /* <: js.Object */] (val x: Self with StyledConfig[O]) extends AnyVal {
    
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
    def setShouldForwardProp(
      value: (/* keyof O */ /* prop */ String, /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean]) => Boolean
    ): Self = this.set("shouldForwardProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldForwardProp: Self = this.set("shouldForwardProp", js.undefined)
  }
}
