package typings.tedious.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.tedious.tediousStrings.charsetChange
import typings.tedious.tediousStrings.connect
import typings.tedious.tediousStrings.databaseChange
import typings.tedious.tediousStrings.debug
import typings.tedious.tediousStrings.end
import typings.tedious.tediousStrings.error
import typings.tedious.tediousStrings.errorMessage
import typings.tedious.tediousStrings.infoMessage
import typings.tedious.tediousStrings.languageChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tedious", "Connection")
@js.native
class Connection protected () extends EventEmitter {
  def this(config: ConnectionConfig) = this()
  /**
    * Start a transaction. As only one request at a time may be executed on
    * a connection, another request should not be initiated until this callback is called.
    * @param callback The callback is called when the request to start the transaction has completed, either successfully or with an error. If an error occured then err will describe the error.
    * @param name A string representing a name to associate with the transaction. Optional, and defaults to an empty string. Required when isolationLevel is present.
    * @param isolationLevel The isolation level that the transaction is to be run with.
    */
  def beginTransaction(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def beginTransaction(callback: js.Function1[/* error */ js.UndefOr[Error], Unit], name: String): Unit = js.native
  def beginTransaction(
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    name: String,
    isolationLevel: ISOLATION_LEVEL
  ): Unit = js.native
  /**
    * Call a stored procedure represented by request.
    */
  def callProcedure(request: Request): Unit = js.native
  /**
    * Cancel currently executed request.
    */
  def cancel(): Unit = js.native
  /**
    * Closes the connection to the database. The end will be emmited once the connection has been closed.
    */
  def close(): Unit = js.native
  /**
    * Commit a transaction.
    * There should be an active transaction. That is, beginTransaction should have been previously called.
    * @param callback The callback is called when the request to commit the transaction has completed, either successfully or with an error. If an error occured then err will describe the error.
    *                     As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    */
  def commitTransaction(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * Executes a BulkLoad.
    */
  def execBulkLoad(bulkLoad: BulkLoad): Unit = js.native
  /**
    * Execute the SQL represented by request.
    * As sp_executesql is used to execute the SQL, if the same SQL is executed multiples times using this function, the SQL Server query optimizer is likely to reuse the execution plan it generates for the first execution.
    * Beware of the way that scoping rules apply, and how they may affect local temp tables. If you're running in to scoping issues, then execSqlBatch may be a better choice. See also issue #24.
    */
  def execSql(request: Request): Unit = js.native
  /**
    * Execute the SQL batch represented by request. There is no param support, and unlike execSql, it is not likely that SQL Server will reuse the execution plan it generates for the SQL.
    * In almost all cases, execSql will be a better choice.
    */
  def execSqlBatch(request: Request): Unit = js.native
  /**
    * Execute previously prepared SQL, using the supplied parameters.
    * @param request A previously prepared Request.
    * @param parameters An object whose names correspond to the names of parameters that were added to the request before it was prepared. The object's values are passed as the parameters' values when the request is executed.
    */
  def execute(request: Request, parameters: js.Object): Unit = js.native
  /**
    * Creates a new BulkLoad instance.
    * @param tableName The name of the table to bulk-insert into.
    * @param callback A function which will be called after the BulkLoad finishes executing. rowCount will equal the number of rows inserted.
    */
  def newBulkLoad(tableName: String, callback: js.Function2[/* error */ Error, /* rowCount */ Double, Unit]): BulkLoad = js.native
  /**
    * The server has reported that the charset has changed.
    */
  @JSName("on")
  def on_charsetChange(event: charsetChange, listener: js.Function1[/* charset */ String, Unit]): this.type = js.native
  /**
    * The attempt to connect and validate has completed.
    */
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * The server has reported that the active database has changed. This may be as a result of a successful login, or a use statement.
    */
  @JSName("on")
  def on_databaseChange(event: databaseChange, listener: js.Function1[/* databaseName */ String, Unit]): this.type = js.native
  /**
    * A debug message is available. It may be logged or ignored.
    */
  @JSName("on")
  def on_debug(event: debug, listener: js.Function1[/* messageText */ String, Unit]): this.type = js.native
  /**
    * The connection has ended. This may be as a result of the client calling close(), the server closing the connection, or a network error.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Internal error occurs.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * The server has issued an error message.
    */
  @JSName("on")
  def on_errorMessage(event: errorMessage, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * The server has issued an information message.
    */
  @JSName("on")
  def on_infoMessage(event: infoMessage, listener: js.Function1[/* info */ InfoObject, Unit]): this.type = js.native
  /**
    * The server has reported that the language has changed.
    */
  @JSName("on")
  def on_languageChange(event: languageChange, listener: js.Function1[/* languageName */ String, Unit]): this.type = js.native
  /**
    * Prepare the SQL represented by the request. The request can then be used in subsequent calls to execute and unprepare
    * @param request A Request object representing the request. Parameters only require a name and type. Parameter values are ignored.
    */
  def prepare(request: Request): Unit = js.native
  /**
    * Reset the connection to its initial state. Can be useful for connection pool implementations.
    * @param callback The callback is called when the connection reset has completed, either successfully or with an error. If an error occured then err will describe the error.
    *                     As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    */
  def reset(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * Rollback a transaction. There should be an active transaction. That is, beginTransaction should have been previously called.
    * @param callback The callback is called when the request to rollback the transaction has completed, either successfully or with an error. If an error occured then err will describe the error.
    *                         As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    */
  def rollbackTransaction(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * Set a savepoint within a transaction. There should be an active transaction. That is, beginTransaction should have been previously called.
    * @param callback The callback is called when the request to set a savepoint within the transaction has completed, either successfully or with an error. If an error occured then err will describe the error.
    *                     As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    */
  def saveTransaction(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * Run the given callback after starting a transaction, and commit or rollback the transaction afterwards.
    * This is a helper that employs beginTransaction, commitTransaction, rollbackTransaction and saveTransaction to greatly simplify the use of database transactions and automatically handle transaction nesting.
    * @param callback The callback is called when the request to start a transaction (or create a savepoint, in the case of a nested transaction) has completed, either successfully or with an error.
    *                  If an error occured, then err will describe the error. If no error occured, the callback should perform its work and eventually call done with an error or null
    *                  (to trigger a transaction rollback or a transaction commit) and an additional completion callback that will be called when the request to rollback or commit the current transaction
    *                  has completed, either successfully or with an error. Additional arguments given to done will be passed through to this callback.
    *                     As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    * @param name A string representing a name to associate with the transaction. Optional, and defaults to an empty string. In case of a nested transaction, naming the transaction name has no effect.
    * @param isolationLevel The isolation level that the transaction is to be run with.
    */
  def transaction(
    callback: js.Function2[
      /* error */ Error, 
      /* done */ js.Function3[
        /* error */ js.UndefOr[Error], 
        /* doneCallback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[Error], /* repeated */ js.Any, Unit]], 
        /* repeated */ js.Any, 
        Unit
      ], 
      Unit
    ]
  ): Unit = js.native
  def transaction(
    callback: js.Function2[
      /* error */ Error, 
      /* done */ js.Function3[
        /* error */ js.UndefOr[Error], 
        /* doneCallback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[Error], /* repeated */ js.Any, Unit]], 
        /* repeated */ js.Any, 
        Unit
      ], 
      Unit
    ],
    name: String
  ): Unit = js.native
  def transaction(
    callback: js.Function2[
      /* error */ Error, 
      /* done */ js.Function3[
        /* error */ js.UndefOr[Error], 
        /* doneCallback */ js.UndefOr[js.Function2[/* error */ js.UndefOr[Error], /* repeated */ js.Any, Unit]], 
        /* repeated */ js.Any, 
        Unit
      ], 
      Unit
    ],
    name: String,
    isolationLevel: ISOLATION_LEVEL
  ): Unit = js.native
  /**
    * Release the SQL Server resources associated with a previously prepared request.
    */
  def unprepare(request: Request): Unit = js.native
}

