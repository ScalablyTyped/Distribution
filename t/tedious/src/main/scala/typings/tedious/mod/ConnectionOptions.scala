package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered
    * during the given transaction's execution. This sets the value for SET XACT_ABORT during the initial
    * SQL phase of a connection (documentation).
    */
  var abortTransactionOnError: js.UndefOr[Boolean] = js.undefined
  /**
    * Application name used for identifying a specific application in profiling, logging or tracing tools of SQL Server. (default: Tedious)
    */
  var appName: js.UndefOr[String] = js.undefined
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted
    * to lower case (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  var camelCaseColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  var cancelTimeout: js.UndefOr[Double] = js.undefined
  /**
    * A function with parameters (columnName, index, columnMetaData) and returning a string. If provided,
    * this will be called once per column per result-set. The returned value will be used instead of the
    * SQL-provided column name on row and meta data objects. This allows you to dynamically convert between
    * naming conventions. (default: null).
    */
  var columnNameReplacer: js.UndefOr[
    js.Function3[
      /* columnName */ String, 
      /* index */ Double, 
      /* columnMetaData */ ColumnMetaData, 
      String
    ]
  ] = js.undefined
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this setting. (default: READ_COMMITED)
    */
  var connectionIsolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.undefined
  /**
    * Number of milliseconds before retrying to establish connection, in case of transient failure. (default: 500)
    */
  var connectionRetryInterval: js.UndefOr[Double] = js.undefined
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling tls.createSecurePair (default: {}).
    */
  var cryptoCredentialsDetails: js.UndefOr[js.Object] = js.undefined
  /**
    * Database to connect to (default: dependent on server configuration).
    */
  var database: js.UndefOr[String] = js.undefined
  /**
    * A string representing position of month, day and year in temporal datatypes. (default: mdy)
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * Number that sets to the first day of the week, it can be a number from 1 through 7.(default: 7, i.e, first day of the week is Sunday)
    */
  var datefirst: js.UndefOr[Double] = js.undefined
  /**
    * Debug options
    */
  var debug: js.UndefOr[DebugOptions] = js.undefined
  /**
    * A boolean, controls the way null values should be used during comparison operation. (default: true)
    */
  var enableAnsiNull: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by default. See the T-SQL documentation for more details. (Default: true).
    */
  var enableAnsiNullDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, controls if padding should be applied for values shorter than the size of defined column. (default: true)
    */
  var enableAnsiPadding: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, SQL Server will follow ISO standard behavior during various error conditions. For details, see documentation. (default: true)
    */
  var enableAnsiWarnings: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, determines if query execution should be terminated during overflow or divide-by-zero error. (default: false)
    */
  var enableArithAbort: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, determines if concatenation with NULL should result in NULL or empty string value, more details in documentation. (default: true)
    */
  var enableConcatNullYieldsNull: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, controls whether cursor should be closed, if the transaction opening it gets committed or rolled back. (default: false)
    */
  var enableCursorCloseOnCommit: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, sets the connection to either implicit or autocommit transaction mode. (default: false)
    */
  var enableImplicitTransactions: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, error is not generated during loss of precession. (default: false)
    */
  var enableNumericRoundabort: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, characters enclosed in single quotes are treated as literals and those enclosed double quotes are treated as identifiers. (default: true)
    */
  var enableQuotedIdentifier: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on Windows Azure. (default: false).
    */
  var encrypt: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, if the database requested by options.database cannot be accessed,
    * the connection will fail with an error. However, if options.fallbackToDefaultDb is set to true,
    * then the user's default database will be  * used instead (Default: false).
    */
  var fallbackToDefaultDb: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance name to connect to. The SQL Server Browser service must be running on the database server,
    * and UDP port 1444 on the database server must be reachable. (no default) Mutually exclusive with options.port.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  /**
    * The default isolation level that transactions will be run with. (default: READ_COMMITTED).
    */
  var isolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.undefined
  /**
    * A string, sets the language of the session (default: us_english)
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  var localAddress: js.UndefOr[String] = js.undefined
  /**
    * Number of retries on transient error (default: 3)
    */
  var maxRetriesOnTransientErrors: js.UndefOr[Double] = js.undefined
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  var packetSize: js.UndefOr[Double] = js.undefined
  /**
    * Port to connect to (default: 1433). Mutually exclusive with options.instanceName.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server Availability Group. For more information, see here. (default: false).
    */
  var readOnlyIntent: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds before a request is considered failed, or 0 for no timeout (default: 15000).
    */
  var requestTimeout: js.UndefOr[Double] = js.undefined
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnDone: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead. (default: 7_4).
    * Take this from tedious.TDS_VERSION.7_4 .
    */
  var tdsVersion: js.UndefOr[Double] = js.undefined
  /**
    * Size of data to be returned by SELECT statement for varchar(max), nvarchar(max), varbinary(max), text, ntext, and image type. (default: 2147483647)
    */
  var textsize: js.UndefOr[Double] = js.undefined
  /**
    * A boolean, that verifies whether server's identity matches it's certificate's names (default: true)
    */
  var trustServerCertificate: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  var useColumnNames: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[Boolean] = js.undefined,
    appName: String = null,
    camelCaseColumns: js.UndefOr[Boolean] = js.undefined,
    cancelTimeout: js.UndefOr[Double] = js.undefined,
    columnNameReplacer: (/* columnName */ String, /* index */ Double, /* columnMetaData */ ColumnMetaData) => String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    connectionIsolationLevel: ISOLATION_LEVEL = null,
    connectionRetryInterval: js.UndefOr[Double] = js.undefined,
    cryptoCredentialsDetails: js.Object = null,
    database: String = null,
    dateFormat: String = null,
    datefirst: js.UndefOr[Double] = js.undefined,
    debug: DebugOptions = null,
    enableAnsiNull: js.UndefOr[Boolean] = js.undefined,
    enableAnsiNullDefault: js.UndefOr[Boolean] = js.undefined,
    enableAnsiPadding: js.UndefOr[Boolean] = js.undefined,
    enableAnsiWarnings: js.UndefOr[Boolean] = js.undefined,
    enableArithAbort: js.UndefOr[Boolean] = js.undefined,
    enableConcatNullYieldsNull: js.UndefOr[Boolean] = js.undefined,
    enableCursorCloseOnCommit: js.UndefOr[Boolean] = js.undefined,
    enableImplicitTransactions: js.UndefOr[Boolean] = js.undefined,
    enableNumericRoundabort: js.UndefOr[Boolean] = js.undefined,
    enableQuotedIdentifier: js.UndefOr[Boolean] = js.undefined,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    fallbackToDefaultDb: js.UndefOr[Boolean] = js.undefined,
    instanceName: String = null,
    isolationLevel: ISOLATION_LEVEL = null,
    language: String = null,
    localAddress: String = null,
    maxRetriesOnTransientErrors: js.UndefOr[Double] = js.undefined,
    packetSize: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    readOnlyIntent: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    rowCollectionOnDone: js.UndefOr[Boolean] = js.undefined,
    rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.undefined,
    tdsVersion: js.UndefOr[Double] = js.undefined,
    textsize: js.UndefOr[Double] = js.undefined,
    trustServerCertificate: js.UndefOr[Boolean] = js.undefined,
    useColumnNames: js.UndefOr[Boolean] = js.undefined,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError.get.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(camelCaseColumns)) __obj.updateDynamic("camelCaseColumns")(camelCaseColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelTimeout)) __obj.updateDynamic("cancelTimeout")(cancelTimeout.get.asInstanceOf[js.Any])
    if (columnNameReplacer != null) __obj.updateDynamic("columnNameReplacer")(js.Any.fromFunction3(columnNameReplacer))
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (connectionIsolationLevel != null) __obj.updateDynamic("connectionIsolationLevel")(connectionIsolationLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryInterval)) __obj.updateDynamic("connectionRetryInterval")(connectionRetryInterval.get.asInstanceOf[js.Any])
    if (cryptoCredentialsDetails != null) __obj.updateDynamic("cryptoCredentialsDetails")(cryptoCredentialsDetails.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(datefirst)) __obj.updateDynamic("datefirst")(datefirst.get.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNull)) __obj.updateDynamic("enableAnsiNull")(enableAnsiNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNullDefault)) __obj.updateDynamic("enableAnsiNullDefault")(enableAnsiNullDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiPadding)) __obj.updateDynamic("enableAnsiPadding")(enableAnsiPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiWarnings)) __obj.updateDynamic("enableAnsiWarnings")(enableAnsiWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArithAbort)) __obj.updateDynamic("enableArithAbort")(enableArithAbort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableConcatNullYieldsNull)) __obj.updateDynamic("enableConcatNullYieldsNull")(enableConcatNullYieldsNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCursorCloseOnCommit)) __obj.updateDynamic("enableCursorCloseOnCommit")(enableCursorCloseOnCommit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImplicitTransactions)) __obj.updateDynamic("enableImplicitTransactions")(enableImplicitTransactions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNumericRoundabort)) __obj.updateDynamic("enableNumericRoundabort")(enableNumericRoundabort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableQuotedIdentifier)) __obj.updateDynamic("enableQuotedIdentifier")(enableQuotedIdentifier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackToDefaultDb)) __obj.updateDynamic("fallbackToDefaultDb")(fallbackToDefaultDb.get.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetriesOnTransientErrors)) __obj.updateDynamic("maxRetriesOnTransientErrors")(maxRetriesOnTransientErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetSize)) __obj.updateDynamic("packetSize")(packetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyIntent)) __obj.updateDynamic("readOnlyIntent")(readOnlyIntent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnDone)) __obj.updateDynamic("rowCollectionOnDone")(rowCollectionOnDone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnRequestCompletion)) __obj.updateDynamic("rowCollectionOnRequestCompletion")(rowCollectionOnRequestCompletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tdsVersion)) __obj.updateDynamic("tdsVersion")(tdsVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textsize)) __obj.updateDynamic("textsize")(textsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trustServerCertificate)) __obj.updateDynamic("trustServerCertificate")(trustServerCertificate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumnNames)) __obj.updateDynamic("useColumnNames")(useColumnNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

