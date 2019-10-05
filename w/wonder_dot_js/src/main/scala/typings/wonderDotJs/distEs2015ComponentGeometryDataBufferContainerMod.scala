package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType
import typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType
import typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/BufferContainer", JSImport.Namespace)
@js.native
object distEs2015ComponentGeometryDataBufferContainerMod extends js.Object {
  @js.native
  abstract class BufferContainer protected () extends js.Object {
    def this(entityObject: GameObject) = this()
    var container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<Buffer> */ js.Any = js.native
    var entityObject: GameObject = js.native
    var geometryData: GeometryData = js.native
    def createBuffersFromGeometryData(): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: String, data: js.Array[Double], size: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: String, data: js.Array[Double], size: Double, `type`: EBufferType): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: String, data: js.Array[Double], size: Double, `type`: EBufferType, offset: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      size: Double,
      `type`: EBufferType,
      offset: Double,
      usage: EBufferUsage
    ): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double]): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: EBufferType): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: EBufferType, offset: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      `type`: EBufferType,
      offset: Double,
      usage: EBufferUsage
    ): Unit = js.native
    def dispose(): Unit = js.native
    def getChild(`type`: EBufferDataType): js.Any = js.native
    def getChild(`type`: EBufferDataType, dataName: String): js.Any = js.native
    /* protected */ def getVertice(`type`: EBufferDataType): js.Any = js.native
    /* protected */ def hasData(): Boolean = js.native
    /* protected */ def hasData(data: js.Array[Double]): Boolean = js.native
    def init(): Unit = js.native
    def removeCache(name: String): js.Any = js.native
    def removeCache(`type`: EBufferDataType): js.Any = js.native
  }
  
}

