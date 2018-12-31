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

