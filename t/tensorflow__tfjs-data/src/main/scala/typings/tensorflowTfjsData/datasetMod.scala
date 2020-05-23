package typings.tensorflowTfjsData

import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.typesMod.Container
import typings.tensorflowTfjsData.typesMod.DataElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", JSImport.Namespace)
@js.native
object datasetMod extends js.Object {
  @js.native
  abstract class Dataset[T /* <: TensorContainer */] () extends js.Object {
    val size: Double = js.native
    /**
      * Groups elements into batches.
      *
      * It is assumed that each of the incoming dataset elements has the same
      * structure-- i.e. the same set of keys at each location in an object
      * hierarchy.  For each key, the resulting `Dataset` provides a batched
      * element collecting all of the incoming values for that key.
      *
      *  * Incoming primitives are grouped into a 1-D Tensor.
      *  * Incoming Tensors are grouped into a new Tensor where the 0'th axis is
      *    the batch dimension.
      *  * Incoming arrays are converted to Tensor and then batched.
      *  * A nested array is interpreted as an n-D Tensor, so the batched result
      *    has n+1 dimensions.
      *  * An array that cannot be converted to Tensor produces an error.
      *
      * If an array should not be batched as a unit, it should first be converted
      * to an object with integer keys.
      *
      * Here are a few examples:
      *
      * Batch a dataset of numbers:
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6, 7, 8]).batch(4);
      * await a.forEachAsync(e => e.print());
      * ```
      *
      * Batch a dataset of arrays:
      * ```js
      * const b = tf.data.array([[1], [2], [3], [4], [5], [6], [7], [8]]).batch(4);
      * await b.forEachAsync(e => e.print());
      * ```
      *
      * Batch a dataset of objects:
      * ```js
      * const c = tf.data.array([{a: 1, b: 11}, {a: 2, b: 12}, {a: 3, b: 13},
      *   {a: 4, b: 14}, {a: 5, b: 15}, {a: 6, b: 16}, {a: 7, b: 17},
      *   {a: 8, b: 18}]).batch(4);
      * await c.forEachAsync(e => {
      *   console.log('{');
      *   for(var key in e) {
      *     console.log(key+':');
      *     e[key].print();
      *   }
      *   console.log('}');
      * })
      * ```
      *
      * @param batchSize The number of elements desired per batch.
      * @param smallLastBatch Whether to emit the final batch when it has fewer
      *   than batchSize elements. Default true.
      * @returns A `Dataset`, from which a stream of batches can be obtained.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def batch(batchSize: Double): Dataset[TensorContainer] = js.native
    def batch(batchSize: Double, smallLastBatch: Boolean): Dataset[TensorContainer] = js.native
    /**
      * Concatenates this `Dataset` with another.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3]);
      * const b = tf.data.array([4, 5, 6]);
      * const c = a.concatenate(b);
      * await c.forEachAsync(e => console.log(e));
      * ```
      *
      * @param dataset A `Dataset` to be concatenated onto this one.
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def concatenate(dataset: Dataset[T]): Dataset[T] = js.native
    /**
      * Filters this dataset according to `predicate`.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
      *   .filter(x => x%2 === 0);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param predicate A function mapping a dataset element to a boolean or a
      * `Promise` for one.
      *
      * @returns A `Dataset` of elements for which the predicate was true.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def filter(predicate: js.Function1[/* value */ T, Boolean]): Dataset[T] = js.native
    /** @deprecated Please use `dataset.forEachAsync()` instead. */
    def forEach(f: js.Function1[/* input */ T, Unit]): js.Promise[Unit] = js.native
    /**
      * Apply a function to every element of the dataset.
      *
      * After the function is applied to a dataset element, any Tensors contained
      * within that element are disposed.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3]);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param f A function to apply to each dataset element.
      * @returns A `Promise` that resolves after all elements have been processed.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def forEachAsync(f: js.Function1[/* input */ T, Unit]): js.Promise[Unit] = js.native
    def iterator(): js.Promise[LazyIterator[T]] = js.native
    /**
      * Maps this dataset through a 1-to-1 transform.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3]).map(x => x*x);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param transform A function mapping a dataset element to a transformed
      *   dataset element.
      *
      * @returns A `Dataset` of transformed elements.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def map[O /* <: TensorContainer */](transform: js.Function1[/* value */ T, O]): Dataset[O] = js.native
    /**
      * Maps this dataset through an async 1-to-1 transform.
      *
      * ```js
      * const a =
      *  tf.data.array([1, 2, 3]).mapAsync(x => new Promise(function(resolve){
      *    setTimeout(() => {
      *      resolve(x * x);
      *    }, Math.random()*1000 + 500);
      *  }));
      * console.log(await a.toArray());
      * ```
      *
      * @param transform A function mapping a dataset element to a `Promise` for a
      *   transformed dataset element.  This transform is responsible for disposing
      *   any intermediate `Tensor`s, i.e. by wrapping its computation in
      *   `tf.tidy()`; that cannot be automated here (as it is in the synchronous
      *   `map()` case).
      *
      * @returns A `Dataset` of transformed elements.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def mapAsync[O /* <: TensorContainer */](transform: js.Function1[/* value */ T, js.Promise[O]]): Dataset[O] = js.native
    /**
      *  Creates a `Dataset` that prefetches elements from this dataset.
      *
      * @param bufferSize: An integer specifying the number of elements to be
      *   prefetched.
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def prefetch(bufferSize: Double): Dataset[T] = js.native
    /**
      * Repeats this dataset `count` times.
      *
      * NOTE: If this dataset is a function of global state (e.g. a random number
      * generator), then different repetitions may produce different elements.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3]).repeat(3);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param count: (Optional) An integer, representing the number of times
      *   the dataset should be repeated. The default behavior (if `count` is
      *   `undefined` or negative) is for the dataset be repeated indefinitely.
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def repeat(): Dataset[T] = js.native
    def repeat(count: Double): Dataset[T] = js.native
    /**
      * Pseudorandomly shuffles the elements of this dataset. This is done in a
      * streaming manner, by sampling from a given number of prefetched elements.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6]).shuffle(3);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param bufferSize: An integer specifying the number of elements from this
      *   dataset from which the new dataset will sample.
      * @param seed: (Optional) An integer specifying the random seed that will
      *   be used to create the distribution.
      * @param reshuffleEachIteration: (Optional) A boolean, which if true
      *   indicates that the dataset should be pseudorandomly reshuffled each time
      *   it is iterated over. If false, elements will be returned in the same
      *   shuffled order on each iteration. (Defaults to `true`.)
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def shuffle(bufferSize: Double): Dataset[T] = js.native
    def shuffle(bufferSize: Double, seed: String): Dataset[T] = js.native
    def shuffle(bufferSize: Double, seed: String, reshuffleEachIteration: Boolean): Dataset[T] = js.native
    /**
      * Creates a `Dataset` that skips `count` initial elements from this dataset.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6]).skip(3);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param count: The number of elements of this dataset that should be skipped
      *   to form the new dataset.  If `count` is greater than the size of this
      *   dataset, the new dataset will contain no elements.  If `count`
      *   is `undefined` or negative, skips the entire dataset.
      *
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def skip(count: Double): Dataset[T] = js.native
    /**
      * Creates a `Dataset` with at most `count` initial elements from this
      * dataset.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6]).take(3);
      * await a.forEachAsync(e => console.log(e));
      * ```
      *
      * @param count: The number of elements of this dataset that should be taken
      *   to form the new dataset.  If `count` is `undefined` or negative, or if
      *   `count` is greater than the size of this dataset, the new dataset will
      *   contain all elements of this dataset.
      * @returns A `Dataset`.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def take(count: Double): Dataset[T] = js.native
    /**
      * Collect all elements of this dataset into an array.
      *
      * Obviously this will succeed only for small datasets that fit in memory.
      * Useful for testing and generally should be avoided if possible.
      *
      * ```js
      * const a = tf.data.array([1, 2, 3, 4, 5, 6]);
      * console.log(await a.toArray());
      * ```
      *
      * @returns A Promise for an array of elements, which will resolve
      *   when a new stream has been obtained and fully consumed.
      */
    /** @doc {heading: 'Data', subheading: 'Classes'} */
    def toArray(): js.Promise[js.Array[T]] = js.native
    /**
      * Collect all elements of this dataset into an array with prefetching 100
      * elements. This is useful for testing, because the prefetch changes the
      * order in which the Promises are resolved along the processing pipeline.
      * This may help expose bugs where results are dependent on the order of
      * Promise resolution rather than on the logical order of the stream (i.e.,
      * due to hidden mutable state).
      *
      * @returns A Promise for an array of elements, which will resolve
      *   when a new stream has been obtained and fully consumed.
      */
    def toArrayForTest(): js.Promise[js.Array[T]] = js.native
  }
  
  def array[T /* <: TensorContainer */](items: js.Array[T]): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]]): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]], size: Double): Dataset[T] = js.native
  def zip[O /* <: TensorContainer */](datasets: DatasetContainer): Dataset[O] = js.native
  /* static members */
  @js.native
  object Dataset extends js.Object {
    val MAX_BUFFER_SIZE: /* 10000 */ Double = js.native
  }
  
  type DatasetContainer = Container[Dataset[DataElement]]
}

