package typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod

import typings.wonderDotJs.distEs2015ComponentGeometryDataBasicGeometryDataMod.BasicGeometryData
import typings.wonderDotJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typings.wonderDotJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typings.wonderDotJs.distEs2015CoreComponentMod.Component
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode
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

