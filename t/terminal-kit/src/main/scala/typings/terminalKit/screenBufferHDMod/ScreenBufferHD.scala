package typings.terminalKit.screenBufferHDMod

import typings.terminalKit.AnonAttrCharAttributes
import typings.terminalKit.AnonBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typings.terminalKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: AnonBlending): Unit = js.native
  def fill(options: AnonAttrCharAttributes): Unit = js.native
}

