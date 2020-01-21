package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFunctionIdentifier extends js.Object {
  /**
    * Final byte, must be in range \x40 .. \x7e for CSI and DCS,
    * \x30 .. \x7e for ESC.
    */
  var `final`: String
  /**
    * Optional intermediate bytes, must be in range \x20 .. \x2f.
    * Usable in CSI, DCS and ESC.
    */
  var intermediates: js.UndefOr[String] = js.undefined
  /**
    * Optional prefix byte, must be in range \x3c .. \x3f.
    * Usable in CSI and DCS.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object IFunctionIdentifier {
  @scala.inline
  def apply(`final`: String, intermediates: String = null, prefix: String = null): IFunctionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (intermediates != null) __obj.updateDynamic("intermediates")(intermediates.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionIdentifier]
  }
}

