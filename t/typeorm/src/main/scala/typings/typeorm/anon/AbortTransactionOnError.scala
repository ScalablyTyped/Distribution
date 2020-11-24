package typings.typeorm.anon

import typings.typeorm.typeormStrings.READ_COMMITTED
import typings.typeorm.typeormStrings.READ_UNCOMMITTED
import typings.typeorm.typeormStrings.REPEATABLE_READ
import typings.typeorm.typeormStrings.SERIALIZABLE
import typings.typeorm.typeormStrings.SNAPSHOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortTransactionOnError extends js.Object {
  
  /**
    * A boolean determining whether to rollback a transaction automatically if any error is encountered during
    * the given transaction's execution. This sets the value for SET XACT_ABORT during the initial SQL phase
    * of a connection (documentation).
    */
  val abortTransactionOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, controlling whether the column names returned will have the first letter converted to lower case
    * (true) or not. This value is ignored if you provide a columnNameReplacer. (default: false).
    */
  val camelCaseColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds before the cancel (abort) of a request is considered failed (default: 5000).
    */
  val cancelTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds before the attempt to connect is considered failed (default: 15000).
    */
  val connectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The default isolation level for new connections. All out-of-transaction queries are executed with this
    * setting. The isolation levels are available from require('tedious').ISOLATION_LEVEL .
    */
  val connectionIsolationLevel: js.UndefOr[READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT] = js.native
  
  /**
    * When encryption is used, an object may be supplied that will be used for the first argument when calling
    * tls.createSecurePair (default: {}).
    */
  val cryptoCredentialsDetails: js.UndefOr[js.Any] = js.native
  
  /**
    * Debug options
    */
  val debug: js.UndefOr[Data] = js.native
  
  /**
    * A boolean, controlling whatever to disable RETURNING / OUTPUT statements.
    */
  val disableOutputReturning: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, SET ANSI_NULL_DFLT_ON ON will be set in the initial sql. This means new columns will be nullable by
    * default. See the T-SQL documentation for more details. (Default: true).
    */
  val enableAnsiNullDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, that when true will abort a query when an overflow or divide-by-zero error occurs during query execution.
    */
  val enableArithAbort: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean determining whether or not the connection will be encrypted. Set to true if you're on
    * Windows Azure. (default: false).
    */
  val encrypt: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, if the database requestion by options.database cannot be accessed, the connection will fail with
    * an error. However, if options.fallbackToDefaultDb is set to true, then the user's default database will
    * be used instead (Default: false).
    */
  val fallbackToDefaultDb: js.UndefOr[Boolean] = js.native
  
  /**
    * The default isolation level that transactions will be run with. The isolation levels are available
    * from require('tedious').ISOLATION_LEVEL. (default: READ_COMMITTED).
    */
  val isolation: js.UndefOr[READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT] = js.native
  
  /**
    * A string indicating which network interface (ip address) to use when connecting to SQL Server.
    */
  val localAddress: js.UndefOr[String] = js.native
  
  /**
    * The size of TDS packets (subject to negotiation with the server). Should be a power of 2. (default: 4096).
    */
  val packetSize: js.UndefOr[Double] = js.native
  
  /**
    * A boolean, determining whether the connection will request read only access from a SQL Server
    * Availability Group. For more information, see here. (default: false).
    */
  val readOnlyIntent: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, that when true will expose received rows in Requests' done* events. See done, doneInProc and
    * doneProc. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  val rowCollectionOnDone: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean, that when true will expose received rows in Requests' completion callback. See new Request. (default: false)
    * Caution: If many row are received, enabling this option could result in excessive memory usage.
    */
  val rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of TDS to use. If server doesn't support specified version, negotiated version is used instead.
    * The versions are available from require('tedious').TDS_VERSION. (default: 7_4).
    */
  val tdsVersion: js.UndefOr[String] = js.native
  
  /**
    * A boolean determining whether to return rows as arrays or key-value collections. (default: false).
    */
  val useColumnNames: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean determining whether to pass time values in UTC or local time. (default: true).
    */
  val useUTC: js.UndefOr[Boolean] = js.native
}
object AbortTransactionOnError {
  
  @scala.inline
  def apply(): AbortTransactionOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortTransactionOnError]
  }
  
  @scala.inline
  implicit class AbortTransactionOnErrorOps[Self <: AbortTransactionOnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortTransactionOnError(value: Boolean): Self = this.set("abortTransactionOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortTransactionOnError: Self = this.set("abortTransactionOnError", js.undefined)
    
    @scala.inline
    def setCamelCaseColumns(value: Boolean): Self = this.set("camelCaseColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamelCaseColumns: Self = this.set("camelCaseColumns", js.undefined)
    
    @scala.inline
    def setCancelTimeout(value: Double): Self = this.set("cancelTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTimeout: Self = this.set("cancelTimeout", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectionIsolationLevel(value: READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT): Self = this.set("connectionIsolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionIsolationLevel: Self = this.set("connectionIsolationLevel", js.undefined)
    
    @scala.inline
    def setCryptoCredentialsDetails(value: js.Any): Self = this.set("cryptoCredentialsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoCredentialsDetails: Self = this.set("cryptoCredentialsDetails", js.undefined)
    
    @scala.inline
    def setDebug(value: Data): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDisableOutputReturning(value: Boolean): Self = this.set("disableOutputReturning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOutputReturning: Self = this.set("disableOutputReturning", js.undefined)
    
    @scala.inline
    def setEnableAnsiNullDefault(value: Boolean): Self = this.set("enableAnsiNullDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnsiNullDefault: Self = this.set("enableAnsiNullDefault", js.undefined)
    
    @scala.inline
    def setEnableArithAbort(value: Boolean): Self = this.set("enableArithAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableArithAbort: Self = this.set("enableArithAbort", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setFallbackToDefaultDb(value: Boolean): Self = this.set("fallbackToDefaultDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackToDefaultDb: Self = this.set("fallbackToDefaultDb", js.undefined)
    
    @scala.inline
    def setIsolation(value: READ_UNCOMMITTED | READ_COMMITTED | REPEATABLE_READ | SERIALIZABLE | SNAPSHOT): Self = this.set("isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolation: Self = this.set("isolation", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketSize: Self = this.set("packetSize", js.undefined)
    
    @scala.inline
    def setReadOnlyIntent(value: Boolean): Self = this.set("readOnlyIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyIntent: Self = this.set("readOnlyIntent", js.undefined)
    
    @scala.inline
    def setRowCollectionOnDone(value: Boolean): Self = this.set("rowCollectionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCollectionOnDone: Self = this.set("rowCollectionOnDone", js.undefined)
    
    @scala.inline
    def setRowCollectionOnRequestCompletion(value: Boolean): Self = this.set("rowCollectionOnRequestCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCollectionOnRequestCompletion: Self = this.set("rowCollectionOnRequestCompletion", js.undefined)
    
    @scala.inline
    def setTdsVersion(value: String): Self = this.set("tdsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdsVersion: Self = this.set("tdsVersion", js.undefined)
    
    @scala.inline
    def setUseColumnNames(value: Boolean): Self = this.set("useColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseColumnNames: Self = this.set("useColumnNames", js.undefined)
    
    @scala.inline
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUTC: Self = this.set("useUTC", js.undefined)
  }
}
