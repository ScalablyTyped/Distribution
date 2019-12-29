package typings.tapeDashPromise

import org.scalablytyped.runtime.TopLevel
import typings.std.ReturnType
import typings.tapeDashPromise.tapeDashPromiseMod.AsyncTapeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape-promise/tape", JSImport.Namespace)
@js.native
object tapeMod
  extends TopLevel[
      ReturnType[
        js.Function1[
          /* tapeTest */ js.Any, 
          AsyncTapeFunction with (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
        ]
      ]
    ] {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = typings.tape.tapeMod.StreamOptions
  type Test = typings.tapeDashPromise.tapeDashPromiseMod.Test
  type TestCase = typings.tapeDashPromise.tapeDashPromiseMod.TestCase
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = typings.tape.tapeMod.TestOptions
}

