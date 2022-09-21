package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablestore", "Client")
@js.native
open class Client protected () extends StObject {
  def this(config: ConfigOptions) = this()
  
  def abortTransaction(params: AbortLocalTransactionParams): js.Promise[Any] = js.native
  def abortTransaction(
    params: AbortLocalTransactionParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def batchGetRow(params: BatchGetRowParams): js.Promise[BatchGetRowResult] = js.native
  def batchGetRow(
    params: BatchGetRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ BatchGetRowResult, Unit]
  ): js.Promise[BatchGetRowResult] = js.native
  
  def batchWriteRow(params: BatchWriteRowParams): js.Promise[BatchWriteRowResult] = js.native
  def batchWriteRow(
    params: BatchWriteRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ BatchWriteRowResult, Unit]
  ): js.Promise[BatchWriteRowResult] = js.native
  
  def commitTransaction(params: CommitLocalTransactionParams): js.Promise[Any] = js.native
  def commitTransaction(
    params: CommitLocalTransactionParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def createIndex(params: CreateIndexParams): js.Promise[Any] = js.native
  def createIndex(
    params: CreateIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def createSearchIndex(params: CreateSearchIndexParams): js.Promise[Any] = js.native
  def createSearchIndex(
    params: CreateSearchIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def createTable(params: CreateTableParams): js.Promise[Any] = js.native
  def createTable(params: CreateTableParams, callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]): js.Promise[Any] = js.native
  
  def deleteRow(params: DeleteRowParams): js.Promise[SingleRowResult] = js.native
  def deleteRow(
    params: DeleteRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ SingleRowResult, Unit]
  ): js.Promise[SingleRowResult] = js.native
  
  def deleteSearchIndex(params: DeleteSearchIndexParams): js.Promise[Any] = js.native
  def deleteSearchIndex(
    params: DeleteSearchIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def deleteTable(params: DeleteTableParams): js.Promise[Any] = js.native
  def deleteTable(
    params: DeleteTableParams,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def describeSearchIndex(params: DescribeSearchIndexParams): js.Promise[Any] = js.native
  def describeSearchIndex(
    params: DescribeSearchIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def describeTable(params: DescribeTableParams): js.Promise[DescribeTableResult] = js.native
  def describeTable(
    params: DescribeTableParams,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ DescribeTableResult, Unit]
  ): js.Promise[DescribeTableResult] = js.native
  
  def dropIndex(params: DropIndexParams): js.Promise[Any] = js.native
  def dropIndex(
    params: DropIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def getRange(params: GetRangeParams): js.Promise[GetRangeResult] = js.native
  def getRange(
    params: GetRangeParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ GetRangeResult, Unit]
  ): js.Promise[GetRangeResult] = js.native
  
  def getRow(params: GetRowParams): js.Promise[SingleRowResult] = js.native
  def getRow(
    params: GetRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ SingleRowResult, Unit]
  ): js.Promise[SingleRowResult] = js.native
  
  def listSearchIndex(params: ListSearchIndexParams): js.Promise[Any] = js.native
  def listSearchIndex(
    params: ListSearchIndexParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]
  ): js.Promise[Any] = js.native
  
  def listTable(params: Any): js.Promise[ListTableResult] = js.native
  def listTable(params: Any, callback: js.Function2[/* err */ js.Error | Null, /* data */ ListTableResult, Unit]): js.Promise[ListTableResult] = js.native
  
  def putRow(params: PutRowParams): js.Promise[SingleRowResult] = js.native
  def putRow(
    params: PutRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ SingleRowResult, Unit]
  ): js.Promise[SingleRowResult] = js.native
  
  def search(params: SearchParams): js.Promise[Any] = js.native
  def search(params: SearchParams, callback: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]): js.Promise[Any] = js.native
  
  def startLocalTransaction(params: StartLocalTransactionParams): js.Promise[StartLocalTransactionResult] = js.native
  def startLocalTransaction(
    params: StartLocalTransactionParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ StartLocalTransactionResult, Unit]
  ): js.Promise[StartLocalTransactionResult] = js.native
  
  def updateRow(params: UpdateRowParams): js.Promise[SingleRowResult] = js.native
  def updateRow(
    params: UpdateRowParams,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ SingleRowResult, Unit]
  ): js.Promise[SingleRowResult] = js.native
  
  def updateTable(params: UpdateTableParams): js.Promise[Any] = js.native
  def updateTable(params: UpdateTableParams, callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]): js.Promise[Any] = js.native
}
