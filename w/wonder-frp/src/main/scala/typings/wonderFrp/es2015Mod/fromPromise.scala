package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "fromPromise")
@js.native
object fromPromise
  extends TopLevel[
      js.Function2[
        /* promise */ js.Any, 
        /* scheduler */ js.UndefOr[typings.wonderFrp.coreSchedulerMod.Scheduler], 
        typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream
      ]
    ]

