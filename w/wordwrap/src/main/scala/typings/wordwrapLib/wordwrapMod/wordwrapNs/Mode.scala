package typings
package wordwrapLib.wordwrapMod.wordwrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In "soft" mode, split chunks by `/(\S+\s+/` and don't break up chunks
  * which are longer than `stop - start`, in "hard" mode, split chunks with
  * `/\b/` and break up chunks longer than `stop - start`.
  */
/* Rewritten from type alias, can be one of: 
  - wordwrapLib.wordwrapLibStrings.soft
  - wordwrapLib.wordwrapLibStrings.hard
*/
trait Mode extends js.Object

