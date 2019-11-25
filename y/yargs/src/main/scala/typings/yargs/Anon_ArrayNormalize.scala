package typings.yargs

import typings.yargs.yargsNumbers.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayNormalize extends js.Object {
  var normalize: `true`
  var `type`: array
}

object Anon_ArrayNormalize {
  @scala.inline
  def apply(normalize: `true`, `type`: array): Anon_ArrayNormalize = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrayNormalize]
  }
}

