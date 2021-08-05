package typings.thrift.mod

import typings.q.anon.Typeofq
import typings.q.mod.Deferred
import typings.q.mod.IPromise
import typings.q.mod.IWhenable
import typings.q.mod.Promise
import typings.q.mod.PromiseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Q {
  
  /**
    * Calling with nothing at all creates a void promise
    */
  inline def apply(): Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Promise[Unit]]
  inline def apply[T](promise: T): Promise[T] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  inline def apply[T](promise: js.Thenable[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  
  @JSImport("thrift", "Q")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, Unit], 
      Unit
    ]
  ): typings.q.mod.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Promise")(resolver.asInstanceOf[js.Any]).asInstanceOf[typings.q.mod.Promise[T]]
  
  inline def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[T]]]
  
  inline def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResolved")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[Promise[T]]]]
  
  inline def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[PromiseState[T]]]]
  
  inline def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Tuple2[A, B]]]
  
  inline def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Tuple3[A, B, C]]]
  
  inline def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Tuple4[A, B, C, D]]]
  
  inline def all_ABCDE[A, B, C, D, E](
    promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
  ): Promise[js.Tuple5[A, B, C, D, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Tuple5[A, B, C, D, E]]]
  
  inline def all_ABCDEF[A, B, C, D, E, F](
    promises: IWhenable[
      js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
    ]
  ): Promise[js.Tuple6[A, B, C, D, E, F]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Tuple6[A, B, C, D, E, F]]]
  
  inline def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
  
  inline def delay(ms: Double): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  inline def delay[T](promiseOrValue: T, ms: Double): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(promiseOrValue.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def delay[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(promiseOrValue.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("denodeify")(nodeFunction.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fbind")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fcall")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def invoke[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(obj.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def isFulfilled(promise: Promise[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFulfilled")(promise.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPending(promiseOrObject: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPending")(promiseOrObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPending(promiseOrObject: Promise[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPending")(promiseOrObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is q.q.Promise<any> */ Boolean]
  
  inline def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromiseAlike")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is q.q.IPromise<any> */ Boolean]
  
  inline def isRejected(promise: Promise[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(promise.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("thrift", "Q.longStackSupport")
  @js.native
  def longStackSupport: Boolean = js.native
  inline def longStackSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longStackSupport")(x.asInstanceOf[js.Any])
  
  inline def mcall[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mcall")(obj.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, js.Any], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nbind")(nodeFunction.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def nearer[T](promise: Promise[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nearer")(promise.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def nextTick(callback: js.Function1[/* repeated */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Array[js.Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nfapply")(nodeFunction.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nfbind")(nodeFunction.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nfcall")(nodeFunction.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def ninvoke[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ninvoke")(nodeModule.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def noConflict(): Typeofq = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Typeofq]
  
  inline def npost[T](nodeModule: js.Any, functionName: String, args: js.Array[js.Any]): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("npost")(nodeModule.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def nsend[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsend")(nodeModule.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  @JSImport("thrift", "Q.onerror")
  @js.native
  def onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
  inline def onerror_=(x: js.Function1[/* reason */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onerror")(x.asInstanceOf[js.Any])
  
  inline def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promised")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Promise[T]]]
  
  inline def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(promises.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  
  inline def reject[T](): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")().asInstanceOf[Promise[T]]
  inline def reject[T](reason: js.Any): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  
  inline def resolve[T](): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Promise[T]]
  inline def resolve[T](`object`: IWhenable[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(`object`.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  
  inline def send[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(obj.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("spread")(promises.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  inline def spread[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("spread")(promises.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  
  inline def timeout[T](promise: Promise[T], ms: Double): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(promise.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  inline def timeout[T](promise: Promise[T], ms: Double, message: String): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(promise.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def when(): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")().asInstanceOf[Promise[Unit]]
  inline def when[T](value: IWhenable[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  inline def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  inline def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  inline def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, js.Any]
  ): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  inline def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, js.Any]
  ): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
  inline def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Unit,
    onProgress: js.Function1[/* progress */ js.Any, js.Any]
  ): Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(value.asInstanceOf[js.Any], onFulfilled.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[Promise[U]]
}
