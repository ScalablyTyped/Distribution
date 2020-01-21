package typings.uifabricUtilities.styledMod

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
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizableProps]
  }
}

