package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionInsertManyOptions extends StObject {
  
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
object CollectionInsertManyOptions {
  
  inline def apply(): CollectionInsertManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionInsertManyOptions]
  }
  
  extension [Self <: CollectionInsertManyOptions](x: Self) {
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    inline def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
