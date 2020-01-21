package typings.superagent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserParser = js.Function1[/* str */ java.lang.String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typings.superagent.mod.Response, scala.Unit]
  type MultipartValue = typings.superagent.mod.MultipartValueSingle | js.Array[typings.superagent.mod.MultipartValueSingle]
  type MultipartValueSingle = typings.std.Blob | typings.node.Buffer | typings.node.fsMod.ReadStream | java.lang.String | scala.Boolean | scala.Double
  type NodeParser = js.Function2[
    /* res */ typings.superagent.mod.Response, 
    /* callback */ js.Function2[/* err */ typings.std.Error | scala.Null, /* body */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type Parser = typings.superagent.mod.BrowserParser | typings.superagent.mod.NodeParser
  type Plugin = js.Function1[/* req */ typings.superagent.mod.SuperAgentRequest, scala.Unit]
  type Serializer = js.Function1[/* obj */ js.Any, java.lang.String]
}
