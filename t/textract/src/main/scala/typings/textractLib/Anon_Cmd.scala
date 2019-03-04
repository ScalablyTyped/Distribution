package typings
package textractLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmd extends js.Object {
  /**
    * `tesseract.lang` allows a quick means to provide the most popular tesseract option,
    * but if you need to configure more options, you can simply pass `cmd`.
    * `cmd` is the string that matches the command-line options you want to pass to tesseract.
    * For instance, to provide language and psm,
    * you would pass `{ tesseract: { cmd:"-l chi_sim -psm 10" } }`
    */
  var cmd: java.lang.String
}

object Anon_Cmd {
  @scala.inline
  def apply(cmd: java.lang.String): Anon_Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd)
  
    __obj.asInstanceOf[Anon_Cmd]
  }
}

