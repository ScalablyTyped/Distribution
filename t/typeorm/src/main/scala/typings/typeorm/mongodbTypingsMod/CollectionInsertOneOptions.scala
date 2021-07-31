package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionInsertOneOptions extends StObject {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Force server to assign _id values instead of driver.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
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
object CollectionInsertOneOptions {
  
  @scala.inline
  def apply(): CollectionInsertOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionInsertOneOptions]
  }
  
  @scala.inline
  implicit class CollectionInsertOneOptionsMutableBuilder[Self <: CollectionInsertOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
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
