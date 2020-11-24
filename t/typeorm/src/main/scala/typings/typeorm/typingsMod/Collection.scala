package typings.typeorm.typingsMod

import typings.typeorm.anon.ChangeStreamOptionsstartA
import typings.typeorm.anon.CollectionOptionssinglebo
import typings.typeorm.anon.DropTarget
import typings.typeorm.anon.Full
import typings.typeorm.anon.ReplaceOneOptionsmultiboo
import typings.typeorm.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T] extends js.Object {
  
  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    *
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param options Optional.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#aggregate
    */
  def aggregate(pipeline: js.Array[js.Object]): AggregationCursor[_] = js.native
  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    *
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#aggregate
    */
  def aggregate(pipeline: js.Array[js.Object], callback: MongoCallback[_]): AggregationCursor[_] = js.native
  def aggregate(pipeline: js.Array[js.Object], options: js.UndefOr[scala.Nothing], callback: MongoCallback[_]): AggregationCursor[_] = js.native
  def aggregate(pipeline: js.Array[js.Object], options: CollectionAggregationOptions): AggregationCursor[_] = js.native
  def aggregate(pipeline: js.Array[js.Object], options: CollectionAggregationOptions, callback: MongoCallback[_]): AggregationCursor[_] = js.native
  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    *
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param options Optional.
    * @param callback Optional
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#aggregate
    */
  @JSName("aggregate")
  def aggregate_T[T](pipeline: js.Array[js.Object]): AggregationCursor[T] = js.native
  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    *
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#aggregate
    */
  @JSName("aggregate")
  def aggregate_T[T](pipeline: js.Array[js.Object], callback: MongoCallback[_]): AggregationCursor[T] = js.native
  @JSName("aggregate")
  def aggregate_T[T](pipeline: js.Array[js.Object], options: js.UndefOr[scala.Nothing], callback: MongoCallback[_]): AggregationCursor[T] = js.native
  @JSName("aggregate")
  def aggregate_T[T](pipeline: js.Array[js.Object], options: CollectionAggregationOptions): AggregationCursor[T] = js.native
  @JSName("aggregate")
  def aggregate_T[T](pipeline: js.Array[js.Object], options: CollectionAggregationOptions, callback: MongoCallback[_]): AggregationCursor[T] = js.native
  
  /**
    * BulkWrite.
    *
    * @param operations Bulk operations to perform.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#bulkWrite
    */
  def bulkWrite(operations: js.Array[js.Object]): js.Promise[BulkWriteOpResultObject] = js.native
  /**
    * BulkWrite.
    *
    * @param operations Bulk operations to perform.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#bulkWrite
    */
  def bulkWrite(operations: js.Array[js.Object], callback: MongoCallback[BulkWriteOpResultObject]): Unit = js.native
  def bulkWrite(operations: js.Array[js.Object], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
  /**
    * BulkWrite.
    *
    * @param operations Bulk operations to perform.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#bulkWrite
    */
  def bulkWrite(
    operations: js.Array[js.Object],
    options: CollectionBulkWriteOptions,
    callback: MongoCallback[BulkWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Get the collection name.
    */
  var collectionName: String = js.native
  
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the count.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#count
    */
  def count(query: FilterQuery[T]): js.Promise[scala.Double] = js.native
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the count.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#count
    */
  def count(query: FilterQuery[T], callback: MongoCallback[scala.Double]): Unit = js.native
  def count(query: FilterQuery[T], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the count=
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#count
    */
  def count(query: FilterQuery[T], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the count.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments
    */
  def countDocuments(query: FilterQuery[T]): js.Promise[scala.Double] = js.native
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the countDocuments.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocumentst
    */
  def countDocuments(query: FilterQuery[T], callback: MongoCallback[scala.Double]): Unit = js.native
  def countDocuments(query: FilterQuery[T], options: MongoCountPreferences): js.Promise[scala.Double] = js.native
  /**
    * Count number of matching documents in the db to a query.
    *
    * @param query The query for the count=
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#countDocuments
    */
  def countDocuments(query: FilterQuery[T], options: MongoCountPreferences, callback: MongoCallback[scala.Double]): Unit = js.native
  
  /**
    * Creates an index on the db and collection collection.
    *
    * @param fieldOrSpec Defines the index.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#createIndex
    */
  def createIndex(fieldOrSpec: String): js.Promise[String] = js.native
  /**
    * Creates an index on the db and collection collection.
    *
    * @param fieldOrSpec Defines the index.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#createIndex
    */
  def createIndex(fieldOrSpec: String, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: String, options: MongodbIndexOptions): js.Promise[String] = js.native
  /**
    * Creates an index on the db and collection collection.
    *
    * @param fieldOrSpec Defines the index.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#createIndex
    */
  def createIndex(fieldOrSpec: String, options: MongodbIndexOptions, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, callback: MongoCallback[String]): Unit = js.native
  def createIndex(fieldOrSpec: js.Any, options: MongodbIndexOptions): js.Promise[String] = js.native
  def createIndex(fieldOrSpec: js.Any, options: MongodbIndexOptions, callback: MongoCallback[String]): Unit = js.native
  
  /**
    * CreateIndexes.
    *
    * @param indexSpecs An array of index specifications to be created.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#createIndexes and http://docs.mongodb.org/manual/reference/command/createIndexes/
    */
  def createIndexes(indexSpecs: js.Array[js.Object]): js.Promise[_] = js.native
  /**
    * CreateIndexes.
    *
    * @param indexSpecs An array of index specifications to be created.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#createIndexes and http://docs.mongodb.org/manual/reference/command/createIndexes/
    */
  def createIndexes(indexSpecs: js.Array[js.Object], callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Delete multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the documents to remove.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteMany
    */
  def deleteMany(filter: FilterQuery[T]): js.Promise[DeleteWriteOpResultObject] = js.native
  /**
    * Delete multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the documents to remove.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteMany
    */
  def deleteMany(filter: FilterQuery[T], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteMany(filter: FilterQuery[T], options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  /**
    * Delete multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the documents to remove.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteMany
    */
  def deleteMany(
    filter: FilterQuery[T],
    options: CollectionOptions,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Delete a document on MongoDB.
    *
    * @param filter The Filter used to select the document to remove.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteOne
    */
  def deleteOne(filter: FilterQuery[T]): js.Promise[DeleteWriteOpResultObject] = js.native
  /**
    * Delete a document on MongoDB.
    *
    * @param filter The Filter used to select the document to remove.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteOne
    */
  def deleteOne(filter: FilterQuery[T], callback: MongoCallback[DeleteWriteOpResultObject]): Unit = js.native
  def deleteOne(filter: FilterQuery[T], options: CollectionDeleteOneOptions): js.Promise[DeleteWriteOpResultObject] = js.native
  /**
    * Delete a document on MongoDB.
    *
    * @param filter The Filter used to select the document to remove.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#deleteOne
    */
  def deleteOne(
    filter: FilterQuery[T],
    options: CollectionDeleteOneOptions,
    callback: MongoCallback[DeleteWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * The distinct command returns returns a list of distinct values for the given key across a collection.
    *
    * @param key Field of the document to find distinct values for.
    * @param query The query for filtering the set of documents to which we apply the distinct filter.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#distinct
    */
  def distinct(key: String, query: FilterQuery[T]): js.Promise[_] = js.native
  /**
    * The distinct command returns returns a list of distinct values for the given key across a collection.
    *
    * @param key Field of the document to find distinct values for.
    * @param query The query for filtering the set of documents to which we apply the distinct filter.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#distinct
    */
  def distinct(key: String, query: FilterQuery[T], callback: MongoCallback[_]): Unit = js.native
  def distinct(key: String, query: FilterQuery[T], options: CollectionDistinctOptions): js.Promise[_] = js.native
  /**
    * The distinct command returns returns a list of distinct values for the given key across a collection.
    *
    * @param key Field of the document to find distinct values for.
    * @param query The query for filtering the set of documents to which we apply the distinct filter.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#distinct
    */
  def distinct(key: String, query: FilterQuery[T], options: CollectionDistinctOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Drop the collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#drop
    */
  def drop(): js.Promise[_] = js.native
  /**
    * Drop the collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#drop
    */
  def drop(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Drops an index from this collection.
    *
    * @param indexName Name of the index to drop.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#dropIndex
    */
  def dropIndex(indexName: String): js.Promise[_] = js.native
  /**
    * Drops an index from this collection.
    *
    * @param indexName Name of the index to drop.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#dropIndex
    */
  def dropIndex(indexName: String, callback: MongoCallback[_]): Unit = js.native
  def dropIndex(indexName: String, options: CollectionOptions): js.Promise[_] = js.native
  /**
    * Drops an index from this collection.
    *
    * @param indexName Name of the index to drop.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#dropIndex
    */
  def dropIndex(indexName: String, options: CollectionOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Drops all indexes from this collection.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#dropIndexes
    */
  def dropIndexes(): Unit = js.native
  def dropIndexes(callback: MongoCallback[_]): Unit = js.native
  /**
    * Drops all indexes from this collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#dropIndexes
    */
  @JSName("dropIndexes")
  def dropIndexes_Promise(): js.Promise[_] = js.native
  
  /**
    * Creates a cursor for a query that can be used to iterate over results from MongoDB.
    *
    * @param query The cursor query object.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#find
    */
  def find(): Cursor[_] = js.native
  def find(query: js.Object): Cursor[_] = js.native
  /** @deprecated */
  def find(query: FilterQuery[T]): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: scala.Double
  ): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: scala.Double,
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.UndefOr[scala.Nothing], skip: scala.Double): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.UndefOr[scala.Nothing],
    skip: scala.Double,
    limit: js.UndefOr[scala.Nothing],
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.UndefOr[scala.Nothing], skip: scala.Double, limit: scala.Double): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.UndefOr[scala.Nothing],
    skip: scala.Double,
    limit: scala.Double,
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.Object): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.Object,
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.Object, skip: js.UndefOr[scala.Nothing], limit: scala.Double): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.Object,
    skip: js.UndefOr[scala.Nothing],
    limit: scala.Double,
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.Object, skip: scala.Double): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.Object,
    skip: scala.Double,
    limit: js.UndefOr[scala.Nothing],
    timeout: scala.Double
  ): Cursor[_] = js.native
  def find(query: FilterQuery[T], fields: js.Object, skip: scala.Double, limit: scala.Double): Cursor[_] = js.native
  def find(
    query: FilterQuery[T],
    fields: js.Object,
    skip: scala.Double,
    limit: scala.Double,
    timeout: scala.Double
  ): Cursor[_] = js.native
  
  /**
    * Fetches the first document that matches the query.
    *
    * @param query Query for find Operation.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOne
    * @deprecated use find().limit(1).next(function(err, doc){}).
    */
  def findOne(query: FilterQuery[T]): js.Promise[_] = js.native
  /**
    * Fetches the first document that matches the query.
    *
    * @param query Query for find Operation.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOne
    * @deprecated use find().limit(1).next(function(err, doc){}).
    */
  def findOne(query: FilterQuery[T], callback: MongoCallback[_]): Unit = js.native
  def findOne(query: FilterQuery[T], options: MongodbFindOneOptions): js.Promise[_] = js.native
  /**
    * Fetches the first document that matches the query.
    *
    * @param query Query for find Operation.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOne
    * @deprecated use find().limit(1).next(function(err, doc){}).
    */
  def findOne(query: FilterQuery[T], options: MongodbFindOneOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndDelete
    */
  def findOneAndDelete(filter: FilterQuery[T]): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndDelete
    */
  def findOneAndDelete(filter: FilterQuery[T], callback: MongoCallback[FindAndModifyWriteOpResultObject]): Unit = js.native
  def findOneAndDelete(filter: FilterQuery[T], options: FindOneAndDeleteOptions): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndDelete
    */
  def findOneAndDelete(
    filter: FilterQuery[T],
    options: FindOneAndDeleteOptions,
    callback: MongoCallback[FindAndModifyWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param replacement Document replacing the matching document.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndReplace
    */
  def findOneAndReplace(filter: FilterQuery[T], replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param replacement Document replacing the matching document.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndReplace
    */
  def findOneAndReplace(
    filter: FilterQuery[T],
    replacement: js.Object,
    callback: MongoCallback[FindAndModifyWriteOpResultObject]
  ): Unit = js.native
  def findOneAndReplace(filter: FilterQuery[T], replacement: js.Object, options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param replacement Document replacing the matching document.
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndReplace
    */
  def findOneAndReplace(
    filter: FilterQuery[T],
    replacement: js.Object,
    options: FindOneAndReplaceOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param update Update operations to be performed on the document.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndUpdate
    */
  def findOneAndUpdate(filter: FilterQuery[T], update: UpdateQuery[T]): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param update Update operations to be performed on the document.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndUpdate
    */
  def findOneAndUpdate(
    filter: FilterQuery[T],
    update: UpdateQuery[T],
    callback: MongoCallback[FindAndModifyWriteOpResultObject]
  ): Unit = js.native
  def findOneAndUpdate(filter: FilterQuery[T], update: UpdateQuery[T], options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject] = js.native
  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    *
    * @param filter Document selection filter.
    * @param update Update operations to be performed on the document.
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#findOneAndUpdate
    */
  def findOneAndUpdate(
    filter: FilterQuery[T],
    update: UpdateQuery[T],
    options: FindOneAndReplaceOption,
    callback: MongoCallback[FindAndModifyWriteOpResultObject]
  ): Unit = js.native
  
  /**
    * Creates a cursor for a query that can be used to iterate over results from MongoDB.
    *
    * @param query The cursor query object.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#find
    */
  @JSName("find")
  def find_T[T](): Cursor[T] = js.native
  @JSName("find")
  def find_T[T](query: FilterQuery[T]): Cursor[T] = js.native
  
  /**
    * Execute a geo search using a geo haystack index on a collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoHaystackSearch
    */
  def geoHaystackSearch(x: scala.Double, y: scala.Double): js.Promise[_] = js.native
  /**
    * Execute a geo search using a geo haystack index on a collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoHaystackSearch
    */
  def geoHaystackSearch(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): Unit = js.native
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
  /**
    * Execute a geo search using a geo haystack index on a collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options Optional settings
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoHaystackSearch
    */
  def geoHaystackSearch(x: scala.Double, y: scala.Double, options: GeoHaystackSearchOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Execute the geoNear command to search for items in the collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options Optionals.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoNear
    */
  def geoNear(x: scala.Double, y: scala.Double): js.Promise[_] = js.native
  /**
    * Execute the geoNear command to search for items in the collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoNear
    */
  def geoNear(x: scala.Double, y: scala.Double, callback: MongoCallback[_]): Unit = js.native
  def geoNear(x: scala.Double, y: scala.Double, options: GeoNearOptions): js.Promise[_] = js.native
  /**
    * Execute the geoNear command to search for items in the collection.
    *
    * @param x Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#geoNear
    */
  def geoNear(x: scala.Double, y: scala.Double, options: GeoNearOptions, callback: MongoCallback[_]): Unit = js.native
  
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Array[_],
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Function,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  /**
    * Run a group command across a collection.
    *
    * @param keys An object, array or function expressing the keys to group by.
    * @param condition An optional condition that must be true for a row to be considered.
    * @param initial Initial value of the aggregation counter object.
    * @param reduce The reduce function aggregates (reduces) the objects iterated.
    * @param finalize An optional function to be run on each item in the result set just before the item is returned.
    * @param command Specify if you wish to run using the internal group command or using eval, default is true.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#group
    */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean
  ): js.Promise[_] = js.native
  /**
    * Run a group command across a collection.
    *
    * @param keys An object, array or function expressing the keys to group by.
    * @param condition An optional condition that must be true for a row to be considered.
    * @param initial Initial value of the aggregation counter object.
    * @param reduce The reduce function aggregates (reduces) the objects iterated.
    * @param finalize An optional function to be run on each item in the result set just before the item is returned.
    * @param command Specify if you wish to run using the internal group command or using eval, default is true.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#group
    */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  /**
    * Run a group command across a collection.
    *
    * @param keys An object, array or function expressing the keys to group by.
    * @param condition An optional condition that must be true for a row to be considered.
    * @param initial Initial value of the aggregation counter object.
    * @param reduce The reduce function aggregates (reduces) the objects iterated.
    * @param finalize An optional function to be run on each item in the result set just before the item is returned.
    * @param command Specify if you wish to run using the internal group command or using eval, default is true.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#group
    */
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: js.Object,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: js.Function,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: js.Function,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
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
    callback: MongoCallback[_]
  ): Unit = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions
  ): js.Promise[_] = js.native
  def group(
    keys: Code,
    condition: js.Object,
    initial: js.Object,
    reduce: Code,
    finalize: Code,
    command: Boolean,
    options: GroupOptions,
    callback: MongoCallback[_]
  ): Unit = js.native
  
  /**
    * Get current index hint for collection.
    */
  var hint: js.Any = js.native
  
  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index.
    *
    * @param indexes One or more index names to check.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexExists
    */
  def indexExists(indexes: String): js.Promise[Boolean] = js.native
  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index.
    *
    * @param indexes One or more index names to check.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexExists
    */
  def indexExists(indexes: String, callback: MongoCallback[Boolean]): Unit = js.native
  def indexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native
  def indexExists(indexes: js.Array[String], callback: MongoCallback[Boolean]): Unit = js.native
  
  /**
    * Retrieves this collections index info.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexInformation
    */
  def indexInformation(): js.Promise[_] = js.native
  /**
    * Retrieves this collections index info.
    *
    * @param callback The command result callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexInformation
    */
  def indexInformation(callback: MongoCallback[_]): Unit = js.native
  def indexInformation(options: Full): js.Promise[_] = js.native
  /**
    * Retrieves this collections index info.
    *
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexInformation
    */
  def indexInformation(options: Full, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrieve all the indexes on the collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexes
    */
  def indexes(): js.Promise[_] = js.native
  /**
    * Retrieve all the indexes on the collection.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#indexes
    */
  def indexes(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Initiate an In order bulk write operation, operations will be serially executed in the order they are added,
    * creating a new operation for each switch in types.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#initializeOrderedBulkOp
    */
  def initializeOrderedBulkOp(): OrderedBulkOperation = js.native
  def initializeOrderedBulkOp(options: CollectionOptions): OrderedBulkOperation = js.native
  
  /**
    * Initiate a Out of order batch write operation. All operations will be buffered into insert/update/remove commands executed out of order.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#initializeUnorderedBulkOp
    */
  def initializeUnorderedBulkOp(): UnorderedBulkOperation = js.native
  def initializeUnorderedBulkOp(options: CollectionOptions): UnorderedBulkOperation = js.native
  
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: js.Object): js.Promise[InsertOneWriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(docs: js.Object, callback: MongoCallback[InsertOneWriteOpResult]): Unit = js.native
  def insert(docs: js.Object, options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany or bulkWrite */
  def insert(
    docs: js.Object,
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult]
  ): Unit = js.native
  
  /**
    * InsertMany.
    *
    * @param docs Documents to insert.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertMany
    */
  def insertMany(docs: js.Array[js.Object]): js.Promise[InsertWriteOpResult] = js.native
  /**
    * InsertMany.
    *
    * @param docs Documents to insert.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertMany
    */
  def insertMany(docs: js.Array[js.Object], callback: MongoCallback[InsertWriteOpResult]): Unit = js.native
  def insertMany(docs: js.Array[js.Object], options: CollectionInsertManyOptions): js.Promise[InsertWriteOpResult] = js.native
  /**
    * InsertMany.
    *
    * @param docs Documents to insert.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertMany
    */
  def insertMany(
    docs: js.Array[js.Object],
    options: CollectionInsertManyOptions,
    callback: MongoCallback[InsertWriteOpResult]
  ): Unit = js.native
  
  /**
    * InsertOne.
    *
    * @param docs Document to insert.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertOne
    */
  def insertOne(docs: js.Object): js.Promise[InsertOneWriteOpResult] = js.native
  /**
    * InsertOne.
    *
    * @param docs Document to insert.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertOne
    */
  def insertOne(docs: js.Object, callback: MongoCallback[InsertOneWriteOpResult]): Unit = js.native
  def insertOne(docs: js.Object, options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult] = js.native
  /**
    * InsertOne.
    *
    * @param docs Document to insert.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#insertOne
    */
  def insertOne(
    docs: js.Object,
    options: CollectionInsertOneOptions,
    callback: MongoCallback[InsertOneWriteOpResult]
  ): Unit = js.native
  
  /**
    * Returns if the collection is a capped collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#isCapped
    */
  def isCapped(): js.Promise[_] = js.native
  /**
    * Returns if the collection is a capped collection.
    *
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#isCapped
    */
  def isCapped(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Get the list of all indexes information for the collection.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#listIndexes
    */
  def listIndexes(): CommandCursor = js.native
  def listIndexes(options: ListIndexesOptions): CommandCursor = js.native
  
  def mapReduce(map: String, reduce: String): js.Promise[_] = js.native
  def mapReduce(map: String, reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce(map: String, reduce: String, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: String, reduce: js.Function): js.Promise[_] = js.native
  def mapReduce(map: String, reduce: js.Function, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: String, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce(map: String, reduce: js.Function, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: js.Function, reduce: String): js.Promise[_] = js.native
  def mapReduce(map: js.Function, reduce: String, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: js.Function, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
  def mapReduce(map: js.Function, reduce: String, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    *
    * @param map The mapping function.
    * @param reduce The reduce function.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#mapReduce
    */
  def mapReduce(map: js.Function, reduce: js.Function): js.Promise[_] = js.native
  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    *
    * @param map The mapping function.
    * @param reduce The reduce function.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#mapReduce
    */
  def mapReduce(map: js.Function, reduce: js.Function, callback: MongoCallback[_]): Unit = js.native
  def mapReduce(map: js.Function, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    *
    * @param map The mapping function.
    * @param reduce The reduce function.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#mapReduce
    */
  def mapReduce(map: js.Function, reduce: js.Function, options: MapReduceOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Get the full collection namespace.
    */
  var namespace: String = js.native
  
  /**
    * Returns the options of the collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#options
    */
  def options(): js.Promise[_] = js.native
  /**
    * Returns the options of the collection.
    *
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#options
    */
  def options(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Return N number of parallel cursors for a collection allowing parallel reading of entire collection. There are
    * no ordering guarantees for returned results.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#parallelCollectionScan
    */
  def parallelCollectionScan(): js.Promise[js.Array[Cursor[_]]] = js.native
  /**
    * Return N number of parallel cursors for a collection allowing parallel reading of entire collection. There are
    * no ordering guarantees for returned results.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#parallelCollectionScan
    */
  def parallelCollectionScan(callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  def parallelCollectionScan(options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[_]]] = js.native
  /**
    * Return N number of parallel cursors for a collection allowing parallel reading of entire collection. There are
    * no ordering guarantees for returned results.
    *
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#parallelCollectionScan
    */
  def parallelCollectionScan(options: ParallelCollectionScanOptions, callback: MongoCallback[js.Array[Cursor[_]]]): Unit = js.native
  
  /**
    * Reindex all indexes on the collection.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#reIndex
    */
  def reIndex(): js.Promise[_] = js.native
  /**
    * Reindex all indexes on the collection.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#reIndex
    */
  def reIndex(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * The current read concern values.
    */
  var readConcern: ReadConcern = js.native
  
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object): Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  def remove(selector: js.Object, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def remove(selector: js.Object, options: js.UndefOr[scala.Nothing], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def remove(selector: js.Object, options: CollectionOptionssinglebo): Unit = js.native
  def remove(selector: js.Object, options: CollectionOptionssinglebo, callback: MongoCallback[WriteOpResult]): Unit = js.native
  /** @deprecated Use use deleteOne, deleteMany or bulkWrite */
  @JSName("remove")
  def remove_Promise(selector: js.Object): js.Promise[WriteOpResult] = js.native
  @JSName("remove")
  def remove_Promise(selector: js.Object, options: CollectionOptionssinglebo): js.Promise[WriteOpResult] = js.native
  
  /**
    * Rename the collection.
    *
    * @param newName New name of of the collection.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#rename
    */
  def rename(newName: String): js.Promise[Collection[T]] = js.native
  /**
    * Rename the collection.
    *
    * @param newName New name of of the collection.
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#rename
    */
  def rename(newName: String, callback: MongoCallback[Collection[T]]): Unit = js.native
  def rename(newName: String, options: DropTarget): js.Promise[Collection[T]] = js.native
  /**
    * Rename the collection.
    *
    * @param newName New name of of the collection.
    * @param options Optional settings.
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#rename
    */
  def rename(newName: String, options: DropTarget, callback: MongoCallback[Collection[T]]): Unit = js.native
  
  /**
    * Replace a document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param doc The Document that replaces the matching document.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#replaceOne
    */
  def replaceOne(filter: FilterQuery[T], doc: js.Object): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Replace a document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param doc The Document that replaces the matching document.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#replaceOne
    */
  def replaceOne(filter: FilterQuery[T], doc: js.Object, callback: MongoCallback[UpdateWriteOpResult]): Unit = js.native
  def replaceOne(filter: FilterQuery[T], doc: js.Object, options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Replace a document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param doc The Document that replaces the matching document.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#replaceOne
    */
  def replaceOne(
    filter: FilterQuery[T],
    doc: js.Object,
    options: ReplaceOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: js.Object): js.Promise[WriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: js.Object, callback: MongoCallback[WriteOpResult]): Unit = js.native
  def save(doc: js.Object, options: CollectionOptions): js.Promise[WriteOpResult] = js.native
  /** @deprecated Use insertOne, insertMany, updateOne or updateMany */
  def save(doc: js.Object, options: CollectionOptions, callback: MongoCallback[WriteOpResult]): Unit = js.native
  
  /**
    * Get all the collection statistics.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#stats
    */
  def stats(): js.Promise[CollStats] = js.native
  /**
    * Get all the collection statistics.
    *
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#stats
    */
  def stats(callback: MongoCallback[CollStats]): Unit = js.native
  def stats(options: Scale): js.Promise[CollStats] = js.native
  /**
    * Get all the collection statistics.
    *
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#stats
    */
  def stats(options: Scale, callback: MongoCallback[CollStats]): Unit = js.native
  
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[T], update: UpdateQuery[T]): js.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(filter: FilterQuery[T], update: UpdateQuery[T], callback: MongoCallback[WriteOpResult]): Unit = js.native
  def update(filter: FilterQuery[T], update: UpdateQuery[T], options: ReplaceOneOptionsmultiboo): js.Promise[WriteOpResult] = js.native
  /** @deprecated use updateOne, updateMany or bulkWrite */
  def update(
    filter: FilterQuery[T],
    update: UpdateQuery[T],
    options: ReplaceOneOptionsmultiboo,
    callback: MongoCallback[WriteOpResult]
  ): Unit = js.native
  
  /**
    * Update multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateMany
    */
  def updateMany(filter: FilterQuery[T], update: UpdateQuery[T]): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Update multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateMany
    */
  def updateMany(filter: FilterQuery[T], update: UpdateQuery[T], callback: MongoCallback[UpdateWriteOpResult]): Unit = js.native
  def updateMany(filter: FilterQuery[T], update: UpdateQuery[T], options: UpdateManyOptions): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Update multiple documents on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateMany
    */
  def updateMany(
    filter: FilterQuery[T],
    update: UpdateQuery[T],
    options: UpdateManyOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  
  /**
    * Update a single document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateOne
    */
  def updateOne(filter: FilterQuery[T], update: UpdateQuery[T]): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Update a single document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateOne
    */
  def updateOne(filter: FilterQuery[T], update: UpdateQuery[T], callback: MongoCallback[UpdateWriteOpResult]): Unit = js.native
  def updateOne(filter: FilterQuery[T], update: UpdateQuery[T], options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
  /**
    * Update a single document on MongoDB.
    *
    * @param filter The Filter used to select the document to update.
    * @param update The update operations to be applied to the document.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Collection.html#updateOne
    */
  def updateOne(
    filter: FilterQuery[T],
    update: UpdateQuery[T],
    options: ReplaceOneOptions,
    callback: MongoCallback[UpdateWriteOpResult]
  ): Unit = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates, replacements, deletions, and invalidations) in this collection.
    * @param pipeline An array of aggregation pipeline stages through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch
    */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.UndefOr[scala.Nothing], options: ChangeStreamOptionsstartA): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionsstartA): ChangeStream = js.native
  
  /**
    * The current write concern values.
    */
  var writeConcern: WriteConcern = js.native
}
