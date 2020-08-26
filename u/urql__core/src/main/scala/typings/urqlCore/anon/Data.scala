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

@js.native
trait Data[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any = js.native
}

object Data {
  @scala.inline
  def apply[/* <: typings.urqlCore.urqlCoreStrings.cacheHit | typings.urqlCore.urqlCoreStrings.cacheInvalidation | typings.urqlCore.urqlCoreStrings.fetchRequest | typings.urqlCore.urqlCoreStrings.fetchSuccess | typings.urqlCore.urqlCoreStrings.fetchError | typings.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */ T](
    data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], /* <: typings.urqlCore.urqlCoreStrings.cacheHit | typings.urqlCore.urqlCoreStrings.cacheInvalidation | typings.urqlCore.urqlCoreStrings.fetchRequest | typings.urqlCore.urqlCoreStrings.fetchSuccess | typings.urqlCore.urqlCoreStrings.fetchError | typings.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */ T] (val x: Self with Data[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

