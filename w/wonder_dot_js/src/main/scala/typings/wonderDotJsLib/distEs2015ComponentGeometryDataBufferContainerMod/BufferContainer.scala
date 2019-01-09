package typings
package wonderDotJsLib.distEs2015ComponentGeometryDataBufferContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/BufferContainer", "BufferContainer")
@js.native
abstract class BufferContainer protected () extends js.Object {
  def this(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject) = this()
  var container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<Buffer> */ js.Any = js.native
  var entityObject: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  var geometryData: wonderDotJsLib.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData = js.native
  def createBuffersFromGeometryData(): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: java.lang.String, data: js.Array[scala.Double], size: scala.Double): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double
  ): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: java.lang.String, data: js.Array[scala.Double]): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double
  ): scala.Unit = js.native
  /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
    bufferAttriName: java.lang.String,
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def getChild(`type`: wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType): js.Any = js.native
  def getChild(
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType,
    dataName: java.lang.String
  ): js.Any = js.native
  /* protected */ def getVertice(`type`: wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType): js.Any = js.native
  /* protected */ def hasData(): scala.Boolean = js.native
  /* protected */ def hasData(data: js.Array[scala.Double]): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def removeCache(name: java.lang.String): js.Any = js.native
  def removeCache(`type`: wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType): js.Any = js.native
}

