package typings.wonderFrp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "fromPromise")
@js.native
object fromPromise
  extends TopLevel[
      js.Function2[
        /* promise */ js.Any, 
        /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
        typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream
      ]
    ]

