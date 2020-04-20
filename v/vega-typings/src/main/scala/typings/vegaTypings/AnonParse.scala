package typings.vegaTypings

import typings.vegaTypings.dataMod.Parse
import typings.vegaTypings.dataMod._Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends _Format {
  var parse: Parse
}

object AnonParse {
  @scala.inline
  def apply(parse: Parse): AnonParse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParse]
  }
}

