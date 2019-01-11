package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When")
@js.native
object ^ extends js.Object {
  /**
    * Return a promise that will resolve only once all the supplied promisesOrValues
    * have resolved. The resolution value of the returned promise will be an array
    * containing the resolution values of each of the promisesOrValues.
    * @memberOf when
    *
    * @param promisesOrValues array of anything, may contain a mix
    *      of {@link Promise}s and values
    */
  def all[T](promisesOrValues: js.Array[_]): whenLib.WhenNs.Promise[T] = js.native
  def attempt[T](f: whenLib.WhenNs.underscoreNs.Fn0[T]): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, T](f: whenLib.WhenNs.underscoreNs.Fn1[A1, T], arg1: A1): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, T](f: whenLib.WhenNs.underscoreNs.Fn1[A1, T], arg1: whenLib.WhenNs.Promise[A1]): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, T](f: whenLib.WhenNs.underscoreNs.Fn2[A1, A2, T], arg1: A1, arg2: A2): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, T](f: whenLib.WhenNs.underscoreNs.Fn2[A1, A2, T], arg1: A1, arg2: whenLib.WhenNs.Promise[A2]): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, T](f: whenLib.WhenNs.underscoreNs.Fn2[A1, A2, T], arg1: whenLib.WhenNs.Promise[A1], arg2: A2): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, T](
    f: whenLib.WhenNs.underscoreNs.Fn2[A1, A2, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: A3): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, T](
    f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: A1,
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: A2,
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: A3,
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: A4
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, T](
    f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T],
    arg1: whenLib.WhenNs.Promise[A1],
    arg2: whenLib.WhenNs.Promise[A2],
    arg3: whenLib.WhenNs.Promise[A3],
    arg4: whenLib.WhenNs.Promise[A4]
  ): whenLib.WhenNs.Promise[T] = js.native
  def attempt[A1, A2, A3, A4, A5, T](
    f: whenLib.WhenNs.underscoreNs.Fn5[A1, A2, A3, A4, A5, T],
    arg1: A1 | whenLib.WhenNs.Promise[A1],
    arg2: A2 | whenLib.WhenNs.Promise[A2],
    arg3: A3 | whenLib.WhenNs.Promise[A3],
    arg4: A4 | whenLib.WhenNs.Promise[A4],
    arg5: A5 | whenLib.WhenNs.Promise[A5]
  ): whenLib.WhenNs.Promise[T] = js.native
  /**
    * Creates a {promise, resolver} pair, either or both of which
    * may be given out safely to consumers.
    * The resolver has resolve, reject, and progress.  The promise
    * has then plus extended promise API.
    */
  def defer[T](): whenLib.WhenNs.Deferred[T] = js.native
  /**
    * Generates a potentially infinite stream of promises by repeatedly calling f until predicate becomes true.
    * @memberOf when
    * @param f function that, given a seed, returns the next value or a promise for it.
    * @param predicate function that receives the current iteration value, and should return truthy when the iterating should stop
    * @param handler function that receives each value as it is produced by f. It may return a promise to delay the next iteration.
    * @param seed initial value provided to the handler, and first f invocation. May be a promise.
    */
  def iterate[U](
    f: js.Function1[/* seed */ U, U | whenLib.WhenNs.Promise[U]],
    predicate: js.Function1[/* value */ U, scala.Boolean],
    handler: js.Function1[/* value */ U, whenLib.WhenNs.Promise[_] | scala.Unit],
    seed: U
  ): whenLib.WhenNs.Promise[U] = js.native
  def iterate[U](
    f: js.Function1[/* seed */ U, U | whenLib.WhenNs.Promise[U]],
    predicate: js.Function1[/* value */ U, scala.Boolean],
    handler: js.Function1[/* value */ U, whenLib.WhenNs.Promise[_] | scala.Unit],
    seed: whenLib.WhenNs.Promise[U]
  ): whenLib.WhenNs.Promise[U] = js.native
  /**
    * Joins multiple promises into a single returned promise.
    * @return a promise that will fulfill when *all* the input promises
    * have fulfilled, or will reject when *any one* of the input promises rejects.
    */
  def join[T](promises: (js.Any | whenLib.WhenNs.Promise[T])*): whenLib.WhenNs.Promise[js.Array[T]] = js.native
  def lift[T](f: whenLib.WhenNs.underscoreNs.Fn0[T]): whenLib.WhenNs.underscoreNs.LiftedFn0[T] = js.native
  def lift[A1, T](f: whenLib.WhenNs.underscoreNs.Fn1[A1, T]): whenLib.WhenNs.underscoreNs.LiftedFn1[A1, T] = js.native
  def lift[A1, A2, T](f: whenLib.WhenNs.underscoreNs.Fn2[A1, A2, T]): whenLib.WhenNs.underscoreNs.LiftedFn2[A1, A2, T] = js.native
  def lift[A1, A2, A3, T](f: whenLib.WhenNs.underscoreNs.Fn3[A1, A2, A3, T]): whenLib.WhenNs.underscoreNs.LiftedFn3[A1, A2, A3, T] = js.native
  def lift[A1, A2, A3, A4, T](f: whenLib.WhenNs.underscoreNs.Fn4[A1, A2, A3, A4, T]): whenLib.WhenNs.underscoreNs.LiftedFn4[A1, A2, A3, A4, T] = js.native
  def lift[A1, A2, A3, A4, A5, T](f: whenLib.WhenNs.underscoreNs.Fn5[A1, A2, A3, A4, A5, T]): whenLib.WhenNs.underscoreNs.LiftedFn5[A1, A2, A3, A4, A5, T] = js.native
  /**
    * Promise-aware array map function, similar to `Array.prototype.map()`,
    * but input array may contain promises or values.
    * @param promisesOrValues array of anything, may contain a mix of {@link Promise}s and values
    * @param mapFunc map function which may return a promise or value
    * @returns a promise that will fulfill with an array of mapped values
    *  or reject if any input promise rejects.
    */
  def map[T](
    promisesOrValues: js.Array[_],
    mapFunc: js.Function2[/* value */ js.Any, /* index */ scala.Double, _]
  ): whenLib.WhenNs.Promise[T] = js.native
  def promise[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ T, scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): whenLib.WhenNs.Promise[T] = js.native
  /**
    * Traditional reduce function, similar to `Array.prototype.reduce()`, but
    * input may contain promises and/or values, and reduceFunc
    * may return either a value or a promise, *and* initialValue may
    * be a promise for the starting value.
    * @param promisesOrValues array or promise for an array of anything,
    *      may contain a mix of promises and values.
    * @param reduceFunc function(accumulated:*, x:*, index:number):*} f reduce function
    * @returns a promise that will resolve to the final reduced value
    */
  def reduce[T](
    promisesOrValues: js.Array[_],
    reduceFunc: js.Function3[
      /* reduction */ T, 
      /* value */ js.Any, 
      /* index */ scala.Double, 
      T | whenLib.WhenNs.Promise[T]
    ],
    initialValue: T
  ): whenLib.WhenNs.Promise[T] = js.native
  /**
    * Traditional reduce function, similar to `Array.prototype.reduceRight()`, but
    * input may contain promises and/or values, and reduceFunc
    * may return either a value or a promise, *and* initialValue may
    * be a promise for the starting value.
    * @param promisesOrValues array or promise for an array of anything,
    *      may contain a mix of promises and values.
    * @param reduceFunc function(accumulated:*, x:*, index:number):*} f reduce function
    * @returns a promise that will resolve to the final reduced value
    */
  def reduceRight[T](
    promisesOrValues: js.Array[_],
    reduceFunc: js.Function3[
      /* reduction */ T, 
      /* value */ js.Any, 
      /* index */ scala.Double, 
      T | whenLib.WhenNs.Promise[T]
    ],
    initialValue: T
  ): whenLib.WhenNs.Promise[T] = js.native
  def reject[T](reason: js.Any): whenLib.WhenNs.Promise[T] = js.native
  /**
    * Returns a resolved promise. The returned promise will be
    *  - fulfilled with promiseOrValue if it is a value, or
    *  - if promiseOrValue is a promise
    *    - fulfilled with promiseOrValue's value after it is fulfilled
    *    - rejected with promiseOrValue's reason after it is rejected
    */
  def resolve(): whenLib.WhenNs.Promise[scala.Unit] = js.native
  def resolve[T](promiseOrValue: T): whenLib.WhenNs.Promise[T] = js.native
  def resolve[T](promiseOrValue: whenLib.WhenNs.Promise[T]): whenLib.WhenNs.Promise[T] = js.native
  def resolve[T](promiseOrValue: whenLib.WhenNs.Thenable[T]): whenLib.WhenNs.Promise[T] = js.native
  /**
    * Returns a promise for an array containing the same number of elements as the input array.
    * Each element is a descriptor object describing of the outcome of the corresponding element in the input.
    * The returned promise will only reject if array itself is a rejected promise. Otherwise,
    * it will always fulfill with an array of descriptors. This is in contrast to when.all,
    * which will reject if any element of array rejects.
    * @memberOf when
    *
    * @param promisesOrValues array of anything, may contain a mix
    *      of {@link Promise}s and values
    */
  def settle[T](promisesOrValues: js.Array[_]): whenLib.WhenNs.Promise[js.Array[whenLib.WhenNs.Descriptor[T]]] = js.native
  /**
    * Similar to when/iterate, when.unfold generates a potentially infinite stream of promises by repeatedly calling
    * unspool until predicate becomes true. when.unfold allows you to thread additional state information through the iteration.
    * @memberOf when
    * @param unspool function that, given a seed, returns a [valueToSendToHandler, newSeed] pair.
    * May return an array, array of promises, promise for an array, or promise for an array of promises.
    * @param predicate function that receives the current seed, and should return truthy when the unfold should stop
    * @param handler function that receives the valueToSendToHandler of the current iteration.
    * This function can process valueToSendToHandler in whatever way you need.
    * It may return a promise to delay the next iteration of the unfold.
    * @param seed initial value provided to the first unspool invocation. May be a promise.
    */
  def unfold[T, U](
    unspool: js.Function1[
      /* seed */ U, 
      (js.Tuple2[T | whenLib.WhenNs.Promise[T], U | whenLib.WhenNs.Promise[U]]) | (whenLib.WhenNs.Promise[js.Tuple2[T | whenLib.WhenNs.Promise[T], U | whenLib.WhenNs.Promise[U]]])
    ],
    predicate: js.Function1[/* value */ U, scala.Boolean | whenLib.WhenNs.Promise[scala.Boolean]],
    handler: js.Function1[/* value */ T, whenLib.WhenNs.Promise[_] | scala.Unit],
    seed: U
  ): whenLib.WhenNs.Promise[scala.Unit] = js.native
  def unfold[T, U](
    unspool: js.Function1[
      /* seed */ U, 
      (js.Tuple2[T | whenLib.WhenNs.Promise[T], U | whenLib.WhenNs.Promise[U]]) | (whenLib.WhenNs.Promise[js.Tuple2[T | whenLib.WhenNs.Promise[T], U | whenLib.WhenNs.Promise[U]]])
    ],
    predicate: js.Function1[/* value */ U, scala.Boolean | whenLib.WhenNs.Promise[scala.Boolean]],
    handler: js.Function1[/* value */ T, whenLib.WhenNs.Promise[_] | scala.Unit],
    seed: whenLib.WhenNs.Promise[U]
  ): whenLib.WhenNs.Promise[scala.Unit] = js.native
}

