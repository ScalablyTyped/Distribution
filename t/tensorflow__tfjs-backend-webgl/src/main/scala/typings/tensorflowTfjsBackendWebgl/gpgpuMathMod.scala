package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLProgram
import typings.std.WebGLShader
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.anon.ArrayIndex
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.shaderCompilerMod.ShapeInfo
import typings.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureData
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuMathMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("compileProgram")(gpgpu.asInstanceOf[js.Any], program.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[GPGPUBinary]
  
  inline def getUniformLocations(gpgpu: GPGPUContext, program: GPGPUProgram, webGLProgram: WebGLProgram): GPGPUBinaryLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("getUniformLocations")(gpgpu.asInstanceOf[js.Any], program.asInstanceOf[js.Any], webGLProgram.asInstanceOf[js.Any])).asInstanceOf[GPGPUBinaryLocations]
  
  inline def makeShaderKey(program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShaderKey")(program.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, binary: GPGPUBinary, inputs: js.Array[TensorData], output: TensorData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runProgram")(gpgpu.asInstanceOf[js.Any], binary.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](
    gpgpu: GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customUniformValues: js.Array[js.Array[Double]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runProgram")(gpgpu.asInstanceOf[js.Any], binary.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any], customUniformValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useShapeUniforms(rank: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useShapeUniforms")(rank.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait GPGPUBinary extends StObject {
    
    var customUniformLocations: js.UndefOr[js.Array[WebGLUniformLocation]] = js.undefined
    
    var fragmentShader: WebGLShader
    
    var inShapeInfos: js.Array[ShapeInfo]
    
    var inShapesLocations: js.UndefOr[StringDictionary[WebGLUniformLocation]] = js.undefined
    
    var inTexShapesLocations: js.UndefOr[StringDictionary[WebGLUniformLocation]] = js.undefined
    
    var infLoc: WebGLUniformLocation
    
    var nanLoc: WebGLUniformLocation
    
    var outShapeInfo: ShapeInfo
    
    var outShapeLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var outShapeStridesLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var outTexShapeLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var program: GPGPUProgram
    
    var source: String
    
    var uniformLocations: StringDictionary[WebGLUniformLocation]
    
    var webGLProgram: WebGLProgram
  }
  object GPGPUBinary {
    
    inline def apply(
      fragmentShader: WebGLShader,
      inShapeInfos: js.Array[ShapeInfo],
      infLoc: WebGLUniformLocation,
      nanLoc: WebGLUniformLocation,
      outShapeInfo: ShapeInfo,
      program: GPGPUProgram,
      source: String,
      uniformLocations: StringDictionary[WebGLUniformLocation],
      webGLProgram: WebGLProgram
    ): GPGPUBinary = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], inShapeInfos = inShapeInfos.asInstanceOf[js.Any], infLoc = infLoc.asInstanceOf[js.Any], nanLoc = nanLoc.asInstanceOf[js.Any], outShapeInfo = outShapeInfo.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniformLocations = uniformLocations.asInstanceOf[js.Any], webGLProgram = webGLProgram.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPGPUBinary]
    }
    
    extension [Self <: GPGPUBinary](x: Self) {
      
      inline def setCustomUniformLocations(value: js.Array[WebGLUniformLocation]): Self = StObject.set(x, "customUniformLocations", value.asInstanceOf[js.Any])
      
      inline def setCustomUniformLocationsUndefined: Self = StObject.set(x, "customUniformLocations", js.undefined)
      
      inline def setCustomUniformLocationsVarargs(value: WebGLUniformLocation*): Self = StObject.set(x, "customUniformLocations", js.Array(value*))
      
      inline def setFragmentShader(value: WebGLShader): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setInShapeInfos(value: js.Array[ShapeInfo]): Self = StObject.set(x, "inShapeInfos", value.asInstanceOf[js.Any])
      
      inline def setInShapeInfosVarargs(value: ShapeInfo*): Self = StObject.set(x, "inShapeInfos", js.Array(value*))
      
      inline def setInShapesLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "inShapesLocations", value.asInstanceOf[js.Any])
      
      inline def setInShapesLocationsUndefined: Self = StObject.set(x, "inShapesLocations", js.undefined)
      
      inline def setInTexShapesLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "inTexShapesLocations", value.asInstanceOf[js.Any])
      
      inline def setInTexShapesLocationsUndefined: Self = StObject.set(x, "inTexShapesLocations", js.undefined)
      
      inline def setInfLoc(value: WebGLUniformLocation): Self = StObject.set(x, "infLoc", value.asInstanceOf[js.Any])
      
      inline def setNanLoc(value: WebGLUniformLocation): Self = StObject.set(x, "nanLoc", value.asInstanceOf[js.Any])
      
      inline def setOutShapeInfo(value: ShapeInfo): Self = StObject.set(x, "outShapeInfo", value.asInstanceOf[js.Any])
      
      inline def setOutShapeLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outShapeLocation", value.asInstanceOf[js.Any])
      
      inline def setOutShapeLocationUndefined: Self = StObject.set(x, "outShapeLocation", js.undefined)
      
      inline def setOutShapeStridesLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outShapeStridesLocation", value.asInstanceOf[js.Any])
      
      inline def setOutShapeStridesLocationUndefined: Self = StObject.set(x, "outShapeStridesLocation", js.undefined)
      
      inline def setOutTexShapeLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outTexShapeLocation", value.asInstanceOf[js.Any])
      
      inline def setOutTexShapeLocationUndefined: Self = StObject.set(x, "outTexShapeLocation", js.undefined)
      
      inline def setProgram(value: GPGPUProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUniformLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "uniformLocations", value.asInstanceOf[js.Any])
      
      inline def setWebGLProgram(value: WebGLProgram): Self = StObject.set(x, "webGLProgram", value.asInstanceOf[js.Any])
    }
  }
  
  trait GPGPUBinaryLocations extends StObject {
    
    var customUniformLocations: js.UndefOr[js.Array[WebGLUniformLocation]] = js.undefined
    
    var inShapesLocations: js.UndefOr[StringDictionary[WebGLUniformLocation]] = js.undefined
    
    var inTexShapesLocations: js.UndefOr[StringDictionary[WebGLUniformLocation]] = js.undefined
    
    var infLoc: WebGLUniformLocation
    
    var nanLoc: WebGLUniformLocation
    
    var outShapeLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var outShapeStridesLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var outTexShapeLocation: js.UndefOr[WebGLUniformLocation] = js.undefined
    
    var uniformLocations: StringDictionary[WebGLUniformLocation]
  }
  object GPGPUBinaryLocations {
    
    inline def apply(
      infLoc: WebGLUniformLocation,
      nanLoc: WebGLUniformLocation,
      uniformLocations: StringDictionary[WebGLUniformLocation]
    ): GPGPUBinaryLocations = {
      val __obj = js.Dynamic.literal(infLoc = infLoc.asInstanceOf[js.Any], nanLoc = nanLoc.asInstanceOf[js.Any], uniformLocations = uniformLocations.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPGPUBinaryLocations]
    }
    
    extension [Self <: GPGPUBinaryLocations](x: Self) {
      
      inline def setCustomUniformLocations(value: js.Array[WebGLUniformLocation]): Self = StObject.set(x, "customUniformLocations", value.asInstanceOf[js.Any])
      
      inline def setCustomUniformLocationsUndefined: Self = StObject.set(x, "customUniformLocations", js.undefined)
      
      inline def setCustomUniformLocationsVarargs(value: WebGLUniformLocation*): Self = StObject.set(x, "customUniformLocations", js.Array(value*))
      
      inline def setInShapesLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "inShapesLocations", value.asInstanceOf[js.Any])
      
      inline def setInShapesLocationsUndefined: Self = StObject.set(x, "inShapesLocations", js.undefined)
      
      inline def setInTexShapesLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "inTexShapesLocations", value.asInstanceOf[js.Any])
      
      inline def setInTexShapesLocationsUndefined: Self = StObject.set(x, "inTexShapesLocations", js.undefined)
      
      inline def setInfLoc(value: WebGLUniformLocation): Self = StObject.set(x, "infLoc", value.asInstanceOf[js.Any])
      
      inline def setNanLoc(value: WebGLUniformLocation): Self = StObject.set(x, "nanLoc", value.asInstanceOf[js.Any])
      
      inline def setOutShapeLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outShapeLocation", value.asInstanceOf[js.Any])
      
      inline def setOutShapeLocationUndefined: Self = StObject.set(x, "outShapeLocation", js.undefined)
      
      inline def setOutShapeStridesLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outShapeStridesLocation", value.asInstanceOf[js.Any])
      
      inline def setOutShapeStridesLocationUndefined: Self = StObject.set(x, "outShapeStridesLocation", js.undefined)
      
      inline def setOutTexShapeLocation(value: WebGLUniformLocation): Self = StObject.set(x, "outTexShapeLocation", value.asInstanceOf[js.Any])
      
      inline def setOutTexShapeLocationUndefined: Self = StObject.set(x, "outTexShapeLocation", js.undefined)
      
      inline def setUniformLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "uniformLocations", value.asInstanceOf[js.Any])
    }
  }
  
  trait GPGPUProgram extends StObject {
    
    var customUniforms: js.UndefOr[js.Array[ArrayIndex]] = js.undefined
    
    var enableShapeUniforms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The type of scheme to use when packing texels for the output values.
      * See `PackingScheme` for details. Defaults to `PackingScheme.SHARED_BATCH`.
      */
    var outPackingScheme: js.UndefOr[PackingScheme] = js.undefined
    
    /**
      * Affects what type of texture we allocate for the output. Defaults to
      * `TextureUsage.RENDER`.
      */
    var outTexUsage: js.UndefOr[TextureUsage] = js.undefined
    
    var outputShape: js.Array[Double]
    
    /** If true, this program expects packed input textures. Defaults to false. */
    var packedInputs: js.UndefOr[Boolean] = js.undefined
    
    /** If true, this program produces a packed texture. Defaults to false. */
    var packedOutput: js.UndefOr[Boolean] = js.undefined
    
    var userCode: String
    
    var variableNames: js.Array[String]
  }
  object GPGPUProgram {
    
    inline def apply(outputShape: js.Array[Double], userCode: String, variableNames: js.Array[String]): GPGPUProgram = {
      val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPGPUProgram]
    }
    
    extension [Self <: GPGPUProgram](x: Self) {
      
      inline def setCustomUniforms(value: js.Array[ArrayIndex]): Self = StObject.set(x, "customUniforms", value.asInstanceOf[js.Any])
      
      inline def setCustomUniformsUndefined: Self = StObject.set(x, "customUniforms", js.undefined)
      
      inline def setCustomUniformsVarargs(value: ArrayIndex*): Self = StObject.set(x, "customUniforms", js.Array(value*))
      
      inline def setEnableShapeUniforms(value: Boolean): Self = StObject.set(x, "enableShapeUniforms", value.asInstanceOf[js.Any])
      
      inline def setEnableShapeUniformsUndefined: Self = StObject.set(x, "enableShapeUniforms", js.undefined)
      
      inline def setOutPackingScheme(value: PackingScheme): Self = StObject.set(x, "outPackingScheme", value.asInstanceOf[js.Any])
      
      inline def setOutPackingSchemeUndefined: Self = StObject.set(x, "outPackingScheme", js.undefined)
      
      inline def setOutTexUsage(value: TextureUsage): Self = StObject.set(x, "outTexUsage", value.asInstanceOf[js.Any])
      
      inline def setOutTexUsageUndefined: Self = StObject.set(x, "outTexUsage", js.undefined)
      
      inline def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
      
      inline def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value*))
      
      inline def setPackedInputs(value: Boolean): Self = StObject.set(x, "packedInputs", value.asInstanceOf[js.Any])
      
      inline def setPackedInputsUndefined: Self = StObject.set(x, "packedInputs", js.undefined)
      
      inline def setPackedOutput(value: Boolean): Self = StObject.set(x, "packedOutput", value.asInstanceOf[js.Any])
      
      inline def setPackedOutputUndefined: Self = StObject.set(x, "packedOutput", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setVariableNames(value: js.Array[String]): Self = StObject.set(x, "variableNames", value.asInstanceOf[js.Any])
      
      inline def setVariableNamesVarargs(value: String*): Self = StObject.set(x, "variableNames", js.Array(value*))
    }
  }
  
  trait TensorData extends StObject {
    
    var isUniform: Boolean
    
    var shape: js.Array[Double]
    
    var texData: TextureData
    
    var uniformValues: js.UndefOr[TypedArray] = js.undefined
  }
  object TensorData {
    
    inline def apply(isUniform: Boolean, shape: js.Array[Double], texData: TextureData): TensorData = {
      val __obj = js.Dynamic.literal(isUniform = isUniform.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texData = texData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorData]
    }
    
    extension [Self <: TensorData](x: Self) {
      
      inline def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setTexData(value: TextureData): Self = StObject.set(x, "texData", value.asInstanceOf[js.Any])
      
      inline def setUniformValues(value: TypedArray): Self = StObject.set(x, "uniformValues", value.asInstanceOf[js.Any])
      
      inline def setUniformValuesUndefined: Self = StObject.set(x, "uniformValues", js.undefined)
    }
  }
}
