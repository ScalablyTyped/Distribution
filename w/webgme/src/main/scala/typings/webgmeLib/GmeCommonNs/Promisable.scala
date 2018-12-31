package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promisable extends js.Object {
  def `catch`(callback: CatchCallback): Promisable
  def `then`(callback: ThenCallback): Promisable
}

