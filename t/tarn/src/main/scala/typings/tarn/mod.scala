package typings.tarn

import typings.std.Error
import typings.tarn.poolMod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tarn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Pool[T] protected ()
    extends typings.tarn.poolMod.Pool[T] {
    def this(opt: PoolOptions[T]) = this()
  }
  
  @js.native
  class TimeoutError () extends Error
}
