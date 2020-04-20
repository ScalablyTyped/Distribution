package typings.textract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCmd extends js.Object {
  /**
    * `tesseract.lang` allows a quick means to provide the most popular tesseract option,
    * but if you need to configure more options, you can simply pass `cmd`.
    * `cmd` is the string that matches the command-line options you want to pass to tesseract.
    * For instance, to provide language and psm,
    * you would pass `{ tesseract: { cmd:"-l chi_sim -psm 10" } }`
    */
  var cmd: String
}

object AnonCmd {
  @scala.inline
  def apply(cmd: String): AnonCmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCmd]
  }
}

