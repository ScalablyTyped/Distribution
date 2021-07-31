package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typeorm.typeorm/driver/mongodb/typings.ReplaceOneOptions & {  multi :boolean | undefined} */
trait ReplaceOneOptionsmultiboo extends StObject {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Update operation is an upsert.
    */
  var upsert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}
object ReplaceOneOptionsmultiboo {
  
  @scala.inline
  def apply(): ReplaceOneOptionsmultiboo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOneOptionsmultiboo]
  }
  
  @scala.inline
  implicit class ReplaceOneOptionsmultibooMutableBuilder[Self <: ReplaceOneOptionsmultiboo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    @scala.inline
    def setW(value: Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
