package typings.vegaLite.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends StObject {
  
  var update: StringDictionary[Signal] = js.native
}
object Update {
  
  @scala.inline
  def apply(update: StringDictionary[Signal]): Update = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: StringDictionary[Signal]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
