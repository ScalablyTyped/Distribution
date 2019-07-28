package typings.atUifabricStyling.atUifabricStylingMod

import typings.atUifabricMergeDashStyles.libStylesheetMod.IStyleSheetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling", "Stylesheet")
@js.native
class Stylesheet ()
  extends typings.atUifabricStyling.libMergeStylesMod.Stylesheet {
  def this(config: IStyleSheetConfig) = this()
}

/* static members */
@JSImport("@uifabric/styling", "Stylesheet")
@js.native
object Stylesheet extends js.Object {
  /**
    * Gets the singleton instance.
    */
  def getInstance(): typings.atUifabricMergeDashStyles.libStylesheetMod.Stylesheet = js.native
}

