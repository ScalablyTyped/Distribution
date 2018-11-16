package typings
package tv4Lib.tv4Mod.tv4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationError extends js.Object {
  var code: scala.Double
  var dataPath: js.UndefOr[java.lang.String] = js.undefined
  var message: js.Any
  var schemaPath: js.UndefOr[java.lang.String] = js.undefined
  var subErrors: js.UndefOr[js.Array[ValidationError]] = js.undefined
}

