package typings.tedious.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.tedious.tediousStrings.columnMetadata
import typings.tedious.tediousStrings.done
import typings.tedious.tediousStrings.doneInProc
import typings.tedious.tediousStrings.doneProc
import typings.tedious.tediousStrings.error
import typings.tedious.tediousStrings.prepared
import typings.tedious.tediousStrings.requestCompleted
import typings.tedious.tediousStrings.returnValue
import typings.tedious.tediousStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tedious", "Request")
@js.native
class Request protected () extends EventEmitter {
  /**
    * Constructor
    * @param sql The SQL statement to be executed (or a procedure name, if the request is to be used with connection.callProcedure).
    * @param callback    The callback is called when the request has completed, either successfully or with an error. If an error occurs during execution of the statement(s), then err will describe the error.
    *                     As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    *                     rowCount: The number of rows emitted as result of executing the SQL statement.
    *                     rows: Rows as a result of executing the SQL statement. Will only be avaiable if Connection's config.options.rowCollectionOnRequestCompletion is true.
    */
  def this(
    sql: String,
    callback: js.Function3[/* error */ Error, /* rowCount */ Double, /* rows */ js.Array[_], Unit]
  ) = this()
  /**
    * Add an output parameter to the request. The parameter's value will be provide by an emitted returnValue event.
    * @param name The parameter name. This should correspond to a parameter in the SQL, or a parameter that a called procedure expects.
    * @param type One of the supported data types.
    * @param value The value that the parameter is to be given. The Javascript type of the argument should match that documented for data types. Optional.
    * @param options Additional type options. Optional.
    */
  def addOutputParameter(name: String, `type`: TediousType): Unit = js.native
  def addOutputParameter(name: String, `type`: TediousType, value: js.UndefOr[scala.Nothing], options: ParameterOptions): Unit = js.native
  def addOutputParameter(name: String, `type`: TediousType, value: js.Any): Unit = js.native
  def addOutputParameter(name: String, `type`: TediousType, value: js.Any, options: ParameterOptions): Unit = js.native
  /**
    * Add an input parameter to the request.
    * @param name The parameter name. This should correspond to a parameter in the SQL, or a parameter that a called procedure expects. The name should not start with '@'.
    * @param type One of the supported data types.
    * @param value The value that the parameter is to be given. The Javascript type of the argument should match that documented for data types.
    * @param options Additional type options. Optional.
    */
  def addParameter(name: String, `type`: TediousType, value: js.Any): Unit = js.native
  def addParameter(name: String, `type`: TediousType, value: js.Any, options: ParameterOptions): Unit = js.native
  /**
    * This event, describing result set columns, will be emitted before row events are emitted. This event may be emited multiple times when more than one recordset is produced by the statement.
    */
  @JSName("on")
  def on_columnMetadata(event: columnMetadata, listener: js.Function1[/* columns */ js.Array[ColumnMetaData], Unit]): this.type = js.native
  /**
    * All rows from a result set have been provided (through row events). This token is used to indicate the completion of a SQL statement. As multiple SQL statements can be sent to the server in a single SQL batch, multiple done events can be generated. An done event is emited for each SQL statement in the SQL batch except variable declarations. For execution of SQL statements within stored procedures, doneProc and doneInProc events are used in place of done events.
    */
  @JSName("on")
  def on_done(
    event: done,
    listener: js.Function3[/* rowCount */ Double, /* more */ Boolean, /* rows */ js.Array[_], Unit]
  ): this.type = js.native
  /**
    * Indicates the completion status of a SQL statement within a stored procedure. All rows from a statement in a stored procedure have been provided (through row events).
    */
  @JSName("on")
  def on_doneInProc(
    event: doneInProc,
    listener: js.Function3[/* rowCount */ Double, /* more */ Boolean, /* rows */ js.Array[_], Unit]
  ): this.type = js.native
  /**
    * Indicates the completion status of a stored procedure. This is also generated for stored procedures executed through SQL statements.
    */
  @JSName("on")
  def on_doneProc(
    event: doneProc,
    listener: js.Function4[
      /* rowCount */ Double, 
      /* more */ Boolean, 
      /* returnStatus */ js.Any, 
      /* rows */ js.Array[_], 
      Unit
    ]
  ): this.type = js.native
  /**
    * The request encountered an error and has not been prepared.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * The request has been prepared and can be used in subsequent calls to execute and unprepare.
    */
  @JSName("on")
  def on_prepared(event: prepared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This is the final event emitted by a request. This is emitted after the callback passed in a request is called.
    */
  @JSName("on")
  def on_requestCompleted(event: requestCompleted, listener: js.Function0[Unit]): this.type = js.native
  /**
    * A value for an output parameter (that was added to the request with addOutputParameter(...)). See also Using Parameters.
    */
  @JSName("on")
  def on_returnValue(
    event: returnValue,
    listener: js.Function3[/* parameterName */ String, /* value */ js.Any, /* metadata */ ColumnMetaData, Unit]
  ): this.type = js.native
  /**
    * A row resulting from execution of the SQL statement
    */
  @JSName("on")
  def on_row(event: row, listener: js.Function1[/* columns */ js.Array[ColumnValue], Unit]): this.type = js.native
  /**
    * Temporarily suspends the flow of data from the database. No more 'row' events will be emitted until request.resume() is called.
    */
  def pause(): Unit = js.native
  /**
    * Resumes the flow of data from the database.
    */
  def resume(): Unit = js.native
}

