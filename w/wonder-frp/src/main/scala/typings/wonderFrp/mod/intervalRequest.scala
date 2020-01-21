package typings.wonderFrp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "intervalRequest")
@js.native
object intervalRequest
  extends TopLevel[
      js.Function1[
        /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
        typings.wonderFrp.intervalRequestStreamMod.IntervalRequestStream
      ]
    ]

