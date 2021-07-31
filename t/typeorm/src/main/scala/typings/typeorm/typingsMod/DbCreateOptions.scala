package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCreateOptions extends StObject {
  
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Force server to assign _id values instead of driver.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current value of the parameter native_parser.
    */
  var native_parser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A primary key factory object for generation of custom _id keys.
    */
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A Promise library class the application wishes to use such as Bluebird, must be ES6 compatible.
    */
  var promiseLibrary: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a read concern for the collection. (only MongoDB 3.2 or higher supported).
    */
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object DbCreateOptions {
  
  @scala.inline
  def apply(): DbCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCreateOptions]
  }
  
  @scala.inline
  implicit class DbCreateOptionsMutableBuilder[Self <: DbCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
    
    @scala.inline
    def setBufferMaxEntries(value: scala.Double): Self = StObject.set(x, "bufferMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferMaxEntriesUndefined: Self = StObject.set(x, "bufferMaxEntries", js.undefined)
    
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setNative_parser(value: Boolean): Self = StObject.set(x, "native_parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative_parserUndefined: Self = StObject.set(x, "native_parser", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    @scala.inline
    def setPromiseLibrary(value: js.Object): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
    
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
