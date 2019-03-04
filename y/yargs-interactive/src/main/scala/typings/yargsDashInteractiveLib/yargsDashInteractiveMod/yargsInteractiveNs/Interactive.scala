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
    interactive: js.Function1[Option, Interactive],
    `then`: js.Function1[js.Function1[/* result */ js.Any, _], Interactive],
    usage: js.Function1[java.lang.String, Interactive]
  ): Interactive = {
    val __obj = js.Dynamic.literal(interactive = interactive, usage = usage)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Interactive]
  }
}

