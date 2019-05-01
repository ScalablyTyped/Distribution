package typings
package superagentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superagentMod {
  type BrowserParser = js.Function1[/* str */ java.lang.String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]
  type MultipartValue = MultipartValueSingle | js.Array[MultipartValueSingle]
  type MultipartValueSingle = stdLib.Blob | nodeLib.Buffer | nodeLib.fsMod.ReadStream | java.lang.String | scala.Boolean | scala.Double
  type NodeParser = js.Function2[
    /* res */ Response, 
    /* callback */ js.Function2[/* err */ stdLib.Error | scala.Null, /* body */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type Parser = BrowserParser | NodeParser
  type Plugin = js.Function1[/* req */ SuperAgentRequest, scala.Unit]
  type Serializer = js.Function1[/* obj */ js.Any, java.lang.String]
}
