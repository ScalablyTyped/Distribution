package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tedious", "Request")
@js.native
class Request protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Constructor
    * @param sql The SQL statement to be executed (or a procedure name, if the request is to be used with connection.callProcedure).
    * @param callback	The callback is called when the request has completed, either successfully or with an error. If an error occurs during execution of the statement(s), then err will describe the error.
    * 					As only one request at a time may be executed on a connection, another request should not be initiated until this callback is called.
    * 					rowCount: The number of rows emitted as result of executing the SQL statement.
    * 					rows: Rows as a result of executing the SQL statement. Will only be avaiable if Connection's config.options.rowCollectionOnRequestCompletion is true.
    */
  def this(sql: java.lang.String, callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* rowCount */ scala.Double, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]) = this()
  /**
    * Add an output parameter to the request. The parameter's value will be provide by an emitted returnValue event.
    * @param name The parameter name. This should correspond to a parameter in the SQL, or a parameter that a called procedure expects.
    * @param type One of the supported data types.
    * @param value The value that the parameter is to be given. The Javascript type of the argument should match that documented for data types. Optional.
    * @param options Additional type options. Optional.
    */
  def addOutputParameter(name: java.lang.String, `type`: TediousType): scala.Unit = js.native
  def addOutputParameter(name: java.lang.String, `type`: TediousType, value: js.Any): scala.Unit = js.native
  def addOutputParameter(name: java.lang.String, `type`: TediousType, value: js.Any, options: ParameterOptions): scala.Unit = js.native
  /**
    * Add an input parameter to the request.
    * @param name The parameter name. This should correspond to a parameter in the SQL, or a parameter that a called procedure expects. The name should not start with '@'.
    * @param type One of the supported data types.
    * @param value The value that the parameter is to be given. The Javascript type of the argument should match that documented for data types.
    * @param options Additional type options. Optional.
    */
  def addParameter(name: java.lang.String, `type`: TediousType, value: js.Any): scala.Unit = js.native
  def addParameter(name: java.lang.String, `type`: TediousType, value: js.Any, options: ParameterOptions): scala.Unit = js.native
  /**
    * This event, describing result set columns, will be emitted before row events are emitted. This event may be emited multiple times when more than one recordset is produced by the statement.
    */
  @JSName("on")
  def on_columnMetadata(
    event: tediousLib.tediousLibStrings.columnMetadata,
    listener: js.Function1[/* columns */ js.Array[ColumnMetaData], scala.Unit]
  ): this.type = js.native
  /**
    * All rows from a result set have been provided (through row events). This token is used to indicate the completion of a SQL statement. As multiple SQL statements can be sent to the server in a single SQL batch, multiple done events can be generated. An done event is emited for each SQL statement in the SQL batch except variable declarations. For execution of SQL statements within stored procedures, doneProc and doneInProc events are used in place of done events.
    */
  @JSName("on")
  def on_done(
    event: tediousLib.tediousLibStrings.done,
    listener: js.Function3[
      /* error */ nodeLib.Error, 
      /* more */ scala.Boolean, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Indicates the completion status of a SQL statement within a stored procedure. All rows from a statement in a stored procedure have been provided (through row events).
    */
  @JSName("on")
  def on_doneInProc(
    event: tediousLib.tediousLibStrings.doneInProc,
    listener: js.Function4[
      /* error */ nodeLib.Error, 
      /* more */ scala.Boolean, 
      /* returnStatus */ js.Any, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Indicates the completion status of a stored procedure. This is also generated for stored procedures executed through SQL statements.
    */
  @JSName("on")
  def on_doneProc(
    event: tediousLib.tediousLibStrings.doneProc,
    listener: js.Function3[
      /* error */ nodeLib.Error, 
      /* more */ scala.Boolean, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * The request encountered an error and has not been prepared. 
    */
  @JSName("on")
  def on_error(
    event: tediousLib.tediousLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /**
    * The request has been prepared and can be used in subsequent calls to execute and unprepare. 
    */
  @JSName("on")
  def on_prepared(event: tediousLib.tediousLibStrings.prepared, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * This is the final event emitted by a request. This is emitted after the callback passed in a request is called. 
    */
  @JSName("on")
  def on_requestCompleted(event: tediousLib.tediousLibStrings.requestCompleted, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * A value for an output parameter (that was added to the request with addOutputParameter(...)). See also Using Parameters.
    */
  @JSName("on")
  def on_returnValue(
    event: tediousLib.tediousLibStrings.returnValue,
    listener: js.Function3[
      /* parameterName */ java.lang.String, 
      /* value */ js.Any, 
      /* metadata */ ColumnMetaData, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * A row resulting from execution of the SQL statement
    */
  @JSName("on")
  def on_row(
    event: tediousLib.tediousLibStrings.row,
    listener: js.Function1[/* columns */ js.Array[ColumnValue], scala.Unit]
  ): this.type = js.native
  /**
    * Temporarily suspends the flow of data from the database. No more 'row' events will be emitted until request.resume() is called. 
    */
  def pause(): scala.Unit = js.native
  /**
    * Resumes the flow of data from the database. 
    */
  def resume(): scala.Unit = js.native
}

