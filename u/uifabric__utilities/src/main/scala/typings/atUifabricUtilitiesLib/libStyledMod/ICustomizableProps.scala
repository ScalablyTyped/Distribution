package typings
package atUifabricUtilitiesLib.libStyledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizableProps extends js.Object {
  /**
    * List of fields which can be customized.
    * @defaultvalue [ 'theme', 'styles' ]
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Name of scope, which can be targeted using the Customizer.
    */
  var scope: java.lang.String
}

object ICustomizableProps {
  @scala.inline
  def apply(scope: java.lang.String, fields: js.Array[java.lang.String] = null): ICustomizableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ICustomizableProps]
  }
}

