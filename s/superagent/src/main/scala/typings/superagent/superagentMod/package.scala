package typings.superagent

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import typings.std.Blob
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superagentMod {
  type BrowserParser = js.Function1[/* str */ String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type MultipartValue = MultipartValueSingle | js.Array[MultipartValueSingle]
  type MultipartValueSingle = Blob | Buffer | ReadStream | String | Boolean | Double
  type NodeParser = js.Function2[
    /* res */ Response, 
    /* callback */ js.Function2[/* err */ Error | Null, /* body */ js.Any, Unit], 
    Unit
  ]
  type Parser = BrowserParser | NodeParser
  type Plugin = js.Function1[/* req */ SuperAgentRequest, Unit]
  type Serializer = js.Function1[/* obj */ js.Any, String]
}
