package typings.typeorm.anon

import typings.typeorm.typeormStrings.READ_COMMITTED
import typings.typeorm.typeormStrings.READ_UNCOMMITTED
import typings.typeorm.typeormStrings.REPEATABLE_READ
import typings.typeorm.typeormStrings.SERIALIZABLE
import typings.typeorm.typeormStrings.SNAPSHOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortTransactionOnError extends StObject {
  
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered during
    * the given transaction's execution. This sets the value for SET XACT_ABORT during the initial SQL phase
    * of a connection (documentation).
    */
  val abortTransactionOnError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted to lower case
    * (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  val camelCaseColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  val cancelTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  val connectTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this
    * setting. The isolation levels are available from require('tedious').ISOLATION_LEVEL .
    */
  val connectionIsolationLevel: js.UndefOr[READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT] = js.undefined
  
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling
    * tls.createSecurePair (default: {}).
    */
  val cryptoCredentialsDetails: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Debug options
    */
  val debug: js.UndefOr[Data] = js.undefined
  
  /**
    * A boolean, controlling whatever to disable RETURNING / OUTPUT statements.
    */
  val disableOutputReturning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by
    * default. See the T-SQL documentation for more details. (Default: true).
    */
  val enableAnsiNullDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, that when true will abort a query when an overflow or divide-by-zero error occurs during query execution.
    */
  val enableArithAbort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on
    * Windows Azure. (default: false).
    */
  val encrypt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, if the database requestion by options.database cannot be accessed, the connection will fail with
    * an error. However, if options.fallbackToDefaultDb is set to true, then the user's default database will
    * be used instead (Default: false).
    */
  val fallbackToDefaultDb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default isolation level that transactions will be run with. The isolation levels are available
    * from require('tedious').ISOLATION_LEVEL. (default: READ_COMMITTED).
    */
  val isolation: js.UndefOr[READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT] = js.undefined
  
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  val localAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  val packetSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server
    * Availability Group. For more information, see here. (default: false).
    */
  val readOnlyIntent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and
    * doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  val rowCollectionOnDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  val rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead.
    * The versions are available from require('tedious').TDS_VERSION. (default: 7_4).
    */
  val tdsVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  val useColumnNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined
}
object AbortTransactionOnError {
  
  @scala.inline
  def apply(): AbortTransactionOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortTransactionOnError]
  }
  
  @scala.inline
  implicit class AbortTransactionOnErrorMutableBuilder[Self <: AbortTransactionOnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortTransactionOnError(value: Boolean): Self = StObject.set(x, "abortTransactionOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortTransactionOnErrorUndefined: Self = StObject.set(x, "abortTransactionOnError", js.undefined)
    
    @scala.inline
    def setCamelCaseColumns(value: Boolean): Self = StObject.set(x, "camelCaseColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamelCaseColumnsUndefined: Self = StObject.set(x, "camelCaseColumns", js.undefined)
    
    @scala.inline
    def setCancelTimeout(value: Double): Self = StObject.set(x, "cancelTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimeoutUndefined: Self = StObject.set(x, "cancelTimeout", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectionIsolationLevel(value: READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT): Self = StObject.set(x, "connectionIsolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIsolationLevelUndefined: Self = StObject.set(x, "connectionIsolationLevel", js.undefined)
    
    @scala.inline
    def setCryptoCredentialsDetails(value: js.Any): Self = StObject.set(x, "cryptoCredentialsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoCredentialsDetailsUndefined: Self = StObject.set(x, "cryptoCredentialsDetails", js.undefined)
    
    @scala.inline
    def setDebug(value: Data): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDisableOutputReturning(value: Boolean): Self = StObject.set(x, "disableOutputReturning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOutputReturningUndefined: Self = StObject.set(x, "disableOutputReturning", js.undefined)
    
    @scala.inline
    def setEnableAnsiNullDefault(value: Boolean): Self = StObject.set(x, "enableAnsiNullDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnsiNullDefaultUndefined: Self = StObject.set(x, "enableAnsiNullDefault", js.undefined)
    
    @scala.inline
    def setEnableArithAbort(value: Boolean): Self = StObject.set(x, "enableArithAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableArithAbortUndefined: Self = StObject.set(x, "enableArithAbort", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
    
    @scala.inline
    def setFallbackToDefaultDb(value: Boolean): Self = StObject.set(x, "fallbackToDefaultDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackToDefaultDbUndefined: Self = StObject.set(x, "fallbackToDefaultDb", js.undefined)
    
    @scala.inline
    def setIsolation(value: READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSizeUndefined: Self = StObject.set(x, "packetSize", js.undefined)
    
    @scala.inline
    def setReadOnlyIntent(value: Boolean): Self = StObject.set(x, "readOnlyIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyIntentUndefined: Self = StObject.set(x, "readOnlyIntent", js.undefined)
    
    @scala.inline
    def setRowCollectionOnDone(value: Boolean): Self = StObject.set(x, "rowCollectionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCollectionOnDoneUndefined: Self = StObject.set(x, "rowCollectionOnDone", js.undefined)
    
    @scala.inline
    def setRowCollectionOnRequestCompletion(value: Boolean): Self = StObject.set(x, "rowCollectionOnRequestCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCollectionOnRequestCompletionUndefined: Self = StObject.set(x, "rowCollectionOnRequestCompletion", js.undefined)
    
    @scala.inline
    def setTdsVersion(value: String): Self = StObject.set(x, "tdsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdsVersionUndefined: Self = StObject.set(x, "tdsVersion", js.undefined)
    
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
