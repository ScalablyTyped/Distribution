package typings.tarn

import typings.tarn.promiseInspectionMod.PromiseInspection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("tarn/dist/utils", "checkOptionalTime")
  @js.native
  def checkOptionalTime(): Boolean = js.native
  @JSImport("tarn/dist/utils", "checkOptionalTime")
  @js.native
  def checkOptionalTime(time: Double): Boolean = js.native
  
  @JSImport("tarn/dist/utils", "checkRequiredTime")
  @js.native
  def checkRequiredTime(time: Double): Boolean = js.native
  
  @JSImport("tarn/dist/utils", "defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  
  @JSImport("tarn/dist/utils", "delay")
  @js.native
  def delay(millis: Double): js.Promise[_] = js.native
  
  @JSImport("tarn/dist/utils", "duration")
  @js.native
  def duration(t1: Double, t2: Double): Double = js.native
  
  @JSImport("tarn/dist/utils", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("tarn/dist/utils", "reflect")
  @js.native
  def reflect[T](promise: js.Promise[T]): js.Promise[PromiseInspection[_ | T]] = js.native
  
  @JSImport("tarn/dist/utils", "tryPromise")
  @js.native
  def tryPromise[T](cb: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
  
  @js.native
  trait Deferred[T] extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject[T](err: T): js.Any = js.native
    
    def resolve(`val`: T): js.Any = js.native
  }
  object Deferred {
    
    @scala.inline
    def apply[T](promise: js.Promise[T], reject: js.Any => js.Any, resolve: T => js.Any): Deferred[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Deferred[T]]
    }
    
    @scala.inline
    implicit class DeferredMutableBuilder[Self <: Deferred[_], T] (val x: Self with Deferred[T]) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReject(value: js.Any => js.Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: T => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
