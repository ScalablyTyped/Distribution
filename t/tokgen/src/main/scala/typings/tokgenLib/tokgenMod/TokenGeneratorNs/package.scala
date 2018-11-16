package typings
package tokgenLib.tokgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TokenGeneratorNs {
  type Callback = js.Function2[/* error */ js.Any, /* token */ java.lang.String, scala.Unit]
  type Options = scala.Double | java.lang.String | OptionsObject
}
