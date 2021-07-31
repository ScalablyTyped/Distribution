package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var readPreference: typings.typeorm.mongodbTypingsMod.ReadPreference | String
}
object `6` {
  
  @scala.inline
  def apply(readPreference: typings.typeorm.mongodbTypingsMod.ReadPreference | String): `6` = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
  }
}
