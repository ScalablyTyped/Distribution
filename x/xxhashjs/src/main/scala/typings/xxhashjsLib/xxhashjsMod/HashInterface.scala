package typings
package xxhashjsLib.xxhashjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashInterface extends js.Object {
  def apply(): HashObject = js.native
  def apply(data: java.lang.String, seed: scala.Double): UINT = js.native
  def apply(data: nodeLib.Buffer, seed: scala.Double): UINT = js.native
  def apply(data: stdLib.ArrayBuffer, seed: scala.Double): UINT = js.native
  def apply(seed: scala.Double): HashObject = js.native
}

