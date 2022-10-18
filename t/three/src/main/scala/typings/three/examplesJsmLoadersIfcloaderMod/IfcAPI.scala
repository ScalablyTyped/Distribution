package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/loaders/IFCLoader", "IfcAPI")
@js.native
open class IfcAPI () extends StObject {
  
  /**
    * Closes a model and frees all related memory
    * @modelID Model handle retrieved by OpenModel, model must not be closed
    */
  def CloseModel(modelID: Double): Unit = js.native
  
  /**
    * Creates a new model and returns a modelID number
    * @data Settings settings for generating data the model
    */
  def CreateModel(): Double = js.native
  def CreateModel(settings: LoaderSettings): Double = js.native
  
  def ExportFileAsIFC(modelID: Double): js.typedarray.Uint8Array = js.native
  
  def FlattenLine(modelID: Double, line: Any): Unit = js.native
  
  def GetAllLines(modelID: Double): Vector[Double] = js.native
  
  /**
    * Load geometry for a single element
    * @modelID Model handle retrieved by OpenModel
    */
  def GetFlatMesh(modelID: Double, expressID: Double): FlatMesh = js.native
  
  /**
    * Opens a model and returns a modelID number
    * @modelID Model handle retrieved by OpenModel, model must not be closed
    * @data Buffer containing IFC data (bytes)
    */
  def GetGeometry(modelID: Double, geometryExpressID: Double): IfcGeometry = js.native
  
  def GetIndexArray(ptr: Double, size: Double): js.typedarray.Uint32Array = js.native
  
  def GetLine(modelID: Double, expressID: Double): Any = js.native
  def GetLine(modelID: Double, expressID: Double, flatten: Boolean): Any = js.native
  
  def GetLineIDsWithType(modelID: Double, `type`: Double): Vector[Double] = js.native
  
  def GetRawLineData(modelID: Double, expressID: Double): RawLineData = js.native
  
  def GetVertexArray(ptr: Double, size: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Initializes the WASM module (WebIFCWasm), required before using any other functionality
    */
  def Init(): js.Promise[Unit] = js.native
  
  /**
    * Checks if a specific model ID is open or closed
    * @modelID Model handle retrieved by OpenModel
    */
  def IsModelOpen(modelID: Double): Boolean = js.native
  
  /**
    * Load all geometry in a model
    * @modelID Model handle retrieved by OpenModel
    */
  def LoadAllGeometry(modelID: Double): Vector[FlatMesh] = js.native
  
  /**
    * Opens a model and returns a modelID number
    * @data Buffer containing IFC data (bytes)
    * @data Settings settings for loading the model
    */
  def OpenModel(data: String): Double = js.native
  def OpenModel(data: String, settings: LoaderSettings): Double = js.native
  def OpenModel(data: js.typedarray.Uint8Array): Double = js.native
  def OpenModel(data: js.typedarray.Uint8Array, settings: LoaderSettings): Double = js.native
  
  def SetGeometryTransformation(modelID: Double, transformationMatrix: js.Array[Double]): Unit = js.native
  
  def SetWasmPath(path: String): Unit = js.native
  
  def StreamAllMeshes(modelID: Double, meshCallback: js.Function1[/* mesh */ FlatMesh, Unit]): Unit = js.native
  
  def WriteLine(modelID: Double, lineObject: Any): Unit = js.native
  
  def WriteRawLineData(modelID: Double, data: RawLineData): Any = js.native
  
  var fs: Any = js.native
  
  def getSubArray(heap: Any, startPtr: Any, sizeBytes: Any): Any = js.native
  
  var wasmModule: Any = js.native
}
