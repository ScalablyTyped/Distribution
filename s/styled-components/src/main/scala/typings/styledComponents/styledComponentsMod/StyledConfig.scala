package typings.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledConfig[O /* <: js.Object */] extends js.Object {
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
  def apply[O /* <: js.Object */](
    shouldForwardProp: (/* keyof O */ /* prop */ String, /* defaultValidatorFn */ js.Function1[/* keyof O */ /* prop */ String, Boolean]) => Boolean = null
  ): StyledConfig[O] = {
    val __obj = js.Dynamic.literal()
    if (shouldForwardProp != null) __obj.updateDynamic("shouldForwardProp")(js.Any.fromFunction2(shouldForwardProp))
    __obj.asInstanceOf[StyledConfig[O]]
  }
}

