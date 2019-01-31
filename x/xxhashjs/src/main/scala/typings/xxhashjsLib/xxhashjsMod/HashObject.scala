package typings
package xxhashjsLib.xxhashjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashObject extends js.Object {
  def digest(): UINT = js.native
  def init(seed: scala.Double): this.type = js.native
  def update(data: java.lang.String): this.type = js.native
  def update(data: nodeLib.Buffer): this.type = js.native
  def update(data: stdLib.ArrayBuffer): this.type = js.native
}

