package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait StreamTypes extends StObject {
    
    var streamTypes: js.Array[StreamType] = js.native
  }
  object StreamTypes {
    
    @scala.inline
    def apply(streamTypes: js.Array[StreamType]): StreamTypes = {
      val __obj = js.Dynamic.literal(streamTypes = streamTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTypes]
    }
    
    @scala.inline
    implicit class StreamTypesMutableBuilder[Self <: StreamTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStreamTypes(value: js.Array[StreamType]): Self = StObject.set(x, "streamTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamTypesVarargs(value: StreamType*): Self = StObject.set(x, "streamTypes", js.Array(value :_*))
    }
  }
}
