package typings.wordpressDependencyExtractionWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Map module request to an external.
    */
  type RequestToExternal = js.Function1[
    /* request */ java.lang.String, 
    java.lang.String | scala.Unit | js.Array[java.lang.String]
  ]
  /**
    * Map module request to a script handle.
    */
  type RequestToHandle = js.Function1[/* request */ java.lang.String, java.lang.String | scala.Unit]
  type WebpackCompiler = typings.webpack.mod.Compiler_
  type WebpackExternalsFunction = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ typings.webpack.mod.ExternalsFunctionCallback, 
    js.Any
  ]
}
