package typings.atUifabricUtilities.libStyledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizableProps extends js.Object {
  /**
    * List of fields which can be customized.
    * @defaultvalue [ 'theme', 'styles' ]
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name of scope, which can be targeted using the Customizer.
    */
  var scope: String
}

object ICustomizableProps {
  @scala.inline
  def apply(scope: String, fields: js.Array[String] = null): ICustomizableProps = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ICustomizableProps]
  }
}

