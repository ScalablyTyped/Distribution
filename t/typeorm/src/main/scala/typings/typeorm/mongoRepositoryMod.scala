package typings.typeorm

import typings.std.Partial
import typings.typeorm.anon.BatchSize
import typings.typeorm.anon.DropTarget
import typings.typeorm.anon.Full
import typings.typeorm.anon.J
import typings.typeorm.anon.MaxTimeMS
import typings.typeorm.anon.ReadPreference
import typings.typeorm.anon.Scale
import typings.typeorm.findOneOptionsMod.FindOneOptions
import typings.typeorm.mongoEntityManagerMod.MongoEntityManager
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.repositoryMod.Repository
import typings.typeorm.typingsMod.AggregationCursor
import typings.typeorm.typingsMod.BulkWriteOpResultObject
import typings.typeorm.typingsMod.Code
import typings.typeorm.typingsMod.CollStats
import typings.typeorm.typingsMod.Collection
import typings.typeorm.typingsMod.CollectionAggregationOptions
import typings.typeorm.typingsMod.CollectionBulkWriteOptions
import typings.typeorm.typingsMod.CollectionInsertManyOptions
import typings.typeorm.typingsMod.CollectionInsertOneOptions
import typings.typeorm.typingsMod.CollectionOptions
import typings.typeorm.typingsMod.CommandCursor
import typings.typeorm.typingsMod.Cursor
import typings.typeorm.typingsMod.DeleteWriteOpResultObject
import typings.typeorm.typingsMod.FindAndModifyWriteOpResultObject
import typings.typeorm.typingsMod.FindOneAndReplaceOption
import typings.typeorm.typingsMod.GeoHaystackSearchOptions
import typings.typeorm.typingsMod.GeoNearOptions
import typings.typeorm.typingsMod.InsertOneWriteOpResult
import typings.typeorm.typingsMod.InsertWriteOpResult
import typings.typeorm.typingsMod.MapReduceOptions
import typings.typeorm.typingsMod.MongoCountPreferences
import typings.typeorm.typingsMod.MongodbIndexOptions
import typings.typeorm.typingsMod.OrderedBulkOperation
import typings.typeorm.typingsMod.ParallelCollectionScanOptions
import typings.typeorm.typingsMod.ReplaceOneOptions
import typings.typeorm.typingsMod.UnorderedBulkOperation
import typings.typeorm.typingsMod.UpdateWriteOpResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoRepositoryMod {
  
  @JSImport("typeorm/browser/repository/MongoRepository", "MongoRepository")
  @js.native
  class MongoRepository[Entity /* <: ObjectLiteral */] () extends Repository[Entity] {
    
    /**
      * Execute an aggregation framework pipeline against the collection.
      */
    def aggregate[R](pipeline: js.Array[ObjectLiteral]): AggregationCursor[R] = js.native
    def aggregate[R](pipeline: js.Array[ObjectLiteral], options: CollectionAggregationOptions): AggregationCursor[R] = js.native
    
    /**
      * Execute an aggregation framework pipeline against the collection.
      * This returns modified version of cursor that transforms each result into Entity model.
      */
    def aggregateEntity(pipeline: js.Array[ObjectLiteral]): AggregationCursor[Entity] = js.native
    def aggregateEntity(pipeline: js.Array[ObjectLiteral], options: CollectionAggregationOptions): AggregationCursor[Entity] = js.native
    
    /**
      * Perform a bulkWrite operation without a fluent API.
      */
    def bulkWrite(operations: js.Array[ObjectLiteral]): js.Promise[BulkWriteOpResultObject] = js.native
    def bulkWrite(operations: js.Array[ObjectLiteral], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexExists(indexes: String): js.Promise[Boolean] = js.native
    def collectionIndexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves this collections index info.
      */
    def collectionIndexInformation(): js.Promise[_] = js.native
    def collectionIndexInformation(options: Full): js.Promise[_] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexes(): js.Promise[_] = js.native
    
    def count(query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[Double] = js.native
    def count(query: ObjectLiteral): js.Promise[Double] = js.native
    def count(query: ObjectLiteral, options: MongoCountPreferences): js.Promise[Double] = js.native
    
    /**
      * Creates an index on the db and collection.
      */
    def createCollectionIndex(fieldOrSpec: String): js.Promise[String] = js.native
    def createCollectionIndex(fieldOrSpec: String, options: MongodbIndexOptions): js.Promise[String] = js.native
    def createCollectionIndex(fieldOrSpec: js.Any): js.Promise[String] = js.native
    def createCollectionIndex(fieldOrSpec: js.Any, options: MongodbIndexOptions): js.Promise[String] = js.native
    
    /**
      * Creates multiple indexes in the collection, this method is only supported for MongoDB 2.6 or higher.
      * Earlier version of MongoDB will throw a command not supported error.
      * Index specifications are defined at http://docs.mongodb.org/manual/reference/command/createIndexes/.
      */
    def createCollectionIndexes(indexSpecs: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
    
    /**
      * Creates a cursor for a query that can be used to iterate over results from MongoDB.
      */
    def createCursor[T](): Cursor[T] = js.native
    def createCursor[T](query: ObjectLiteral): Cursor[T] = js.native
    
    /**
      * Creates a cursor for a query that can be used to iterate over results from MongoDB.
      * This returns modified version of cursor that transforms each result into Entity model.
      */
    def createEntityCursor(): Cursor[Entity] = js.native
    def createEntityCursor(query: ObjectLiteral): Cursor[Entity] = js.native
    
    /**
      * Delete multiple documents on MongoDB.
      */
    def deleteMany(query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteMany(query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * Delete a document on MongoDB.
      */
    def deleteOne(query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteOne(query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * The distinct command returns returns a list of distinct values for the given key across a collection.
      */
    def distinct(key: String, query: ObjectLiteral): js.Promise[_] = js.native
    def distinct(key: String, query: ObjectLiteral, options: ReadPreference): js.Promise[_] = js.native
    
    /**
      * Drops an index from this collection.
      */
    def dropCollectionIndex(indexName: String): js.Promise[_] = js.native
    def dropCollectionIndex(indexName: String, options: CollectionOptions): js.Promise[_] = js.native
    
    /**
      * Drops all indexes from the collection.
      */
    def dropCollectionIndexes(): js.Promise[_] = js.native
    
    def find(optionsOrConditions: Partial[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    def findAndCount(optionsOrConditions: Partial[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    
    def findByIds(ids: js.Array[_], optionsOrConditions: Partial[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    def findOne(optionsOrConditions: Partial[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(optionsOrConditions: Partial[Entity], maybeOptions: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(optionsOrConditions: FindOneOptions[Entity], maybeOptions: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndDelete(query: ObjectLiteral): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndDelete(query: ObjectLiteral, options: MaxTimeMS): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndReplace(query: ObjectLiteral, replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndReplace(query: ObjectLiteral, replacement: js.Object, options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndUpdate(query: ObjectLiteral, update: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndUpdate(query: ObjectLiteral, update: js.Object, options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Execute a geo search using a geo haystack index on a collection.
      */
    def geoHaystackSearch(x: Double, y: Double): js.Promise[_] = js.native
    def geoHaystackSearch(x: Double, y: Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
    
    /**
      * Execute the geoNear command to search for items in the collection.
      */
    def geoNear(x: Double, y: Double): js.Promise[_] = js.native
    def geoNear(x: Double, y: Double, options: GeoNearOptions): js.Promise[_] = js.native
    
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    /**
      * Run a group command across a collection.
      */
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: ReadPreference
    ): js.Promise[_] = js.native
    
    /**
      * Initiate an In order bulk write operation, operations will be serially executed in the order they are added, creating a new operation for each switch in types.
      */
    def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
    def initializeOrderedBulkOp(options: CollectionOptions): OrderedBulkOperation = js.native
    
    /**
      * Initiate a Out of order batch write operation. All operations will be buffered into insert/update/remove commands executed out of order.
      */
    def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
    def initializeUnorderedBulkOp(options: CollectionOptions): UnorderedBulkOperation = js.native
    
    /**
      * Inserts an array of documents into MongoDB.
      */
    def insertMany(docs: js.Array[ObjectLiteral]): js.Promise[InsertWriteOpResult] = js.native
    def insertMany(docs: js.Array[ObjectLiteral], options: CollectionInsertManyOptions): js.Promise[InsertWriteOpResult] = js.native
    
    /**
      * Inserts a single document into MongoDB.
      */
    def insertOne(doc: ObjectLiteral): js.Promise[InsertOneWriteOpResult] = js.native
    def insertOne(doc: ObjectLiteral, options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult] = js.native
    
    /**
      * Returns if the collection is a capped collection.
      */
    def isCapped(): js.Promise[_] = js.native
    
    /**
      * Get the list of all indexes information for the collection.
      */
    def listCollectionIndexes(): CommandCursor = js.native
    def listCollectionIndexes(options: BatchSize): CommandCursor = js.native
    
    /**
      * Entity Manager used by this repository.
      */
    @JSName("manager")
    val manager_MongoRepository: MongoEntityManager = js.native
    
    def mapReduce(map: String, reduce: String): js.Promise[_] = js.native
    def mapReduce(map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
    def mapReduce(map: String, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce(map: String, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
    def mapReduce(map: js.Function, reduce: String): js.Promise[_] = js.native
    def mapReduce(map: js.Function, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
    /**
      * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
      */
    def mapReduce(map: js.Function, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce(map: js.Function, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
    
    /**
      * Return N number of parallel cursors for a collection allowing parallel reading of entire collection.
      * There are no ordering guarantees for returned results.
      */
    def parallelCollectionScan(): js.Promise[js.Array[Cursor[Entity]]] = js.native
    def parallelCollectionScan(options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[Entity]]] = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def reIndex(): js.Promise[_] = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def rename(newName: String): js.Promise[Collection[_]] = js.native
    def rename(newName: String, options: DropTarget): js.Promise[Collection[_]] = js.native
    
    /**
      * Replace a document on MongoDB.
      */
    def replaceOne(query: ObjectLiteral, doc: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def replaceOne(query: ObjectLiteral, doc: ObjectLiteral, options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Get all the collection statistics.
      */
    def stats(): js.Promise[CollStats] = js.native
    def stats(options: Scale): js.Promise[CollStats] = js.native
    
    /**
      * Update multiple documents on MongoDB.
      */
    def updateMany(query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateMany(query: ObjectLiteral, update: ObjectLiteral, options: J): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Update a single document on MongoDB.
      */
    def updateOne(query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateOne(query: ObjectLiteral, update: ObjectLiteral, options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  }
}
