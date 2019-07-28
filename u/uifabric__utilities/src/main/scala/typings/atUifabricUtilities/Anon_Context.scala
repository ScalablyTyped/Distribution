package typings.atUifabricUtilities

import typings.atUifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Optional transform function for context. Any implementations should take care to return context without
    * mutating it.
    */
  var contextTransform: js.UndefOr[js.Function1[/* context */ ICustomizerContext, ICustomizerContext]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(contextTransform: /* context */ ICustomizerContext => ICustomizerContext = null): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(js.Any.fromFunction1(contextTransform))
    __obj.asInstanceOf[Anon_Context]
  }
}

