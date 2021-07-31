package typings.wonderJs

import typings.wonderJs.basicGeometryDataMod.BasicGeometryData
import typings.wonderJs.bufferContainerMod.BufferContainer
import typings.wonderJs.gameObjectMod.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonBufferContainerMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/data/CommonBufferContainer", "CommonBufferContainer")
  @js.native
  abstract class CommonBufferContainer protected () extends BufferContainer {
    def this(entityObject: GameObject) = this()
    
    @JSName("geometryData")
    var geometryData_CommonBufferContainer: BasicGeometryData = js.native
  }
}
