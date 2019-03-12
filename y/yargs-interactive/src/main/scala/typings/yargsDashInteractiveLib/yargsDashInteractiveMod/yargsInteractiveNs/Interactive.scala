package typings
package yargsDashInteractiveLib.yargsDashInteractiveMod.yargsInteractiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interactive extends js.Object {
  def interactive(options: Option): Interactive
  def `then`(callback: js.Function1[/* result */ js.Any, _]): Interactive
  def usage(usage: java.lang.String): Interactive
}

object Interactive {
  @scala.inline
  def apply(
    interactive: Option => Interactive,
    `then`: js.Function1[/* result */ js.Any, _] => Interactive,
    usage: java.lang.String => Interactive
  ): Interactive = {
    val __obj = js.Dynamic.literal(interactive = js.Any.fromFunction1(interactive), usage = js.Any.fromFunction1(usage))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Interactive]
  }
}

