package typings.webpackBlocksCore.mod

import typings.webpackBlocksCore.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var `match`: Test
}

object Context {
  @scala.inline
  def apply(`match`: Test): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

