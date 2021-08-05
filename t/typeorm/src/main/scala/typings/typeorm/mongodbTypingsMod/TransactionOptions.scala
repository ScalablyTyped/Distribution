package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
