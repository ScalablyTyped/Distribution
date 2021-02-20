package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionDeleteOneOptions extends StObject {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimmeout: js.UndefOr[scala.Double] = js.native
}
object CollectionDeleteOneOptions {
  
  @scala.inline
  def apply(): CollectionDeleteOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDeleteOneOptions]
  }
  
  @scala.inline
  implicit class CollectionDeleteOneOptionsMutableBuilder[Self <: CollectionDeleteOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimmeout(value: scala.Double): Self = StObject.set(x, "wtimmeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimmeoutUndefined: Self = StObject.set(x, "wtimmeout", js.undefined)
  }
}
