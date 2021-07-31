package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledConfig[O /* <: js.Object */] extends StObject {
  
  // TODO: Add all types from the original StyledComponentWrapperProperties
  var shouldForwardProp: js.UndefOr[
    js.Function2[
      /* keyof O */ /* prop */ String, 
      /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean], 
      Boolean
    ]
  ] = js.undefined
}
object StyledConfig {
  
  @scala.inline
  def apply[O /* <: js.Object */](): StyledConfig[O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledConfig[O]]
  }
  
  @scala.inline
  implicit class StyledConfigMutableBuilder[Self <: StyledConfig[?], O /* <: js.Object */] (val x: Self & StyledConfig[O]) extends AnyVal {
    
    @scala.inline
    def setShouldForwardProp(
      value: (/* keyof O */ /* prop */ String, /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean]) => Boolean
    ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
  }
}
