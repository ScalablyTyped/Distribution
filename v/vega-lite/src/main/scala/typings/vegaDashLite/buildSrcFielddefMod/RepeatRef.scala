package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.vegaDashLiteStrings.column
import typings.vegaDashLite.vegaDashLiteStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatRef extends js.Object {
  var repeat: row | column
}

object RepeatRef {
  @scala.inline
  def apply(repeat: row | column): RepeatRef = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepeatRef]
  }
}

