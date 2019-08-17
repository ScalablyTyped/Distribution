package typings.atUifabricFoundation.libIComponentMod

import typings.atUifabricFoundation.atUifabricFoundationStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFactoryOptions[TProps] extends js.Object {
  /**
    * Default prop for which to map primitive values.
    */
  var defaultProp: js.UndefOr[String | children] = js.undefined
}

object IFactoryOptions {
  @scala.inline
  def apply[TProps](defaultProp: String | children = null): IFactoryOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    if (defaultProp != null) __obj.updateDynamic("defaultProp")(defaultProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFactoryOptions[TProps]]
  }
}

