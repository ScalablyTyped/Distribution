package typings
package xxhashjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data extends js.Object {
  @JSName("h32")
  var h32_Original: xxhashjsLib.xxhashjsMod.HashInterface = js.native
  @JSName("h64")
  var h64_Original: xxhashjsLib.xxhashjsMod.HashInterface = js.native
  def h32(): xxhashjsLib.xxhashjsMod.HashObject = js.native
  def h32(data: java.lang.String, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h32(data: nodeLib.Buffer, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h32(data: stdLib.ArrayBuffer, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h32(seed: scala.Double): xxhashjsLib.xxhashjsMod.HashObject = js.native
  def h64(): xxhashjsLib.xxhashjsMod.HashObject = js.native
  def h64(data: java.lang.String, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h64(data: nodeLib.Buffer, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h64(data: stdLib.ArrayBuffer, seed: scala.Double): xxhashjsLib.xxhashjsMod.UINT = js.native
  def h64(seed: scala.Double): xxhashjsLib.xxhashjsMod.HashObject = js.native
}

