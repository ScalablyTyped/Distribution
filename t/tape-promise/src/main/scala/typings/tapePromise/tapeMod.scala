package typings.tapePromise

import org.scalablytyped.runtime.TopLevel
import typings.std.ReturnType
import typings.tapePromise.mod.AsyncTapeFunction
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
  type StreamOptions = typings.tape.mod.StreamOptions
  type Test = typings.tapePromise.mod.Test
  type TestCase = typings.tapePromise.mod.TestCase
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = typings.tape.mod.TestOptions
}

