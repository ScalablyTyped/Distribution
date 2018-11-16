package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superagentLib {
  type BrowserParser = js.Function1[/* str */ java.lang.String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ js.Any, scala.Unit]
  type MultipartValue = MultipartValueSingle | js.Array[MultipartValueSingle]
  type MultipartValueSingle = stdLib.Blob | nodeLib.Buffer | js.Any | java.lang.String | scala.Boolean | scala.Double
  type NodeParser = js.Function2[
    /* res */ js.Any, 
    /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* body */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type Parser = BrowserParser | NodeParser
  type Serializer = js.Function1[/* obj */ js.Any, java.lang.String]
}
