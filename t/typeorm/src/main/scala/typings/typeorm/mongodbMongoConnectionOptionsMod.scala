package typings.typeorm

import typings.node.Buffer
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.mongodbTypingsMod.ReadPreference
import typings.typeorm.typeormStrings.debug
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.mongodb
import typings.typeorm.typeormStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongodbMongoConnectionOptionsMod {
  
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
    
    @scala.inline
    def apply(): MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mongodb")
      __obj.asInstanceOf[MongoConnectionOptions]
    }
    
    @scala.inline
    implicit class MongoConnectionOptionsMutableBuilder[Self <: MongoConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptableLatencyMS(value: Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
      
      @scala.inline
      def setAppname(value: String): Self = StObject.set(x, "appname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppnameUndefined: Self = StObject.set(x, "appname", js.undefined)
      
      @scala.inline
      def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      @scala.inline
      def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      @scala.inline
      def setAutoEncryption(value: js.Any): Self = StObject.set(x, "autoEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEncryptionUndefined: Self = StObject.set(x, "autoEncryption", js.undefined)
      
      @scala.inline
      def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
      
      @scala.inline
      def setAuto_reconnect(value: Boolean): Self = StObject.set(x, "auto_reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_reconnectUndefined: Self = StObject.set(x, "auto_reconnect", js.undefined)
      
      @scala.inline
      def setBufferMaxEntries(value: Double): Self = StObject.set(x, "bufferMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferMaxEntriesUndefined: Self = StObject.set(x, "bufferMaxEntries", js.undefined)
      
      @scala.inline
      def setCheckServerIdentity(value: Boolean | js.Function): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setCompression(value: js.Any): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setConnectTimeoutMS(value: Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
      
      @scala.inline
      def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
      
      @scala.inline
      def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      @scala.inline
      def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaInterval(value: Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
      
      @scala.inline
      def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setLoggerLevel(value: error | warn | info | debug): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
      
      @scala.inline
      def setMaxStalenessSeconds(value: Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorCommandsUndefined: Self = StObject.set(x, "monitorCommands", js.undefined)
      
      @scala.inline
      def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      @scala.inline
      def setNumberOfRetries(value: Double): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfRetriesUndefined: Self = StObject.set(x, "numberOfRetries", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPkFactory(value: js.Any): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPromiseLibrary(value: js.Any): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
      
      @scala.inline
      def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      @scala.inline
      def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      @scala.inline
      def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setReadConcern(value: js.Any): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
      
      @scala.inline
      def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadPreferenceTags(value: js.Array[js.Any]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
      
      @scala.inline
      def setReadPreferenceTagsVarargs(value: js.Any*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
      
      @scala.inline
      def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
      
      @scala.inline
      def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      @scala.inline
      def setReconnectTries(value: Double): Self = StObject.set(x, "reconnectTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTriesUndefined: Self = StObject.set(x, "reconnectTries", js.undefined)
      
      @scala.inline
      def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      @scala.inline
      def setSecondaryAcceptableLatencyMS(value: Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
      
      @scala.inline
      def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
      
      @scala.inline
      def setSocketTimeoutMS(value: Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
      
      @scala.inline
      def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
      
      @scala.inline
      def setSslCRL(value: String | Buffer): Self = StObject.set(x, "sslCRL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCRLUndefined: Self = StObject.set(x, "sslCRL", js.undefined)
      
      @scala.inline
      def setSslCert(value: String | Buffer): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      @scala.inline
      def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      @scala.inline
      def setSslPass(value: String | Buffer): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setSslValidate(value: Boolean): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
      
      @scala.inline
      def setType(value: mongodb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
      
      @scala.inline
      def setUseUnifiedTopology(value: Boolean): Self = StObject.set(x, "useUnifiedTopology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUnifiedTopologyUndefined: Self = StObject.set(x, "useUnifiedTopology", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setValidateOptions(value: Boolean | js.Any): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
      
      @scala.inline
      def setW(value: String | Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
    }
  }
}
