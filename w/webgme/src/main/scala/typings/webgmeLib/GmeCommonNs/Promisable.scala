package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promisable extends js.Object {
  def `catch`(callback: CatchCallback): Promisable
  def `then`(callback: ThenCallback): Promisable
}

object Promisable {
  @scala.inline
  def apply(`catch`: js.Function1[CatchCallback, Promisable], `then`: js.Function1[ThenCallback, Promisable]): Promisable = {
    val __obj = js.Dynamic.literal(`catch` = `catch`, `then` = `then`)
  
    __obj.asInstanceOf[Promisable]
  }
}

