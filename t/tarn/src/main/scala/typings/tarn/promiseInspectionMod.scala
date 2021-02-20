package typings.tarn

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseInspectionMod {
  
  @JSImport("tarn/dist/PromiseInspection", "PromiseInspection")
  @js.native
  class PromiseInspection[T] protected () extends StObject {
    def this(args: PromiseInspectionArgs[T]) = this()
    
    var _error: Error | Unit = js.native
    
    var _value: T | Unit = js.native
    
    def isFulfilled(): Boolean = js.native
    
    def isRejected(): Boolean = js.native
    
    def reason(): Unit | Error = js.native
    
    def value(): Unit | T = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tarn.anon.Error[T]
    - typings.tarn.anon.Value[T]
  */
  trait PromiseInspectionArgs[T] extends StObject
  object PromiseInspectionArgs {
    
    @scala.inline
    def Error[T](value: T): typings.tarn.anon.Error[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tarn.anon.Error[T]]
    }
    
    @scala.inline
    def Value[T](error: Error): typings.tarn.anon.Value[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tarn.anon.Value[T]]
    }
  }
}
