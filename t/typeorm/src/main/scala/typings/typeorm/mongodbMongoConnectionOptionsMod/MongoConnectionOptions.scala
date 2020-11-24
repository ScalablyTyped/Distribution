package typings.typeorm.mongodbMongoConnectionOptionsMod

import typings.node.Buffer
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.mongodbTypingsMod.ReadPreference
import typings.typeorm.typeormStrings.debug
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.mongodb
import typings.typeorm.typeormStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * Sets the range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms).
    * Default: 15
    */
  val acceptableLatencyMS: js.UndefOr[Double] = js.native
  
  /**
    * The name of the application that created this MongoClient instance. MongoDB 3.4 and newer will print this value in the server log upon establishing each connection. It is also recorded in the slow query log and profile collections
    */
  val appname: js.UndefOr[String] = js.native
  
  /**
    * Sets the authentication mechanism that MongoDB will use to authenticate the connection
    */
  val authMechanism: js.UndefOr[String] = js.native
  
  /**
    * If the database authentication is dependent on another databaseName.
    */
  val authSource: js.UndefOr[String] = js.native
  
  /**
    * Automatic Client-Side Field Level Encryption configuration.
    */
  val autoEncryption: js.UndefOr[js.Any] = js.native
  
  /**
    * Reconnect on error. Default: true
    */
  val autoReconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable auto reconnecting for single server instances. Default: true
    */
  val auto_reconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a working connection,
    * default is -1 which is unlimited.
    */
  val bufferMaxEntries: js.UndefOr[Double] = js.native
  
  /**
    * Ensure we check server identify during SSL, set to false to disable checking. Only works for Node 0.12.x or higher. You can pass in a boolean or your own checkServerIdentity override function
    * Default: true
    */
  val checkServerIdentity: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Type of compression to use: snappy or zlib
    */
  val compression: js.UndefOr[js.Any] = js.native
  
  /**
    * TCP Connection timeout setting. Default: 30000
    */
  val connectTimeoutMS: js.UndefOr[Double] = js.native
  
  /**
    * Sets if the driver should connect even if no primary is available. Default: false
    */
  val connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Database name to connect to.
    */
  val database: js.UndefOr[String] = js.native
  
  /**
    * Enable the wrapping of the callback in the current domain, disabled by default to avoid perf hit. Default: false
    */
  val domainsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Version of IP stack. Can be 4, 6.
    * If undefined, will attempt to connect with IPv6, and will fall back to IPv4 on failure
    */
  val family: js.UndefOr[Double] = js.native
  
  /**
    * Force server to assign _id values instead of driver. Default: false
    */
  val forceServerObjectId: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a file sync write concern. Default: false
    */
  val fsync: js.UndefOr[Boolean] = js.native
  
  /**
    * Control if high availability monitoring runs for Replicaset or Mongos proxies. Default true
    */
  val ha: js.UndefOr[Boolean] = js.native
  
  /**
    * The High availability period for replicaset inquiry. Default: 10000
    */
  val haInterval: js.UndefOr[Double] = js.native
  
  /**
    * Database host.
    */
  val host: js.UndefOr[String] = js.native
  
  /**
    * Specify if the BSON serializer should ignore undefined fields. Default: false
    */
  val ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a journal write concern. Default: false
    */
  val j: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds to wait before initiating keepAlive on the TCP socket. Default: 30000
    */
  val keepAlive: js.UndefOr[Double] = js.native
  
  /**
    * Specify the log level used by the driver logger (error/warn/info/debug).
    */
  val loggerLevel: js.UndefOr[error | warn | info | debug] = js.native
  
  /**
    * Specify a maxStalenessSeconds value for secondary reads, minimum is 90 seconds
    */
  val maxStalenessSeconds: js.UndefOr[Double] = js.native
  
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  val minSize: js.UndefOr[Double] = js.native
  
  /**
    * Enable command monitoring for this client. Default: false
    */
  val monitorCommands: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Socket NoDelay option. Default: true
    */
  val noDelay: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of retries for a tailable cursor. Default: 5
    */
  val numberOfRetries: js.UndefOr[Double] = js.native
  
  /**
    * Database password.
    */
  val password: js.UndefOr[String] = js.native
  
  /**
    * A primary key factory object for generation of custom _id keys.
    */
  val pkFactory: js.UndefOr[js.Any] = js.native
  
  /**
    * Set the maximum poolSize for each individual server or proxy connection.
    */
  val poolSize: js.UndefOr[Double] = js.native
  
  /**
    * Database host port.
    */
  val port: js.UndefOr[Double] = js.native
  
  /**
    * A Promise library class the application wishes to use such as Bluebird, must be ES6 compatible.
    */
  val promiseLibrary: js.UndefOr[js.Any] = js.native
  
  /**
    * Promotes Binary BSON values to native Node Buffers. Default: false
    */
  val promoteBuffers: js.UndefOr[Boolean] = js.native
  
  /**
    * Promotes Long values to number if they fit inside the 53 bits resolution. Default: true
    */
  val promoteLongs: js.UndefOr[Boolean] = js.native
  
  /**
    * Promotes BSON values to native types where possible, set to false to only receive wrapper types. Default: true
    */
  val promoteValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Return document results as raw BSON buffers. Default: false
    */
  val raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a read concern for the collection. (only MongoDB 3.2 or higher supported).
    */
  val readConcern: js.UndefOr[js.Any] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY,
    * ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  val readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Read preference tags
    */
  val readPreferenceTags: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Server will wait #milliseconds between retries. Default 1000
    */
  val reconnectInterval: js.UndefOr[Double] = js.native
  
  /**
    * Server attempt to reconnect #times. Default 30
    */
  val reconnectTries: js.UndefOr[Double] = js.native
  
  /**
    * The name of the replicaset to connect to
    */
  val replicaSet: js.UndefOr[String] = js.native
  
  /**
    * Sets the range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms).
    * Default: 15
    */
  val secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.native
  
  /**
    * Serialize functions on any object. Default: false
    */
  val serializeFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Socket timeout setting. Default: 360000
    */
  val socketTimeoutMS: js.UndefOr[Double] = js.native
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support). Default: false
    */
  val ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of valid certificates either as Buffers or Strings
    * (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  val sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  /**
    * SSL Certificate revocation list binary buffer
    * (needs to have a mongod server with ssl support, 2.4 or higher)
    */
  val sslCRL: js.UndefOr[String | Buffer] = js.native
  
  /**
    * String or buffer containing the certificate we wish to present
    * (needs to have a mongod server with ssl support, 2.4 or higher)
    */
  val sslCert: js.UndefOr[String | Buffer] = js.native
  
  /**
    * String or buffer containing the certificate private key we wish to present
    * (needs to have a mongod server with ssl support, 2.4 or higher)
    */
  val sslKey: js.UndefOr[String] = js.native
  
  /**
    * String or buffer containing the certificate password
    * (needs to have a mongod server with ssl support, 2.4 or higher)
    */
  val sslPass: js.UndefOr[String | Buffer] = js.native
  
  /**
    * Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher).
    * Default: true
    */
  val sslValidate: js.UndefOr[Boolean] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_MongoConnectionOptions: mongodb = js.native
  
  /**
    * Connection url where perform connection to.
    */
  val url: js.UndefOr[String] = js.native
  
  /**
    * Determines whether or not to use the new url parser. Default: false
    */
  val useNewUrlParser: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether or not to use the new Server Discovery and Monitoring engine. Default: false
    * https://github.com/mongodb/node-mongodb-native/releases/tag/v3.2.1
    */
  val useUnifiedTopology: js.UndefOr[Boolean] = js.native
  
  /**
    * Database username.
    */
  val username: js.UndefOr[String] = js.native
  
  /**
    * Validate MongoClient passed in options for correctness. Default: false
    */
  val validateOptions: js.UndefOr[Boolean | js.Any] = js.native
  
  /**
    * The write concern.
    */
  val w: js.UndefOr[String | Double] = js.native
  
  /**
    * The write concern timeout value.
    */
  val wtimeout: js.UndefOr[Double] = js.native
}
object MongoConnectionOptions {
  
