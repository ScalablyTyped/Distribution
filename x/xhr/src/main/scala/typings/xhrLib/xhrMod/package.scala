package typings
package xhrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xhrMod {
  type XhrCallback = js.Function3[/* error */ stdLib.Error, /* response */ XhrResponse, /* body */ js.Any, scala.Unit]
}
