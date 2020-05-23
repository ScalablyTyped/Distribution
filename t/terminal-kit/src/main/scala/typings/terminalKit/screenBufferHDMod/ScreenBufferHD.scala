package typings.terminalKit.screenBufferHDMod

import typings.terminalKit.anon.AttrChar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typings.terminalKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: typings.terminalKit.anon.Blending): Unit = js.native
  def fill(options: AttrChar): Unit = js.native
}

