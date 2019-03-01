package typings
package wonderDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugCollision extends js.Object {
  var debugCollision: scala.Boolean
  var isTest: scala.Boolean
  var showDebugPanel: scala.Boolean
}

object Anon_DebugCollision {
  @scala.inline
  def apply(debugCollision: scala.Boolean, isTest: scala.Boolean, showDebugPanel: scala.Boolean): Anon_DebugCollision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debugCollision")(debugCollision)
    __obj.updateDynamic("isTest")(isTest)
    __obj.updateDynamic("showDebugPanel")(showDebugPanel)
    __obj.asInstanceOf[Anon_DebugCollision]
  }
}

