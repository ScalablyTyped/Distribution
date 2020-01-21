package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "timeout")
@js.native
object timeout
  extends TopLevel[
      js.Function2[
        /* time */ js.Any, 
        /* scheduler */ js.UndefOr[typings.wonderFrp.coreSchedulerMod.Scheduler], 
        typings.wonderFrp.streamTimeoutStreamMod.TimeoutStream
      ]
    ]

