package typings.yLeveldb

import typings.buffer.mod.Buffer
import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.std.Map
import typings.yLeveldb.anon.Clock
import typings.yLeveldb.anon.Level
import typings.yLeveldb.yLeveldbInts.`500`
import typings.yjs.mod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("y-leveldb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("y-leveldb", "LeveldbPersistence")
  @js.native
  open class LeveldbPersistence protected () extends StObject {
    /**
      * @param {string} location
      * @param {object} [opts]
      * @param {any} [opts.level] Level-compatible adapter. E.g. leveldown, level-rem, level-indexeddb. Defaults to `level`
      * @param {object} [opts.levelOptions] Options that are passed down to the level instance
      */
    def this(location: String) = this()
    def this(location: String, param1: Level) = this()
    
    /**
      * Execute an transaction on a database. This will ensure that other processes are currently not writing.
      *
      * This is a private method and might change in the future.
      *
      * @todo only transact on the same room-name. Allow for concurrency of different rooms.
      *
      * @template T
      *
      * @param {function(any):Promise<T>} f A transaction that receives the db object
      * @return {Promise<T>}
      */
    def _transact[T](f: js.Function1[/* arg0 */ Any, js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Delete all data in database.
      */
    def clearAll(): js.Promise[Any] = js.native
    
    /**
      * @param {string} docName
      * @return {Promise<void>}
      */
    def clearDocument(docName: String): js.Promise[Unit] = js.native
    
    /**
      * @param {string} docName
      * @param {string} metaKey
      * @return {Promise<any>}
      */
    def delMeta(docName: String, metaKey: String): js.Promise[Any] = js.native
    
    /**
      * Close connection to a leveldb database and discard all state and bindings
      *
      * @return {Promise<void>}
      */
    def destroy(): js.Promise[Unit] = js.native
    
    /**
      * @param {string} docName
      */
    def flushDocument(docName: String): js.Promise[Unit] = js.native
    
    /**
      * @return {Promise<Array<string>>}
      */
    def getAllDocNames(): js.Promise[js.Array[String]] = js.native
    
    /**
      * @return {Promise<Array<{ name: string, sv: Uint8Array, clock: number }>>}
      */
    def getAllDocStateVectors(): js.Promise[js.Array[Clock]] = js.native
    
    /**
      * @param {string} docName
      * @param {Uint8Array} stateVector
      */
    def getDiff(docName: String, stateVector: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {string} docName
      * @param {string} metaKey
      * @return {Promise<any>}
      */
    def getMeta(docName: String, metaKey: String): js.Promise[Any] = js.native
    
    /**
      * @param {string} docName
      * @return {Promise<Map<string, any>>}
      */
    def getMetas(docName: String): js.Promise[Map[String, Any]] = js.native
    
    /**
      * @param {string} docName
      * @return {Promise<Uint8Array>}
      */
    def getStateVector(docName: String): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {string} docName
      * @return {Promise<Y.Doc>}
      */
    def getYDoc(docName: String): js.Promise[Doc] = js.native
    
    /**
      * @param {string} docName
      * @param {string} metaKey
      * @param {any} value
      * @return {Promise<void>}
      */
    def setMeta(docName: String, metaKey: String, value: Any): js.Promise[Unit] = js.native
    
    /**
      * @param {string} docName
      * @param {Uint8Array} update
      * @return {Promise<number>} Returns the clock of the stored update
      */
    def storeUpdate(docName: String, update: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    
    var tr: js.Promise[Any] = js.native
  }
  
  @JSImport("y-leveldb", "PREFERRED_TRIM_SIZE")
  @js.native
  val PREFERRED_TRIM_SIZE: `500` = js.native
  
  inline def getAllDocs(db: Any, values: Boolean, keys: Boolean): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllDocs")(db.asInstanceOf[js.Any], values.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def getCurrentUpdateClock(db: Any, docName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUpdateClock")(db.asInstanceOf[js.Any], docName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def getLevelBulkData(db: Any, opts: js.Object): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelBulkData")(db.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def getLevelUpdates(db: Any, docName: String): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelUpdates")(db.asInstanceOf[js.Any], docName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  inline def getLevelUpdates(db: Any, docName: String, opts: Any): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLevelUpdates")(db.asInstanceOf[js.Any], docName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  object keyEncoding {
    
    @JSImport("y-leveldb", "keyEncoding")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("y-leveldb", "keyEncoding.buffer")
    @js.native
    def buffer: Boolean = js.native
    inline def buffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    inline def decode(buf: js.typedarray.Uint8Array): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def encode(arr: js.Array[String | Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @JSImport("y-leveldb", "keyEncoding.type")
    @js.native
    val `type`: String = js.native
  }
  
  inline def readUint32BigEndian(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint32BigEndian")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def writeUint32BigEndian(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32BigEndian")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
