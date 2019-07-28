package typings.tapeDashAsync

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tapeDashAsyncMod {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = typings.tape.tapeMod.StreamOptions
  type TestCase = js.Function1[/* test */ Test, Unit | Iterator[js.Any] | js.Thenable[Unit]]
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = typings.tape.tapeMod.TestOptions
}
