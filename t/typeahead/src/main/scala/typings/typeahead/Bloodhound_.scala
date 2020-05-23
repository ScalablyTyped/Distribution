package typings.typeahead

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
  * flexible, and offers advanced functionalities such as prefetching,
  * intelligent caching, fast lookups, and backfilling with remote data.
  */
@js.native
trait Bloodhound_[T] extends js.Object {
  /**
    * Takes one argument, data, which is expected to be an array.
    * The data passed in will get added to the internal search index.
    *
    * @param data Data to be added to the internal search index.
    */
  def add(data: js.Array[T]): Unit = js.native
  /**
    * Returns all items from the internal search index.
    */
  def all(): js.Array[T] = js.native
  /**
    * Clears the internal search index that's powered by local, prefetch, and #add.
    */
  def clear(): Bloodhound[T] = js.native
  /**
    * If you're using prefetch, data gets cached in local storage in an effort to cut down on unnecessary network requests.
    * clearPrefetchCache offers a way to programmatically clear said cache.
    */
  def clearPrefetchCache(): Bloodhound[T] = js.native
  /**
    * If you're using remote, Bloodhound will cache the 10 most recent responses in an effort to provide a better user experience.
    * clearRemoteCache offers a way to programmatically clear said cache.
    */
  def clearRemoteCache(): Bloodhound[T] = js.native
  /**
    * Returns the data in the local search index corresponding to ids.
    *
    * @param ids Data ids.
    * @returns The corresponding data.
    */
  def get(ids: js.Array[Double]): js.Array[T] = js.native
  /**
    * Kicks off the initialization of the suggestion engine. Initialization
    * entails adding the data provided by local and prefetch to the internal
    * search index as well as setting up transport mechanism used by remote.
    * Before #initialize is called, the #get and #search methods will effectively be no-ops.
    *
    * Note, unless the initialize option is false, this method is implicitly called by the constructor.
    *
    * After initialization, how subsequent invocations of #initialize behave depends on
    * the reinitialize argument. If reinitialize is falsy, the method will not execute the
    * initialization logic and will just return the same jQuery promise returned
    * by the initial invocation. If reinitialize is truthy, the method will behave
    * as if it were being called for the first time.
    *
    * @param reinitialize How subsequent invocations of #initialize will behave.
    * @returns jQuery promise.
    */
  def initialize(): JQueryPromise[T] = js.native
  def initialize(reinitialize: Boolean): JQueryPromise[T] = js.native
  /**
    * Returns the data that matches query. Matches found in the local search
    * index will be passed to the sync callback. If the data passed to sync
    * doesn't contain at least sufficient number of datums, remote data will
    * be requested and then passed to the async callback.
    *
    * @param query Query.
    * @param sync Sync callback
    * @param async Async callback.
    * @returns The data that matches query.
    */
  def search(query: String, sync: js.Function1[/* datums */ js.Array[T], Unit]): js.Array[T] = js.native
  def search(
    query: String,
    sync: js.Function1[/* datums */ js.Array[T], Unit],
    async: js.Function1[/* datums */ js.Array[T], Unit]
  ): js.Array[T] = js.native
  /*
    * DEPRECATED: wraps the suggestion engine in an adapter that is compatible with the typeahead jQuery plugin
    */
  def ttAdapter(): js.Any = js.native
}

