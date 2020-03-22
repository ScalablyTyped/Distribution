package typings.xtermAddonFit.mod

import typings.xterm.mod.ITerminalAddon
import typings.xterm.mod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xterm-addon-fit", "FitAddon")
@js.native
/**
  * Creates a new fit addon.
  */
class FitAddon () extends ITerminalAddon {
  /**
    * This is called when the addon is activated.
    */
  /* CompleteClass */
  override def activate(terminal: Terminal): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Resizes the terminal to the dimensions of its containing element.
    */
  def fit(): Unit = js.native
  /**
    * Gets the proposed dimensions that will be used for a fit.
    */
  def proposeDimensions(): ITerminalDimensions = js.native
}

