package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManyOptions extends StObject {
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Update operation is an upsert.
    */
  var upsert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object UpdateManyOptions {
  
  @scala.inline
  def apply(): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManyOptions]
  }
  
  @scala.inline
  implicit class UpdateManyOptionsMutableBuilder[Self <: UpdateManyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    @scala.inline
    def setW(value: js.Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
