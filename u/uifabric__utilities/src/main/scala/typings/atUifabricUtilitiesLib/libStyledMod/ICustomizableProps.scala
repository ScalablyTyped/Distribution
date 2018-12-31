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

