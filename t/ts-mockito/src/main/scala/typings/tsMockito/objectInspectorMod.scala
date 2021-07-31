package typings.tsMockito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectInspectorMod {
  
  @JSImport("ts-mockito/lib/utils/ObjectInspector", "ObjectInspector")
  @js.native
  class ObjectInspector () extends StObject {
    
    def getObjectOwnPropertyNames(`object`: js.Any): js.Array[String] = js.native
    
    def getObjectPrototypes(prototype: js.Any): js.Array[js.Any] = js.native
  }
}
