package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015RendererBufferEbufferdatatypeMod.EBufferDataType
import typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType
import typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryDataBufferContainerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/geometry/data/BufferContainer", "BufferContainer")
  @js.native
  open class BufferContainer protected () extends StObject {
    def this(entityObject: GameObject) = this()
    
    /* protected */ var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<Buffer> */ Any = js.native
    
    def createBuffersFromGeometryData(): Unit = js.native
    
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: String, data: js.Array[Double], size: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(bufferAttriName: String, data: js.Array[Double], size: Double, `type`: Unit, offset: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      size: Double,
      `type`: Unit,
      offset: Double,
      usage: EBufferUsage
    ): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      size: Double,
      `type`: Unit,
      offset: Unit,
      usage: EBufferUsage
    ): Unit = js.native
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
    /* protected */ def createOnlyOnceAndUpdateArrayBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      size: Double,
      `type`: EBufferType,
      offset: Unit,
      usage: EBufferUsage
    ): Unit = js.native
    
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double]): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: Unit, offset: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: Unit, offset: Double, usage: EBufferUsage): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: Unit, offset: Unit, usage: EBufferUsage): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: EBufferType): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(bufferAttriName: String, data: js.Array[Double], `type`: EBufferType, offset: Double): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      `type`: EBufferType,
      offset: Double,
      usage: EBufferUsage
    ): Unit = js.native
    /* protected */ def createOnlyOnceAndUpdateElememntBuffer(
      bufferAttriName: String,
      data: js.Array[Double],
      `type`: EBufferType,
      offset: Unit,
      usage: EBufferUsage
    ): Unit = js.native
    
    def dispose(): Unit = js.native
    
    /* protected */ var entityObject: GameObject = js.native
    
    var geometryData: GeometryData = js.native
    
    def getChild(`type`: EBufferDataType): Any = js.native
    def getChild(`type`: EBufferDataType, dataName: String): Any = js.native
    
    /* protected */ def getVertice(`type`: EBufferDataType): Any = js.native
    
    /* protected */ def hasData(): Boolean = js.native
    /* protected */ def hasData(data: js.Array[Double]): Boolean = js.native
    
    def init(): Unit = js.native
    
    def removeCache(name: String): Any = js.native
    def removeCache(`type`: EBufferDataType): Any = js.native
  }
}
