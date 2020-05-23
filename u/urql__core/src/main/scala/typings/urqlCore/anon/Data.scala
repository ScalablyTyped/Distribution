package typings.urqlCore.anon

import typings.urqlCore.urqlCoreStrings.cacheHit
import typings.urqlCore.urqlCoreStrings.cacheInvalidation
import typings.urqlCore.urqlCoreStrings.fetchError
import typings.urqlCore.urqlCoreStrings.fetchRequest
import typings.urqlCore.urqlCoreStrings.fetchSuccess
import typings.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
}

object Data {
  @scala.inline
  def apply[T](
    data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

