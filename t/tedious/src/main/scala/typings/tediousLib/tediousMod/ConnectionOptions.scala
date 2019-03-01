package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered
    * during the given transaction's execution. This sets the value for SET XACT_ABORT during the initial
    * SQL phase of a connection (documentation).
    */
  var abortTransactionOnError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Application name used for identifying a specific application in profiling, logging or tracing tools of SQL Server. (default: Tedious) 
    */
  var appName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted
    * to lower case (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  var camelCaseColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  var cancelTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function with parameters (columnName, index, columnMetaData) and returning a string. If provided,
    * this will be called once per column per result-set. The returned value will be used instead of the
    * SQL-provided column name on row and meta data objects. This allows you to dynamically convert between
    * naming conventions. (default: null).
    */
  var columnNameReplacer: js.UndefOr[
    js.Function3[
      /* columnName */ java.lang.String, 
      /* index */ scala.Double, 
      /* columnMetaData */ ColumnMetaData, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this setting. (default: READ_COMMITED)
    */
  var connectionIsolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.undefined
  /**
    * Number of milliseconds before retrying to establish connection, in case of transient failure. (default: 500) 
    */
  var connectionRetryInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling tls.createSecurePair (default: {}).
    */
  var cryptoCredentialsDetails: js.UndefOr[js.Object] = js.undefined
  /**
    * Database to connect to (default: dependent on server configuration).
    */
  var database: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string representing position of month, day and year in temporal datatypes. (default: mdy) 
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number that sets to the first day of the week, it can be a number from 1 through 7.(default: 7, i.e, first day of the week is Sunday)
    */
  var datefirst: js.UndefOr[scala.Double] = js.undefined
  /**
    * Debug options
    */
  var debug: js.UndefOr[DebugOptions] = js.undefined
  /**
    * A boolean, controls the way null values should be used during comparison operation. (default: true)  
    */
  var enableAnsiNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by default. See the T-SQL documentation for more details. (Default: true). 
    */
  var enableAnsiNullDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, controls if padding should be applied for values shorter than the size of defined column. (default: true) 
    */
  var enableAnsiPadding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, SQL Server will follow ISO standard behavior during various error conditions. For details, see documentation. (default: true) 
    */
  var enableAnsiWarnings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, determines if query execution should be terminated during overflow or divide-by-zero error. (default: false)  
    */
  var enableArithAbort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, determines if concatenation with NULL should result in NULL or empty string value, more details in documentation. (default: true) 
    */
  var enableConcatNullYieldsNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, controls whether cursor should be closed, if the transaction opening it gets committed or rolled back. (default: false) 
    */
  var enableCursorCloseOnCommit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, sets the connection to either implicit or autocommit transaction mode. (default: false) 
    */
  var enableImplicitTransactions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, error is not generated during loss of precession. (default: false) 
    */
  var enableNumericRoundabort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, characters enclosed in single quotes are treated as literals and those enclosed double quotes are treated as identifiers. (default: true) 
    */
  var enableQuotedIdentifier: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on Windows Azure. (default: false).
    */
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, if the database requested by options.database cannot be accessed,
    * the connection will fail with an error. However, if options.fallbackToDefaultDb is set to true,
    * then the user's default database will be  * used instead (Default: false).
    */
  var fallbackToDefaultDb: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The instance name to connect to. The SQL Server Browser service must be running on the database server,
    * and UDP port 1444 on the database server must be reachable. (no default) Mutually exclusive with options.port.
    */
  var instanceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default isolation level that transactions will be run with. (default: READ_COMMITTED).
    */
  var isolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.undefined
  /**
    * A string, sets the language of the session (default: us_english)
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of retries on transient error (default: 3)
    */
  var maxRetriesOnTransientErrors: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  var packetSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Port to connect to (default: 1433). Mutually exclusive with options.instanceName.
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server Availability Group. For more information, see here. (default: false).
    */
  var readOnlyIntent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds before a request is considered failed, or 0 for no timeout (default: 15000).
    */
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnDone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnRequestCompletion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead. (default: 7_4).
    * Take this from tedious.TDS_VERSION.7_4 .
    */
  var tdsVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of data to be returned by SELECT statement for varchar(max), nvarchar(max), varbinary(max), text, ntext, and image type. (default: 2147483647)
    */
  var textsize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean, that verifies whether server's identity matches it's certificate's names (default: true)
    */
  var trustServerCertificate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  var useColumnNames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  var useUTC: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[scala.Boolean] = js.undefined,
    appName: java.lang.String = null,
    camelCaseColumns: js.UndefOr[scala.Boolean] = js.undefined,
    cancelTimeout: scala.Int | scala.Double = null,
    columnNameReplacer: js.Function3[
      /* columnName */ java.lang.String, 
      /* index */ scala.Double, 
      /* columnMetaData */ ColumnMetaData, 
      java.lang.String
    ] = null,
    connectTimeout: scala.Int | scala.Double = null,
    connectionIsolationLevel: ISOLATION_LEVEL = null,
    connectionRetryInterval: scala.Int | scala.Double = null,
    cryptoCredentialsDetails: js.Object = null,
    database: java.lang.String = null,
    dateFormat: java.lang.String = null,
    datefirst: scala.Int | scala.Double = null,
    debug: DebugOptions = null,
    enableAnsiNull: js.UndefOr[scala.Boolean] = js.undefined,
    enableAnsiNullDefault: js.UndefOr[scala.Boolean] = js.undefined,
    enableAnsiPadding: js.UndefOr[scala.Boolean] = js.undefined,
    enableAnsiWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    enableArithAbort: js.UndefOr[scala.Boolean] = js.undefined,
    enableConcatNullYieldsNull: js.UndefOr[scala.Boolean] = js.undefined,
    enableCursorCloseOnCommit: js.UndefOr[scala.Boolean] = js.undefined,
    enableImplicitTransactions: js.UndefOr[scala.Boolean] = js.undefined,
    enableNumericRoundabort: js.UndefOr[scala.Boolean] = js.undefined,
    enableQuotedIdentifier: js.UndefOr[scala.Boolean] = js.undefined,
    encrypt: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackToDefaultDb: js.UndefOr[scala.Boolean] = js.undefined,
    instanceName: java.lang.String = null,
    isolationLevel: ISOLATION_LEVEL = null,
    language: java.lang.String = null,
    localAddress: java.lang.String = null,
    maxRetriesOnTransientErrors: scala.Int | scala.Double = null,
    packetSize: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    readOnlyIntent: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    rowCollectionOnDone: js.UndefOr[scala.Boolean] = js.undefined,
    rowCollectionOnRequestCompletion: js.UndefOr[scala.Boolean] = js.undefined,
    tdsVersion: scala.Int | scala.Double = null,
    textsize: scala.Int | scala.Double = null,
    trustServerCertificate: js.UndefOr[scala.Boolean] = js.undefined,
    useColumnNames: js.UndefOr[scala.Boolean] = js.undefined,
    useUTC: js.UndefOr[scala.Boolean] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(camelCaseColumns)) __obj.updateDynamic("camelCaseColumns")(camelCaseColumns)
    if (cancelTimeout != null) __obj.updateDynamic("cancelTimeout")(cancelTimeout.asInstanceOf[js.Any])
    if (columnNameReplacer != null) __obj.updateDynamic("columnNameReplacer")(columnNameReplacer)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionIsolationLevel != null) __obj.updateDynamic("connectionIsolationLevel")(connectionIsolationLevel)
    if (connectionRetryInterval != null) __obj.updateDynamic("connectionRetryInterval")(connectionRetryInterval.asInstanceOf[js.Any])
    if (cryptoCredentialsDetails != null) __obj.updateDynamic("cryptoCredentialsDetails")(cryptoCredentialsDetails)
    if (database != null) __obj.updateDynamic("database")(database)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (datefirst != null) __obj.updateDynamic("datefirst")(datefirst.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(enableAnsiNull)) __obj.updateDynamic("enableAnsiNull")(enableAnsiNull)
    if (!js.isUndefined(enableAnsiNullDefault)) __obj.updateDynamic("enableAnsiNullDefault")(enableAnsiNullDefault)
    if (!js.isUndefined(enableAnsiPadding)) __obj.updateDynamic("enableAnsiPadding")(enableAnsiPadding)
    if (!js.isUndefined(enableAnsiWarnings)) __obj.updateDynamic("enableAnsiWarnings")(enableAnsiWarnings)
    if (!js.isUndefined(enableArithAbort)) __obj.updateDynamic("enableArithAbort")(enableArithAbort)
    if (!js.isUndefined(enableConcatNullYieldsNull)) __obj.updateDynamic("enableConcatNullYieldsNull")(enableConcatNullYieldsNull)
    if (!js.isUndefined(enableCursorCloseOnCommit)) __obj.updateDynamic("enableCursorCloseOnCommit")(enableCursorCloseOnCommit)
    if (!js.isUndefined(enableImplicitTransactions)) __obj.updateDynamic("enableImplicitTransactions")(enableImplicitTransactions)
    if (!js.isUndefined(enableNumericRoundabort)) __obj.updateDynamic("enableNumericRoundabort")(enableNumericRoundabort)
    if (!js.isUndefined(enableQuotedIdentifier)) __obj.updateDynamic("enableQuotedIdentifier")(enableQuotedIdentifier)
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt)
    if (!js.isUndefined(fallbackToDefaultDb)) __obj.updateDynamic("fallbackToDefaultDb")(fallbackToDefaultDb)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel)
    if (language != null) __obj.updateDynamic("language")(language)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxRetriesOnTransientErrors != null) __obj.updateDynamic("maxRetriesOnTransientErrors")(maxRetriesOnTransientErrors.asInstanceOf[js.Any])
    if (packetSize != null) __obj.updateDynamic("packetSize")(packetSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyIntent)) __obj.updateDynamic("readOnlyIntent")(readOnlyIntent)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnDone)) __obj.updateDynamic("rowCollectionOnDone")(rowCollectionOnDone)
    if (!js.isUndefined(rowCollectionOnRequestCompletion)) __obj.updateDynamic("rowCollectionOnRequestCompletion")(rowCollectionOnRequestCompletion)
    if (tdsVersion != null) __obj.updateDynamic("tdsVersion")(tdsVersion.asInstanceOf[js.Any])
    if (textsize != null) __obj.updateDynamic("textsize")(textsize.asInstanceOf[js.Any])
    if (!js.isUndefined(trustServerCertificate)) __obj.updateDynamic("trustServerCertificate")(trustServerCertificate)
    if (!js.isUndefined(useColumnNames)) __obj.updateDynamic("useColumnNames")(useColumnNames)
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

