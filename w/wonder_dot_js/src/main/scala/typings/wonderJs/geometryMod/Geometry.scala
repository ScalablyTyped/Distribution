package typings.wonderJs.geometryMod

import typings.wonderJs.basicGeometryDataMod.BasicGeometryData
import typings.wonderJs.bufferContainerMod.BufferContainer
import typings.wonderJs.componentMod.Component
import typings.wonderJs.edrawmodeMod.EDrawMode
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryDataMod.GeometryData
import typings.wonderJs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
@js.native
abstract class Geometry () extends Component {
  var buffers: BufferContainer = js.native
  var drawMode: EDrawMode = js.native
  @JSName("entityObject")
  var entityObject_Geometry: GameObject = js.native
  val geometryData: GeometryData = js.native
  var material: Material = js.native
  def computeData(): GeometryDataType = js.native
  /* protected */ def createBasicGeometryData(computedData: GeometryDataType): BasicGeometryData = js.native
  /* protected */ def createBufferContainer(): BufferContainer = js.native
  def createBuffersFromGeometryData(): Unit = js.native
  /* protected */ def createGeometryData(computedData: GeometryDataType): GeometryData = js.native
}

