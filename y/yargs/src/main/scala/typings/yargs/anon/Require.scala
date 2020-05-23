package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Require extends js.Object {
  var require: java.lang.String | `true`
}

object Require {
  @scala.inline
  def apply(require: java.lang.String | `true`): Require = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
}

