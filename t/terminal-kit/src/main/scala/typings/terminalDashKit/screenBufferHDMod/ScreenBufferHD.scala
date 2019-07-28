package typings.terminalDashKit.screenBufferHDMod

import typings.terminalDashKit.Anon_AttrCharAttributes
import typings.terminalDashKit.Anon_Blending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typings.terminalDashKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: Anon_Blending): Unit = js.native
  def fill(options: Anon_AttrCharAttributes): Unit = js.native
}

