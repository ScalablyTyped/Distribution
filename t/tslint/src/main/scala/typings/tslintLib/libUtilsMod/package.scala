package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMod {
  type Encoding = tslintLib.tslintLibStrings.utf8 | tslintLib.tslintLibStrings.`utf8-bom` | tslintLib.tslintLibStrings.utf16le | tslintLib.tslintLibStrings.utf16be
  type Equal[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
}
