package typings
package wonderDotJsLib.distEs2015ComponentGeometryGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
@js.native
abstract class Geometry ()
  extends wonderDotJsLib.distEs2015CoreComponentMod.Component {
  var buffers: wonderDotJsLib.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer = js.native
  var drawMode: wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode = js.native
  @JSName("entityObject")
  var entityObject_Geometry: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  val geometryData: wonderDotJsLib.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData = js.native
  var material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material = js.native
  def computeData(): GeometryDataType = js.native
  /* protected */ def createBasicGeometryData(computedData: GeometryDataType): wonderDotJsLib.distEs2015ComponentGeometryDataBasicGeometryDataMod.BasicGeometryData = js.native
  /* protected */ def createBufferContainer(): wonderDotJsLib.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer = js.native
  def createBuffersFromGeometryData(): scala.Unit = js.native
  /* protected */ def createGeometryData(computedData: GeometryDataType): wonderDotJsLib.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData = js.native
}

