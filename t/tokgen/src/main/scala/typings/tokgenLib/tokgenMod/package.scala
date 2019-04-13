package typings
package tokgenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokgenMod {
  type Callback = js.Function2[/* error */ js.Any, /* token */ java.lang.String, scala.Unit]
  type Options = scala.Double | java.lang.String | OptionsObject
}
