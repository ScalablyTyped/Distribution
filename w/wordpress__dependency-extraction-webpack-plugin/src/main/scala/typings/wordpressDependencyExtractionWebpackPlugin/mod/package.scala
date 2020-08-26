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
  type WebpackCompiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  type WebpackExternalsFunction = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ /* callback */ js.Any, 
    js.Any
  ]
}
