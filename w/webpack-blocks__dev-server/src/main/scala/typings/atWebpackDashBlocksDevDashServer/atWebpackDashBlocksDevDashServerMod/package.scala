package typings.atWebpackDashBlocksDevDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWebpackDashBlocksDevDashServerMod {
  import typings.atWebpackDashBlocksDevDashServer.atWebpackDashBlocksDevDashServerNumbers.`false`

  type InjectClientFunction = js.Function1[/* compilerConfig */ js.Any, Boolean]
  type PathFunction = js.Function0[String]
  type ProxyFunction = js.Function3[
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* proxy */ js.Any, 
    js.UndefOr[Null | `false` | String]
  ]
  type ProxyType = js.Object | ProxyFunction
  type RewritesToFunction = js.Function1[/* context */ ContextObject, String]
  type SetHeadersFunction = js.Function3[/* res */ js.Object, /* path */ String, /* stat */ js.Object, Unit]
  type StartMiddlewareFunction = js.Function2[/* app */ js.Any, /* server */ js.Any, Unit]
  type WriteToDiskFunction = js.Function1[/* filePath */ String, Boolean]
}
