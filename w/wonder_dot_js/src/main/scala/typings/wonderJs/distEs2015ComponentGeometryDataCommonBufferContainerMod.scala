package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryDataBasicGeometryDataMod.BasicGeometryData
import typings.wonderJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryDataCommonBufferContainerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/geometry/data/CommonBufferContainer", "CommonBufferContainer")
  @js.native
  open class CommonBufferContainer protected () extends BufferContainer {
    def this(entityObject: GameObject) = this()
    
    @JSName("geometryData")
    var geometryData_CommonBufferContainer: BasicGeometryData = js.native
  }
}
