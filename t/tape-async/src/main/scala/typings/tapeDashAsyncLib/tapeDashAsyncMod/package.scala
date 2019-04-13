package typings
package tapeDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tapeDashAsyncMod {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = tapeLib.tapeMod.StreamOptions
  type TestCase = js.Function1[/* test */ Test, scala.Unit | stdLib.Iterator[js.Any] | js.Thenable[scala.Unit]]
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = tapeLib.tapeMod.TestOptions
}
