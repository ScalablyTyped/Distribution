package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreference extends StObject {
  
  var readPreference: js.UndefOr[typings.typeorm.typingsMod.ReadPreference | String] = js.undefined
}
object ReadPreference {
  
  @scala.inline
  def apply(): ReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreference]
  }
  
  @scala.inline
  implicit class ReadPreferenceMutableBuilder[Self <: ReadPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.typingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
