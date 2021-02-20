package typings.thrift.mod

import typings.q.anon.Typeofq
import typings.q.mod.Deferred
import typings.q.mod.IPromise
import typings.q.mod.IWhenable
import typings.q.mod.Promise
import typings.q.mod.PromiseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Q {
  
  /**
    * Calling with nothing at all creates a void promise
    */
  @JSImport("thrift", "Q")
  @js.native
  def apply(): Promise[Unit] = js.native
  @JSImport("thrift", "Q")
  @js.native
  def apply[T](promise: T): Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  @JSImport("thrift", "Q")
  @js.native
  def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
  @JSImport("thrift", "Q")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("thrift", "Q.Promise")
  @js.native
  def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, Unit], 
      Unit
    ]
  ): typings.q.mod.Promise[T] = js.native
  
  @JSImport("thrift", "Q.all")
  @js.native
  def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
  
  @JSImport("thrift", "Q.allResolved")
  @js.native
  def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
  
  @JSImport("thrift", "Q.allSettled")
  @js.native
  def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = js.native
  
  @JSImport("thrift", "Q.all")
  @js.native
  def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = js.native
  @JSImport("thrift", "Q.all")
  @js.native
  def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = js.native
  @JSImport("thrift", "Q.all")
  @js.native
  def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("thrift", "Q.all")
  @js.native
  def all_ABCDE[A, B, C, D, E](
    promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
  ): Promise[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("thrift", "Q.all")
  @js.native
  def all_ABCDEF[A, B, C, D, E, F](
    promises: IWhenable[
      js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
    ]
  ): Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @JSImport("thrift", "Q.async")
  @js.native
  def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  
  @JSImport("thrift", "Q.delay")
  @js.native
  def delay(ms: Double): Promise[Unit] = js.native
  @JSImport("thrift", "Q.delay")
  @js.native
  def delay[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
  @JSImport("thrift", "Q.delay")
  @js.native
  def delay[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
  
  @JSImport("thrift", "Q.denodeify")
  @js.native
  def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.fbind")
  @js.native
  def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.fcall")
  @js.native
  def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.invoke")
  @js.native
  def invoke[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.isFulfilled")
  @js.native
  def isFulfilled(promise: Promise[_]): Boolean = js.native
  
  @JSImport("thrift", "Q.isPending")
  @js.native
  def isPending(promiseOrObject: js.Any): Boolean = js.native
  @JSImport("thrift", "Q.isPending")
  @js.native
  def isPending(promiseOrObject: Promise[_]): Boolean = js.native
  
  @JSImport("thrift", "Q.isPromise")
  @js.native
  def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ Boolean = js.native
  
  @JSImport("thrift", "Q.isPromiseAlike")
  @js.native
  def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ Boolean = js.native
  
  @JSImport("thrift", "Q.isRejected")
  @js.native
  def isRejected(promise: Promise[_]): Boolean = js.native
  
  @JSImport("thrift", "Q.longStackSupport")
  @js.native
  def longStackSupport: Boolean = js.native
  @scala.inline
  def longStackSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longStackSupport")(x.asInstanceOf[js.Any])
  
  @JSImport("thrift", "Q.mcall")
  @js.native
  def mcall[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.nbind")
  @js.native
  def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.nearer")
  @js.native
  def nearer[T](promise: Promise[T]): T = js.native
  
  @JSImport("thrift", "Q.nextTick")
  @js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSImport("thrift", "Q.nfapply")
  @js.native
  def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("thrift", "Q.nfbind")
  @js.native
  def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.nfcall")
  @js.native
  def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.ninvoke")
  @js.native
  def ninvoke[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.noConflict")
  @js.native
  def noConflict(): Typeofq = js.native
  
  @JSImport("thrift", "Q.npost")
  @js.native
  def npost[T](nodeModule: js.Any, functionName: String, args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("thrift", "Q.nsend")
  @js.native
  def nsend[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.onerror")
  @js.native
  def onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
  @scala.inline
  def onerror_=(x: js.Function1[/* reason */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onerror")(x.asInstanceOf[js.Any])
  
  @JSImport("thrift", "Q.promised")
  @js.native
  def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("thrift", "Q.race")
  @js.native
  def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
  
  @JSImport("thrift", "Q.reject")
  @js.native
  def reject[T](): Promise[T] = js.native
  @JSImport("thrift", "Q.reject")
  @js.native
  def reject[T](reason: js.Any): Promise[T] = js.native
  
  @JSImport("thrift", "Q.resolve")
  @js.native
  def resolve[T](): Promise[T] = js.native
  @JSImport("thrift", "Q.resolve")
  @js.native
  def resolve[T](`object`: IWhenable[T]): Promise[T] = js.native
  
  @JSImport("thrift", "Q.send")
  @js.native
  def send[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("thrift", "Q.spread")
  @js.native
  def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("thrift", "Q.spread")
  @js.native
  def spread[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  
  @JSImport("thrift", "Q.timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double): Promise[T] = js.native
  @JSImport("thrift", "Q.timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
  
  @JSImport("thrift", "Q.when")
  @js.native
  def when(): Promise[Unit] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T](value: IWhenable[T]): Promise[T] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("thrift", "Q.when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  
  @JSImport("thrift", "Q.try")
  @js.native
  def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
}
