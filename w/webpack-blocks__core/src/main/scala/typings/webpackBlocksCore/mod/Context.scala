package typings.webpackBlocksCore.mod

import typings.webpackBlocksCore.AnonTest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var `match`: AnonTest
}

object Context {
  @scala.inline
  def apply(`match`: AnonTest): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

