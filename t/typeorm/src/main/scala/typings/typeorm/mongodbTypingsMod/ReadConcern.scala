package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadConcern extends StObject {
  
  var level: js.UndefOr[ReadConcernLevel] = js.undefined
}
object ReadConcern {
  
  inline def apply(): ReadConcern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadConcern]
  }
  
  extension [Self <: ReadConcern](x: Self) {
    
    inline def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
