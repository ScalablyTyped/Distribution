package typings
package swDashPrecacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swDashPrecacheMod {
  type Generate = js.Function2[
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[
      js.Function2[
        /* error */ nodeLib.NodeJSNs.ErrnoException, 
        /* serviceWorkerString */ java.lang.String, 
        scala.Unit
      ]
    ], 
    stdLib.Promise[java.lang.String]
  ]
  type Handler = swDashPrecacheLib.swDashPrecacheLibStrings.networkFirst | swDashPrecacheLib.swDashPrecacheLibStrings.cacheFirst | swDashPrecacheLib.swDashPrecacheLibStrings.fastest | swDashPrecacheLib.swDashPrecacheLibStrings.cacheOnly | swDashPrecacheLib.swDashPrecacheLibStrings.networkOnly | swDashToolboxLib.swDashToolboxMod.Handler
  type Method = swDashPrecacheLib.swDashPrecacheLibStrings.get | swDashPrecacheLib.swDashPrecacheLibStrings.post | swDashPrecacheLib.swDashPrecacheLibStrings.put | swDashPrecacheLib.swDashPrecacheLibStrings.delete | swDashPrecacheLib.swDashPrecacheLibStrings.head
  type Write = js.Function3[
    /* filePath */ java.lang.String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]], 
    stdLib.Promise[java.lang.String]
  ]
}
