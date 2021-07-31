package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
