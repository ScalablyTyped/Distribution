package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadConcern extends StObject {
  
  var level: js.UndefOr[ReadConcernLevel] = js.undefined
}
object ReadConcern {
  
  @scala.inline
  def apply(): ReadConcern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadConcern]
  }
  
  @scala.inline
  implicit class ReadConcernMutableBuilder[Self <: ReadConcern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
