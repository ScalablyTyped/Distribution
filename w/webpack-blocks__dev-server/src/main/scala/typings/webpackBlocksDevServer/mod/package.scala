package typings.webpackBlocksDevServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InjectClientFunction = js.Function1[/* compilerConfig */ js.Any, scala.Boolean]
  
  type PathFunction = js.Function0[java.lang.String]
  
  type ProxyFunction = js.Function3[
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* proxy */ js.Any, 
    js.UndefOr[
      scala.Null | typings.webpackBlocksDevServer.webpackBlocksDevServerBooleans.`false` | java.lang.String
    ]
  ]
  
  type ProxyType = js.Object | typings.webpackBlocksDevServer.mod.ProxyFunction
  
  type RewritesToFunction = js.Function1[/* context */ typings.webpackBlocksDevServer.mod.ContextObject, java.lang.String]
  
  type SetHeadersFunction = js.Function3[/* res */ js.Object, /* path */ java.lang.String, /* stat */ js.Object, scala.Unit]
  
  type StartMiddlewareFunction = js.Function2[/* app */ js.Any, /* server */ js.Any, scala.Unit]
  
  type WriteToDiskFunction = js.Function1[/* filePath */ java.lang.String, scala.Boolean]
}
