package typings.urqlCore.anon

import typings.urqlCore.typesMod.DebugEventArg
import typings.urqlCore.urqlCoreStrings.cacheHit
import typings.urqlCore.urqlCoreStrings.cacheInvalidation
import typings.urqlCore.urqlCoreStrings.fetchError
import typings.urqlCore.urqlCoreStrings.fetchRequest
import typings.urqlCore.urqlCoreStrings.fetchSuccess
import typings.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallT extends js.Object {
  def apply(
    t: DebugEventArg[
      String | cacheHit | cacheInvalidation | fetchError | fetchRequest | fetchSuccess | retryRetrying
    ]
  ): Unit = js.native
}

