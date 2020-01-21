package typings.wonderFrp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "interval")
@js.native
object interval
  extends TopLevel[
      js.Function2[
        /* interval */ js.Any, 
        /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
        typings.wonderFrp.intervalStreamMod.IntervalStream
      ]
    ]

