package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends StObject {
  
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered
    * during the given transaction's execution. This sets the value for SET XACT_ABORT during the initial
    * SQL phase of a connection (documentation).
    */
  var abortTransactionOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * Application name used for identifying a specific application in profiling, logging or tracing tools of SQL Server. (default: Tedious)
    */
  var appName: js.UndefOr[String] = js.native
  
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted
    * to lower case (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  var camelCaseColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  var cancelTimeout: js.UndefOr[Double] = js.native
  
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
  ] = js.native
  
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this setting. (default: READ_COMMITED)
    */
  var connectionIsolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.native
  
  /**
    * Number of milliseconds before retrying to establish connection, in case of transient failure. (default: 500)
    */
  var connectionRetryInterval: js.UndefOr[Double] = js.native
  
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling tls.createSecurePair (default: {}).
    */
  var cryptoCredentialsDetails: js.UndefOr[js.Object] = js.native
  
  /**
    * Database to connect to (default: dependent on server configuration).
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * A string representing position of month, day and year in temporal datatypes. (default: mdy)
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * Number that sets to the first day of the week, it can be a number from 1 through 7.(default: 7, i.e, first day of the week is Sunday)
    */
  var datefirst: js.UndefOr[Double] = js.native
  
  /**
    * Debug options
    */
  var debug: js.UndefOr[DebugOptions] = js.native
  
  /**
    * A boolean, controls the way null values should be used during comparison operation. (default: true)
    */
  var enableAnsiNull: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by default. See the T-SQL documentation for more details. (Default: true).
    */
  var enableAnsiNullDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, controls if padding should be applied for values shorter than the size of defined column. (default: true)
    */
  var enableAnsiPadding: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, SQL Server will follow ISO standard behavior during various error conditions. For details, see documentation. (default: true)
    */
  var enableAnsiWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, determines if query execution should be terminated during overflow or divide-by-zero error. (default: false)
    */
  var enableArithAbort: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, determines if concatenation with NULL should result in NULL or empty string value, more details in documentation. (default: true)
    */
  var enableConcatNullYieldsNull: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, controls whether cursor should be closed, if the transaction opening it gets committed or rolled back. (default: false)
    */
  var enableCursorCloseOnCommit: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, sets the connection to either implicit or autocommit transaction mode. (default: false)
    */
  var enableImplicitTransactions: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, error is not generated during loss of precession. (default: false)
    */
  var enableNumericRoundabort: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, characters enclosed in single quotes are treated as literals and those enclosed double quotes are treated as identifiers. (default: true)
    */
  var enableQuotedIdentifier: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on Windows Azure. (default: false).
    */
  var encrypt: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, if the database requested by options.database cannot be accessed,
    * the connection will fail with an error. However, if options.fallbackToDefaultDb is set to true,
    * then the user's default database will be  * used instead (Default: false).
    */
  var fallbackToDefaultDb: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance name to connect to. The SQL Server Browser service must be running on the database server,
    * and UDP port 1444 on the database server must be reachable. (no default) Mutually exclusive with options.port.
    */
  var instanceName: js.UndefOr[String] = js.native
  
  /**
    * The default isolation level that transactions will be run with. (default: READ_COMMITTED).
    */
  var isolationLevel: js.UndefOr[ISOLATION_LEVEL] = js.native
  
  /**
    * A string, sets the language of the session (default: us_english)
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  var localAddress: js.UndefOr[String] = js.native
  
  /**
    * Number of retries on transient error (default: 3)
    */
  var maxRetriesOnTransientErrors: js.UndefOr[Double] = js.native
  
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  var packetSize: js.UndefOr[Double] = js.native
  
  /**
    * Port to connect to (default: 1433). Mutually exclusive with options.instanceName.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server Availability Group. For more information, see here. (default: false).
    */
  var readOnlyIntent: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds before a request is considered failed, or 0 for no timeout (default: 15000).
    */
  var requestTimeout: js.UndefOr[Double] = js.native
  
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnDone: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  var rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead. (default: 7_4).
    * Take this from tedious.TDS_VERSION.7_4 .
    */
  var tdsVersion: js.UndefOr[Double] = js.native
  
  /**
    * Size of data to be returned by SELECT statement for varchar(max), nvarchar(max), varbinary(max), text, ntext, and image type. (default: 2147483647)
    */
  var textsize: js.UndefOr[Double] = js.native
  
  /**
    * A boolean, that verifies whether server's identity matches it's certificate's names (default: true)
    */
  var trustServerCertificate: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  var useColumnNames: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  var useUTC: js.UndefOr[Boolean] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortTransactionOnError(value: Boolean): Self = StObject.set(x, "abortTransactionOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortTransactionOnErrorUndefined: Self = StObject.set(x, "abortTransactionOnError", js.undefined)
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    @scala.inline
    def setCamelCaseColumns(value: Boolean): Self = StObject.set(x, "camelCaseColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamelCaseColumnsUndefined: Self = StObject.set(x, "camelCaseColumns", js.undefined)
    
    @scala.inline
    def setCancelTimeout(value: Double): Self = StObject.set(x, "cancelTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimeoutUndefined: Self = StObject.set(x, "cancelTimeout", js.undefined)
    
    @scala.inline
    def setColumnNameReplacer(
      value: (/* columnName */ String, /* index */ Double, /* columnMetaData */ ColumnMetaData) => String
    ): Self = StObject.set(x, "columnNameReplacer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setColumnNameReplacerUndefined: Self = StObject.set(x, "columnNameReplacer", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectionIsolationLevel(value: ISOLATION_LEVEL): Self = StObject.set(x, "connectionIsolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIsolationLevelUndefined: Self = StObject.set(x, "connectionIsolationLevel", js.undefined)
    
    @scala.inline
    def setConnectionRetryInterval(value: Double): Self = StObject.set(x, "connectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "connectionRetryInterval", js.undefined)
    
    @scala.inline
    def setCryptoCredentialsDetails(value: js.Object): Self = StObject.set(x, "cryptoCredentialsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoCredentialsDetailsUndefined: Self = StObject.set(x, "cryptoCredentialsDetails", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDatefirst(value: Double): Self = StObject.set(x, "datefirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatefirstUndefined: Self = StObject.set(x, "datefirst", js.undefined)
    
    @scala.inline
    def setDebug(value: DebugOptions): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setEnableAnsiNull(value: Boolean): Self = StObject.set(x, "enableAnsiNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnsiNullDefault(value: Boolean): Self = StObject.set(x, "enableAnsiNullDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnsiNullDefaultUndefined: Self = StObject.set(x, "enableAnsiNullDefault", js.undefined)
    
    @scala.inline
    def setEnableAnsiNullUndefined: Self = StObject.set(x, "enableAnsiNull", js.undefined)
    
    @scala.inline
    def setEnableAnsiPadding(value: Boolean): Self = StObject.set(x, "enableAnsiPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnsiPaddingUndefined: Self = StObject.set(x, "enableAnsiPadding", js.undefined)
    
    @scala.inline
    def setEnableAnsiWarnings(value: Boolean): Self = StObject.set(x, "enableAnsiWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnsiWarningsUndefined: Self = StObject.set(x, "enableAnsiWarnings", js.undefined)
    
    @scala.inline
    def setEnableArithAbort(value: Boolean): Self = StObject.set(x, "enableArithAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableArithAbortUndefined: Self = StObject.set(x, "enableArithAbort", js.undefined)
    
    @scala.inline
    def setEnableConcatNullYieldsNull(value: Boolean): Self = StObject.set(x, "enableConcatNullYieldsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableConcatNullYieldsNullUndefined: Self = StObject.set(x, "enableConcatNullYieldsNull", js.undefined)
    
    @scala.inline
    def setEnableCursorCloseOnCommit(value: Boolean): Self = StObject.set(x, "enableCursorCloseOnCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCursorCloseOnCommitUndefined: Self = StObject.set(x, "enableCursorCloseOnCommit", js.undefined)
    
    @scala.inline
    def setEnableImplicitTransactions(value: Boolean): Self = StObject.set(x, "enableImplicitTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableImplicitTransactionsUndefined: Self = StObject.set(x, "enableImplicitTransactions", js.undefined)
    
    @scala.inline
    def setEnableNumericRoundabort(value: Boolean): Self = StObject.set(x, "enableNumericRoundabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNumericRoundabortUndefined: Self = StObject.set(x, "enableNumericRoundabort", js.undefined)
    
    @scala.inline
    def setEnableQuotedIdentifier(value: Boolean): Self = StObject.set(x, "enableQuotedIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableQuotedIdentifierUndefined: Self = StObject.set(x, "enableQuotedIdentifier", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
    
    @scala.inline
    def setFallbackToDefaultDb(value: Boolean): Self = StObject.set(x, "fallbackToDefaultDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackToDefaultDbUndefined: Self = StObject.set(x, "fallbackToDefaultDb", js.undefined)
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setIsolationLevel(value: ISOLATION_LEVEL): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationLevelUndefined: Self = StObject.set(x, "isolationLevel", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    @scala.inline
    def setMaxRetriesOnTransientErrors(value: Double): Self = StObject.set(x, "maxRetriesOnTransientErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesOnTransientErrorsUndefined: Self = StObject.set(x, "maxRetriesOnTransientErrors", js.undefined)
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSizeUndefined: Self = StObject.set(x, "packetSize", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setReadOnlyIntent(value: Boolean): Self = StObject.set(x, "readOnlyIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyIntentUndefined: Self = StObject.set(x, "readOnlyIntent", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    @scala.inline
    def setRowCollectionOnDone(value: Boolean): Self = StObject.set(x, "rowCollectionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCollectionOnDoneUndefined: Self = StObject.set(x, "rowCollectionOnDone", js.undefined)
    
    @scala.inline
    def setRowCollectionOnRequestCompletion(value: Boolean): Self = StObject.set(x, "rowCollectionOnRequestCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCollectionOnRequestCompletionUndefined: Self = StObject.set(x, "rowCollectionOnRequestCompletion", js.undefined)
    
    @scala.inline
    def setTdsVersion(value: Double): Self = StObject.set(x, "tdsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdsVersionUndefined: Self = StObject.set(x, "tdsVersion", js.undefined)
    
    @scala.inline
    def setTextsize(value: Double): Self = StObject.set(x, "textsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsizeUndefined: Self = StObject.set(x, "textsize", js.undefined)
    
    @scala.inline
    def setTrustServerCertificate(value: Boolean): Self = StObject.set(x, "trustServerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustServerCertificateUndefined: Self = StObject.set(x, "trustServerCertificate", js.undefined)
    
    @scala.inline
    def setUseColumnNames(value: Boolean): Self = StObject.set(x, "useColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseColumnNamesUndefined: Self = StObject.set(x, "useColumnNames", js.undefined)
    
    @scala.inline
    def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
  }
}
