package typings
package tapeDashAsyncLib.tapeDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tapeNs {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = tapeLib.tapeMod.tapeNs.StreamOptions
  type TestCase = js.Function1[/* test */ Test, scala.Unit | nodeLib.Iterator[js.Any] | js.Thenable[scala.Unit]]
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = tapeLib.tapeMod.tapeNs.TestOptions
}
