package typings
package xxhashjsLib.xxhashjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashObject extends js.Object {
  def digest(): scala.Double = js.native
  def init(seed: scala.Double): this.type = js.native
  def update(data: java.lang.String): this.type = js.native
  def update(data: stdLib.ArrayBuffer): this.type = js.native
}

