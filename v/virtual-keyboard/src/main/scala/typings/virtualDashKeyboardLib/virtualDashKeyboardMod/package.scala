package typings
package virtualDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object virtualDashKeyboardMod {
  type kbEventHandler = js.Function3[
    /* event */ js.UndefOr[stdLib.Event | java.lang.String], 
    /* keyboard */ js.UndefOr[stdLib.Element], 
    /* el */ js.UndefOr[stdLib.Element], 
    scala.Unit
  ]
}
