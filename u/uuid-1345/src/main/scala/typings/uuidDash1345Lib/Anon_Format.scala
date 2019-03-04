package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: java.lang.String
  var variant: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: java.lang.String, variant: java.lang.String, version: scala.Int | scala.Double = null): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, variant = variant)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

