package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionCreateOptions extends StObject {
  
  /**
    * Create an index on the _id field of the document, True by default on MongoDB 2.2 or higher off for version < 2.2.
    */
  var autoIndexId: js.UndefOr[Boolean] = js.native
  
  /**
    * Create a capped collection.
    */
  var capped: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of documents in the capped collection.
    */
  var max: js.UndefOr[scala.Double] = js.native
  
  /**
    * A primary key factory object for generation of custom _id keys.
    */
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the capped collection in bytes.
    */
  var size: js.UndefOr[scala.Double] = js.native
  
  /**
    * Returns an error if the collection does not exist.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object CollectionCreateOptions {
  
  @scala.inline
  def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
  
  @scala.inline
  implicit class CollectionCreateOptionsMutableBuilder[Self <: CollectionCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIndexId(value: Boolean): Self = StObject.set(x, "autoIndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndexIdUndefined: Self = StObject.set(x, "autoIndexId", js.undefined)
    
    @scala.inline
    def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCappedUndefined: Self = StObject.set(x, "capped", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    @scala.inline
    def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
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
