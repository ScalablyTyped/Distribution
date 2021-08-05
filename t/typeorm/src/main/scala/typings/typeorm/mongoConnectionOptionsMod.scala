package typings.typeorm

import typings.node.Buffer
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.debug
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.mongodb
import typings.typeorm.typeormStrings.warn
import typings.typeorm.typingsMod.ReadPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoConnectionOptionsMod {
  
  trait MongoConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Sets the range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms).
      * Default: 15
      */
    val acceptableLatencyMS: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the application that created this MongoClient instance. MongoDB 3.4 and newer will print this value in the server log upon establishing each connection. It is also recorded in the slow query log and profile collections
      */
    val appname: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the authentication mechanism that MongoDB will use to authenticate the connection
      */
    val authMechanism: js.UndefOr[String] = js.undefined
    
    /**
      * If the database authentication is dependent on another databaseName.
      */
    val authSource: js.UndefOr[String] = js.undefined
    
    /**
      * Automatic Client-Side Field Level Encryption configuration.
      */
    val autoEncryption: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Reconnect on error. Default: true
      */
    val autoReconnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable auto reconnecting for single server instances. Default: true
      */
    val auto_reconnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets a cap on how many operations the driver will buffer up before giving up on getting a working connection,
      * default is -1 which is unlimited.
      */
    val bufferMaxEntries: js.UndefOr[Double] = js.undefined
    
    /**
      * Ensure we check server identify during SSL, set to false to disable checking. Only works for Node 0.12.x or higher. You can pass in a boolean or your own checkServerIdentity override function
      * Default: true
      */
    val checkServerIdentity: js.UndefOr[Boolean | js.Function] = js.undefined
    
    /**
      * Type of compression to use: snappy or zlib
      */
    val compression: js.UndefOr[js.Any] = js.undefined
    
    /**
      * TCP Connection timeout setting. Default: 30000
      */
    val connectTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets if the driver should connect even if no primary is available. Default: false
      */
    val connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database name to connect to.
      */
    val database: js.UndefOr[String] = js.undefined
    
    /**
      * Enable the wrapping of the callback in the current domain, disabled by default to avoid perf hit. Default: false
      */
    val domainsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Version of IP stack. Can be 4, 6.
      * If undefined, will attempt to connect with IPv6, and will fall back to IPv4 on failure
      */
    val family: js.UndefOr[Double] = js.undefined
    
    /**
      * Force server to assign _id values instead of driver. Default: false
      */
    val forceServerObjectId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a file sync write concern. Default: false
      */
    val fsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Control if high availability monitoring runs for Replicaset or Mongos proxies. Default true
      */
    val ha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The High availability period for replicaset inquiry. Default: 10000
      */
    val haInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Database host.
      */
    val host: js.UndefOr[String] = js.undefined
    
    /**
      * Specify if the BSON serializer should ignore undefined fields. Default: false
      */
    val ignoreUndefined: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a journal write concern. Default: false
      */
    val j: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds to wait before initiating keepAlive on the TCP socket. Default: 30000
      */
    val keepAlive: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the log level used by the driver logger (error/warn/info/debug).
      */
    val loggerLevel: js.UndefOr[error | warn | info | debug] = js.undefined
    
    /**
      * Specify a maxStalenessSeconds value for secondary reads, minimum is 90 seconds
      */
    val maxStalenessSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
      */
    val minSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable command monitoring for this client. Default: false
      */
    val monitorCommands: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TCP Socket NoDelay option. Default: true
      */
    val noDelay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of retries for a tailable cursor. Default: 5
      */
    val numberOfRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Database password.
      */
    val password: js.UndefOr[String] = js.undefined
    
    /**
      * A primary key factory object for generation of custom _id keys.
      */
    val pkFactory: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Set the maximum poolSize for each individual server or proxy connection.
      */
    val poolSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Database host port.
      */
    val port: js.UndefOr[Double] = js.undefined
    
    /**
      * A Promise library class the application wishes to use such as Bluebird, must be ES6 compatible.
      */
    val promiseLibrary: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Promotes Binary BSON values to native Node Buffers. Default: false
      */
    val promoteBuffers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Promotes Long values to number if they fit inside the 53 bits resolution. Default: true
      */
    val promoteLongs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Promotes BSON values to native types where possible, set to false to only receive wrapper types. Default: true
      */
    val promoteValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return document results as raw BSON buffers. Default: false
      */
    val raw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a read concern for the collection. (only MongoDB 3.2 or higher supported).
      */
    val readConcern: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY,
      * ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
      */
    val readPreference: js.UndefOr[ReadPreference | String] = js.undefined
    
    /**
      * Read preference tags
      */
    val readPreferenceTags: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Server will wait #milliseconds between retries. Default 1000
      */
    val reconnectInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Server attempt to reconnect #times. Default 30
      */
    val reconnectTries: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the replicaset to connect to
      */
    val replicaSet: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms).
      * Default: 15
      */
    val secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.undefined
    
    /**
      * Serialize functions on any object. Default: false
      */
    val serializeFunctions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TCP Socket timeout setting. Default: 360000
      */
    val socketTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /**
      * Use ssl connection (needs to have a mongod server with ssl support). Default: false
      */
    val ssl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of valid certificates either as Buffers or Strings
      * (needs to have a mongod server with ssl support, 2.4 or higher).
      */
    val sslCA: js.UndefOr[js.Array[Buffer | String]] = js.undefined
    
    /**
      * SSL Certificate revocation list binary buffer
      * (needs to have a mongod server with ssl support, 2.4 or higher)
      */
    val sslCRL: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * String or buffer containing the certificate we wish to present
      * (needs to have a mongod server with ssl support, 2.4 or higher)
      */
    val sslCert: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * String or buffer containing the certificate private key we wish to present
      * (needs to have a mongod server with ssl support, 2.4 or higher)
      */
    val sslKey: js.UndefOr[String] = js.undefined
    
    /**
      * String or buffer containing the certificate password
      * (needs to have a mongod server with ssl support, 2.4 or higher)
      */
    val sslPass: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher).
      * Default: true
      */
    val sslValidate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_MongoConnectionOptions: mongodb
    
    /**
      * Connection url where perform connection to.
      */
    val url: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether or not to use the new url parser. Default: false
      */
    val useNewUrlParser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether or not to use the new Server Discovery and Monitoring engine. Default: false
      * https://github.com/mongodb/node-mongodb-native/releases/tag/v3.2.1
      */
    val useUnifiedTopology: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.undefined
    
    /**
      * Validate MongoClient passed in options for correctness. Default: false
      */
    val validateOptions: js.UndefOr[Boolean | js.Any] = js.undefined
    
    /**
      * The write concern.
      */
    val w: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The write concern timeout value.
      */
    val wtimeout: js.UndefOr[Double] = js.undefined
  }
  object MongoConnectionOptions {
    
    inline def apply(): MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mongodb")
      __obj.asInstanceOf[MongoConnectionOptions]
    }
    
    extension [Self <: MongoConnectionOptions](x: Self) {
      
      inline def setAcceptableLatencyMS(value: Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
      
      inline def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
      
      inline def setAppname(value: String): Self = StObject.set(x, "appname", value.asInstanceOf[js.Any])
      
      inline def setAppnameUndefined: Self = StObject.set(x, "appname", js.undefined)
      
      inline def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      inline def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      inline def setAutoEncryption(value: js.Any): Self = StObject.set(x, "autoEncryption", value.asInstanceOf[js.Any])
      
      inline def setAutoEncryptionUndefined: Self = StObject.set(x, "autoEncryption", js.undefined)
      
      inline def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
      
      inline def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
      
      inline def setAuto_reconnect(value: Boolean): Self = StObject.set(x, "auto_reconnect", value.asInstanceOf[js.Any])
      
      inline def setAuto_reconnectUndefined: Self = StObject.set(x, "auto_reconnect", js.undefined)
      
      inline def setBufferMaxEntries(value: Double): Self = StObject.set(x, "bufferMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setBufferMaxEntriesUndefined: Self = StObject.set(x, "bufferMaxEntries", js.undefined)
      
      inline def setCheckServerIdentity(value: Boolean | js.Function): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
      
      inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      inline def setCompression(value: js.Any): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setConnectTimeoutMS(value: Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
      
      inline def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
      
      inline def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
      
      inline def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
      
      inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
      
      inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      inline def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
      
      inline def setHaInterval(value: Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
      
      inline def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
      
      inline def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLoggerLevel(value: error | warn | info | debug): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
      
      inline def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
      
      inline def setMaxStalenessSeconds(value: Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
      
      inline def setMonitorCommandsUndefined: Self = StObject.set(x, "monitorCommands", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setNumberOfRetries(value: Double): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
      
      inline def setNumberOfRetriesUndefined: Self = StObject.set(x, "numberOfRetries", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPkFactory(value: js.Any): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
      
      inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPromiseLibrary(value: js.Any): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
      
      inline def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
      
      inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setReadConcern(value: js.Any): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
      
      inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
      
      inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      inline def setReadPreferenceTags(value: js.Array[js.Any]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
      
      inline def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
      
      inline def setReadPreferenceTagsVarargs(value: js.Any*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
      
      inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
      
      inline def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      inline def setReconnectTries(value: Double): Self = StObject.set(x, "reconnectTries", value.asInstanceOf[js.Any])
      
      inline def setReconnectTriesUndefined: Self = StObject.set(x, "reconnectTries", js.undefined)
      
      inline def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      inline def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      inline def setSecondaryAcceptableLatencyMS(value: Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
      
      inline def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
      
      inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
      
      inline def setSocketTimeoutMS(value: Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
      
      inline def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
      
      inline def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
      
      inline def setSslCRL(value: String | Buffer): Self = StObject.set(x, "sslCRL", value.asInstanceOf[js.Any])
      
      inline def setSslCRLUndefined: Self = StObject.set(x, "sslCRL", js.undefined)
      
      inline def setSslCert(value: String | Buffer): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      inline def setSslPass(value: String | Buffer): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
      
      inline def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setSslValidate(value: Boolean): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
      
      inline def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
      
      inline def setType(value: mongodb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
      
      inline def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
      
      inline def setUseUnifiedTopology(value: Boolean): Self = StObject.set(x, "useUnifiedTopology", value.asInstanceOf[js.Any])
      
      inline def setUseUnifiedTopologyUndefined: Self = StObject.set(x, "useUnifiedTopology", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setValidateOptions(value: Boolean | js.Any): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
      
      inline def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
      
      inline def setW(value: String | Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
      
      inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
    }
  }
}