  @scala.inline
  def apply(`type`: mongodb): MongoConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoConnectionOptions]
  }
  
  @scala.inline
  implicit class MongoConnectionOptionsOps[Self <: MongoConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: mongodb): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptableLatencyMS(value: Double): Self = this.set("acceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptableLatencyMS: Self = this.set("acceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setAppname(value: String): Self = this.set("appname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppname: Self = this.set("appname", js.undefined)
    
    @scala.inline
    def setAuthMechanism(value: String): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMechanism: Self = this.set("authMechanism", js.undefined)
    
    @scala.inline
    def setAuthSource(value: String): Self = this.set("authSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSource: Self = this.set("authSource", js.undefined)
    
    @scala.inline
    def setAutoEncryption(value: js.Any): Self = this.set("autoEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEncryption: Self = this.set("autoEncryption", js.undefined)
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    
    @scala.inline
    def setAuto_reconnect(value: Boolean): Self = this.set("auto_reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_reconnect: Self = this.set("auto_reconnect", js.undefined)
    
    @scala.inline
    def setBufferMaxEntries(value: Double): Self = this.set("bufferMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferMaxEntries: Self = this.set("bufferMaxEntries", js.undefined)
    
    @scala.inline
    def setCheckServerIdentity(value: Boolean | js.Function): Self = this.set("checkServerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    
    @scala.inline
    def setCompression(value: js.Any): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setConnectTimeoutMS(value: Double): Self = this.set("connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeoutMS: Self = this.set("connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setConnectWithNoPrimary(value: Boolean): Self = this.set("connectWithNoPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectWithNoPrimary: Self = this.set("connectWithNoPrimary", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setDomainsEnabled(value: Boolean): Self = this.set("domainsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainsEnabled: Self = this.set("domainsEnabled", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = this.set("forceServerObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceServerObjectId: Self = this.set("forceServerObjectId", js.undefined)
    
    @scala.inline
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsync: Self = this.set("fsync", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = this.set("ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHa: Self = this.set("ha", js.undefined)
    
    @scala.inline
    def setHaInterval(value: Double): Self = this.set("haInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaInterval: Self = this.set("haInterval", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setLoggerLevel(value: error | warn | info | debug): Self = this.set("loggerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggerLevel: Self = this.set("loggerLevel", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMonitorCommands(value: Boolean): Self = this.set("monitorCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorCommands: Self = this.set("monitorCommands", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    
    @scala.inline
    def setNumberOfRetries(value: Double): Self = this.set("numberOfRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRetries: Self = this.set("numberOfRetries", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Any): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPromiseLibrary(value: js.Any): Self = this.set("promiseLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromiseLibrary: Self = this.set("promiseLibrary", js.undefined)
    
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: js.Any): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setReadPreferenceTagsVarargs(value: js.Any*): Self = this.set("readPreferenceTags", js.Array(value :_*))
    
    @scala.inline
    def setReadPreferenceTags(value: js.Array[_]): Self = this.set("readPreferenceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreferenceTags: Self = this.set("readPreferenceTags", js.undefined)
    
    @scala.inline
    def setReconnectInterval(value: Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    
    @scala.inline
    def setReconnectTries(value: Double): Self = this.set("reconnectTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTries: Self = this.set("reconnectTries", js.undefined)
    
    @scala.inline
    def setReplicaSet(value: String): Self = this.set("replicaSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaSet: Self = this.set("replicaSet", js.undefined)
    
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: Double): Self = this.set("secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAcceptableLatencyMS: Self = this.set("secondaryAcceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    
    @scala.inline
    def setSocketTimeoutMS(value: Double): Self = this.set("socketTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeoutMS: Self = this.set("socketTimeoutMS", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = this.set("sslCA", js.Array(value :_*))
    
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = this.set("sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCA: Self = this.set("sslCA", js.undefined)
    
    @scala.inline
    def setSslCRL(value: String | Buffer): Self = this.set("sslCRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCRL: Self = this.set("sslCRL", js.undefined)
    
    @scala.inline
    def setSslCert(value: String | Buffer): Self = this.set("sslCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCert: Self = this.set("sslCert", js.undefined)
    
    @scala.inline
    def setSslKey(value: String): Self = this.set("sslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslKey: Self = this.set("sslKey", js.undefined)
    
    @scala.inline
    def setSslPass(value: String | Buffer): Self = this.set("sslPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPass: Self = this.set("sslPass", js.undefined)
    
    @scala.inline
    def setSslValidate(value: Boolean): Self = this.set("sslValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslValidate: Self = this.set("sslValidate", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseNewUrlParser(value: Boolean): Self = this.set("useNewUrlParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewUrlParser: Self = this.set("useNewUrlParser", js.undefined)
    
    @scala.inline
    def setUseUnifiedTopology(value: Boolean): Self = this.set("useUnifiedTopology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUnifiedTopology: Self = this.set("useUnifiedTopology", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setValidateOptions(value: Boolean | js.Any): Self = this.set("validateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOptions: Self = this.set("validateOptions", js.undefined)
    
    @scala.inline
    def setW(value: String | Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
}
