package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexInformationOptions extends StObject {
  
  /**
    * Returns the full raw index information.
    */
  var full: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY,
    * ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY,
    * ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}
object IndexInformationOptions {
  
  @scala.inline
  def apply(): IndexInformationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexInformationOptions]
  }
  
  @scala.inline
  implicit class IndexInformationOptionsMutableBuilder[Self <: IndexInformationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
