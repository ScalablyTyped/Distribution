package typings.tarn

import typings.std.PromiseLike
import typings.tarn.promiseInspectionMod.PromiseInspection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("tarn/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkOptionalTime(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkOptionalTime")().asInstanceOf[Boolean]
  inline def checkOptionalTime(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkOptionalTime")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkRequiredTime(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRequiredTime")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
  
  inline def delay(millis: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(millis.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def duration(t1: Double, t2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def reflect[T](promise: js.Promise[T]): js.Promise[PromiseInspection[Any | T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflect")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseInspection[Any | T]]]
  
  inline def tryPromise[T](cb: js.Function0[T | PromiseLike[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryPromise")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  trait Deferred[T] extends StObject {
    
    var promise: js.Promise[T]
    
    def reject[T](err: T): Any
    
    def resolve(`val`: T): Any
  }
  object Deferred {
    
    inline def apply[T](promise: js.Promise[T], reject: Any => Any, resolve: T => Any): Deferred[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Deferred[T]]
    }
    
    extension [Self <: Deferred[?], T](x: Self & Deferred[T]) {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any => Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: T => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
