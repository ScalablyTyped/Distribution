package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindAndModifyWriteOpResultObject extends StObject {
  
  /**
    * The raw lastErrorObject returned from the command.
    */
  var lastErrorObject: js.UndefOr[js.Any] = js.native
  
  /**
    * Is 1 if the command executed correctly.
    */
  var ok: js.UndefOr[scala.Double] = js.native
  
  /**
    * Document returned from findAndModify command.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object FindAndModifyWriteOpResultObject {
  
  @scala.inline
  def apply(): FindAndModifyWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAndModifyWriteOpResultObject]
  }
  
  @scala.inline
  implicit class FindAndModifyWriteOpResultObjectMutableBuilder[Self <: FindAndModifyWriteOpResultObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastErrorObject(value: js.Any): Self = StObject.set(x, "lastErrorObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorObjectUndefined: Self = StObject.set(x, "lastErrorObject", js.undefined)
    
    @scala.inline
    def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
