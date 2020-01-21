package typings.swPrecache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Generate_ = js.Function2[
    /* options */ js.UndefOr[typings.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[
      js.Function2[
        /* error */ typings.node.NodeJS.ErrnoException, 
        /* serviceWorkerString */ java.lang.String, 
        scala.Unit
      ]
    ], 
    js.Promise[java.lang.String]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.swPrecache.swPrecacheStrings.networkFirst
    - typings.swPrecache.swPrecacheStrings.cacheFirst
    - typings.swPrecache.swPrecacheStrings.fastest
    - typings.swPrecache.swPrecacheStrings.cacheOnly
    - typings.swPrecache.swPrecacheStrings.networkOnly
    - typings.swToolbox.mod.Handler
  */
  type Handler = typings.swPrecache.mod._Handler | typings.swToolbox.mod.Handler
  type Write_ = js.Function3[
    /* filePath */ java.lang.String, 
    /* options */ js.UndefOr[typings.swPrecache.mod.Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ typings.node.NodeJS.ErrnoException, scala.Unit]], 
    js.Promise[java.lang.String]
  ]
}
