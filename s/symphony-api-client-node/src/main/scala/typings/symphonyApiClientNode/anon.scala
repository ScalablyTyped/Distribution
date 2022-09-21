package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait StreamTypes extends StObject {
    
    var streamTypes: js.Array[StreamType]
  }
  object StreamTypes {
    
    inline def apply(streamTypes: js.Array[StreamType]): StreamTypes = {
      val __obj = js.Dynamic.literal(streamTypes = streamTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTypes]
    }
    
    extension [Self <: StreamTypes](x: Self) {
      
      inline def setStreamTypes(value: js.Array[StreamType]): Self = StObject.set(x, "streamTypes", value.asInstanceOf[js.Any])
      
      inline def setStreamTypesVarargs(value: StreamType*): Self = StObject.set(x, "streamTypes", js.Array(value*))
    }
  }
}
