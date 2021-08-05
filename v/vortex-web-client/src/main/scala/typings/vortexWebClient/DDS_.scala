package typings.vortexWebClient

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDS_ {
  
  @js.native
  sealed trait DurabilityKind extends StObject
  @JSGlobal("DDS.DurabilityKind")
  @js.native
  object DurabilityKind extends StObject {
    
    @js.native
    sealed trait Persistent
      extends StObject
         with DurabilityKind
    
    @js.native
    sealed trait Transient
      extends StObject
         with DurabilityKind
    
    @js.native
    sealed trait TransientLocal
      extends StObject
         with DurabilityKind
    
    @js.native
    sealed trait Volatile
      extends StObject
         with DurabilityKind
  }
  
  @js.native
  sealed trait HistoryKind extends StObject
  @JSGlobal("DDS.HistoryKind")
  @js.native
  object HistoryKind extends StObject {
    
    @js.native
    sealed trait KeepAll
      extends StObject
         with HistoryKind
    
    @js.native
    sealed trait KeepLast
      extends StObject
         with HistoryKind
  }
  
  @js.native
  sealed trait ReliabilityKind extends StObject
  @JSGlobal("DDS.ReliabilityKind")
  @js.native
  object ReliabilityKind extends StObject {
    
    @js.native
    sealed trait BestEffort
      extends StObject
         with ReliabilityKind
    
    @js.native
    sealed trait Reliable
      extends StObject
         with ReliabilityKind
  }
  
  @js.native
  trait DataCache extends StObject {
    
    /**
      * Register a listener to be notified whenever data which matches a predicate is written into the cache.
      * If no predicate is provided then the listeners is always notified upon data inserion.
      *
      * @param l - listener function
      * @param p - predicate
      */
    def addListener(l: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    def addListener(l: js.Function1[/* data */ js.Any, Unit], p: js.Function1[/* data */ js.Any, Boolean]): Unit = js.native
    
    /**
      * clears the data cache
      */
    def clear(): Unit = js.native
    
    /**
      * Returns the list of elements in the cache that satisfy the predicate `f`.
      *
      * @param f - the predicate to be applied to filter the cache values
      * @returns An array holding the filtered values
      */
    def filter(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[js.Any] = js.native
    
    /**
      * Returns the list of elements in the cache that doesn't satisfy the predicate `f`.
      *
      * @returns An array holding the filtered values
      * @see DataCache#filter
      */
    def filterNot(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[js.Any] = js.native
    
    /**
      * folds the element of the cache using `z` as the `zero` element and
      * `f` as the binary operator.
      *
      * @param z - initial value
      * @param {function} f - reduce function
      */
    def fold(z: js.Any, f: js.Function1[/* data */ js.Any, js.Any]): Unit = js.native
    
    /**
      * Execute the function `f` for each element of the cache.
      *
      * @memberof! dds.DataCache#
      * @param f - the function to be applied
      * @returns results of the function execution
      */
    def forEach(f: js.Function1[/* data */ js.Any, js.Any]): js.Array[js.Any] = js.native
    
    /**
      * Same as forEach but applied, for each key, only to the first `n` samples of the cache
      *
      * @param f - the function to be applied
      * @param n - samples set size
      */
    def forEachN(f: js.Function1[/* data */ js.Any, js.Any], n: Double): js.Array[js.Any] = js.native
    
    /**
      * Return `coffez.Some(v)` if there is an element in the cache corresponding to the
      * key `k` otherwise it returns `coffez.None`.
      *
      * @param k - key
      */
    def get(k: js.Any): js.Any = js.native
    
    /**
      * Return `coffez.Some(v)` if there is an element in the cache corresponding to the
      * key `k` otherwise executes `f` and returns its result.
      *
      * @param k - key
      * @param f - the function to apply
      */
    def getOrElse(k: js.Any, f: js.Function1[/* data */ js.Any, js.Any]): js.Any = js.native
    
    /**
      * Returns a cache that is the result of applying `f` to each element of the cache.
      *
      * @param f - the function to be applied
      * @returns A cache holding the results of the function execution
      */
    def map(f: js.Function1[/* data */ js.Any, js.Any]): DataCache = js.native
    
    /**
      * Returns the values included in the cache as an array.
      *
      * @return All the cache values
      */
    def read(): js.Array[js.Any] = js.native
    
    /**
      * Returns the last value of the cache in an array.
      *
      * @return the last value of the cache
      */
    def readLast(): js.Any = js.native
    
    /**
      * Returns the `K`ith value of the cache as Monad, ie: `coffez.Some` if it exists, `coffez.None` if not.
      *
      * @return the 'k'th value
      */
    def take(): js.Any = js.native
    
    /**
      * Returns all the values included in the cache as an array and empties the cache.
      *
      * @return All the cache values
      */
    def takeAll(): js.Array[js.Any] = js.native
    
    /**
      * Takes elements from the cache up to when the predicate `f` is satisfied
      *
      * @param f - the predicate
      * @return taken cache values
      */
    def takeWithFilter(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[js.Any] = js.native
    
    /**
      * Write the element `data` with key `k` into the cache.
      *
      * @param k - data key
      * @param data - data value
      * @returns the written data value
      */
    def write(k: js.Any, data: js.Any): js.Any = js.native
  }
  
  trait DataReader extends StObject {
    
    /**
      * Attaches the  listener `l` to this data reader and returns
      * the id associated to the listener.
      * @param l - listener code
      * @returns listener handle
      */
    def addListener(l: js.Function1[/* msg */ js.Any, Unit]): Double
    
    /**
      * closes the DataReader
      */
    def close(): Unit
    
    /**
      * removes a listener from this data reader.
      * @param idx - listener id
      */
    def removeListener(idx: Double): Unit
    
    def resetStats(): Unit
  }
  object DataReader {
    
    inline def apply(
      addListener: js.Function1[/* msg */ js.Any, Unit] => Double,
      close: () => Unit,
      removeListener: Double => Unit,
      resetStats: () => Unit
    ): DataReader = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), close = js.Any.fromFunction0(close), removeListener = js.Any.fromFunction1(removeListener), resetStats = js.Any.fromFunction0(resetStats))
      __obj.asInstanceOf[DataReader]
    }
    
    extension [Self <: DataReader](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* msg */ js.Any, Unit] => Double): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(value: Double => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      inline def setResetStats(value: () => Unit): Self = StObject.set(x, "resetStats", js.Any.fromFunction0(value))
    }
  }
  
  trait DataWriter extends StObject {
    
    /**
      * Closes the DataWriter
      */
    def close(): Unit
    
    /**
      * Writes one or more samples.
      * @param ds - data sample
      */
    def write(ds: js.Any*): Unit
  }
  object DataWriter {
    
    inline def apply(close: () => Unit, write: /* repeated */ js.Any => Unit): DataWriter = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[DataWriter]
    }
    
    extension [Self <: DataWriter](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setWrite(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type Durability = Policy
  
  @js.native
  trait EntityQos
    extends StObject
       with /**
    * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
    *
    * @param policies - list of policies for the Qos entity
    */
  Instantiable1[/* policies (repeated) */ Policy, EntityQos] {
    
    /**
      * Adds the given policy to this instance.
      * @param policy - the policy to add
      * @return A new copy of this instance with the combined policies
      */
    def add(policy: Policy): EntityQos = js.native
  }
  
  type History = Policy
  
  /**
    * Base class for all policies
    */
  trait Policy extends StObject
  
  type Reliability = Policy
  
  @js.native
  trait Runtime
    extends StObject
       with /**
    * Constructs a DDS Runtime object
    *
    * maintains the connection with the server, re-establish the connection
    * if dropped and mediates the `DataReader` and `DataWriter` communication.
    */
  Instantiable0[Runtime] {
    
    /**
      * Closes the DDS runtime and as a consequence all the `DataReaders` and `DataWriters` that belong to this runtime.
      *
      */
    def close(): Unit = js.native
    
    /**
      * Connect the runtime to the server. If the runtime is already connected an exception is thrown
      *
      * @param srv - Vortex Web server WebSocket URL
      * @param authToken - Authorization token
      */
    def connect(server: String): Unit = js.native
    def connect(server: String, authToken: String): Unit = js.native
    
    /**
      * Disconnects, withouth closing, a `Runtime`. Notice that upon re-connection all existing
      * subscriptions and publications will be re-restablished.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Checks whether the Runtime is closed.
      * @return `true` if connected, `false` if not
      */
    def isClosed(): Boolean = js.native
    
    /**
      * Checks whether the Runtime is connected.
      * @return `true` if connected, `false` if not
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Function called when runtime is connected.
      *
      * @param e
      */
    def onconnect(e: js.Any): Unit = js.native
    
    /**
      * Function called when runtime is disconnected.
      *
      * @param e
      */
    def ondisconnect(e: js.Any): Unit = js.native
    
    /**
      * Registers the provided Topic.
      *
      * @param t - Topic to be registered
      */
    def registerTopic(t: Topic): Unit = js.native
  }
  
  trait Topic extends StObject {
    
    /**
      * Called when topic gets registered in the runtime
      */
    def onregistered(): Unit
    
    /**
      * Called when topic gets unregistered in the runtime
      */
    def onunregistered(): Unit
  }
  object Topic {
    
    inline def apply(onregistered: () => Unit, onunregistered: () => Unit): Topic = {
      val __obj = js.Dynamic.literal(onregistered = js.Any.fromFunction0(onregistered), onunregistered = js.Any.fromFunction0(onunregistered))
      __obj.asInstanceOf[Topic]
    }
    
    extension [Self <: Topic](x: Self) {
      
      inline def setOnregistered(value: () => Unit): Self = StObject.set(x, "onregistered", js.Any.fromFunction0(value))
      
      inline def setOnunregistered(value: () => Unit): Self = StObject.set(x, "onunregistered", js.Any.fromFunction0(value))
    }
  }
}
