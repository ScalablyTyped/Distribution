package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
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
  
  @scala.inline
  def compileProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("compileProgram")(gpgpu.asInstanceOf[js.Any], program.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[GPGPUBinary]
  
  @scala.inline
  def makeShaderKey(program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShaderKey")(program.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, binary: GPGPUBinary, inputs: js.Array[TensorData], output: TensorData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runProgram")(gpgpu.asInstanceOf[js.Any], binary.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](
    gpgpu: GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runProgram")(gpgpu.asInstanceOf[js.Any], binary.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], output.asInstanceOf[js.Any], customSetup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GPGPUBinary extends StObject {
    
    var inShapeInfos: js.Array[ShapeInfo]
    
    var infLoc: WebGLUniformLocation
    
    var nanLoc: WebGLUniformLocation
    
    var outShapeInfo: ShapeInfo
    
    var program: GPGPUProgram
    
    var source: String
    
    var uniformLocations: StringDictionary[WebGLUniformLocation]
    
    var webGLProgram: WebGLProgram
  }
  object GPGPUBinary {
    
    @scala.inline
    def apply(
      inShapeInfos: js.Array[ShapeInfo],
      infLoc: WebGLUniformLocation,
      nanLoc: WebGLUniformLocation,
      outShapeInfo: ShapeInfo,
      program: GPGPUProgram,
      source: String,
      uniformLocations: StringDictionary[WebGLUniformLocation],
      webGLProgram: WebGLProgram
    ): GPGPUBinary = {
      val __obj = js.Dynamic.literal(inShapeInfos = inShapeInfos.asInstanceOf[js.Any], infLoc = infLoc.asInstanceOf[js.Any], nanLoc = nanLoc.asInstanceOf[js.Any], outShapeInfo = outShapeInfo.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniformLocations = uniformLocations.asInstanceOf[js.Any], webGLProgram = webGLProgram.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPGPUBinary]
    }
    
    @scala.inline
    implicit class GPGPUBinaryMutableBuilder[Self <: GPGPUBinary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInShapeInfos(value: js.Array[ShapeInfo]): Self = StObject.set(x, "inShapeInfos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInShapeInfosVarargs(value: ShapeInfo*): Self = StObject.set(x, "inShapeInfos", js.Array(value :_*))
      
      @scala.inline
      def setInfLoc(value: WebGLUniformLocation): Self = StObject.set(x, "infLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanLoc(value: WebGLUniformLocation): Self = StObject.set(x, "nanLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutShapeInfo(value: ShapeInfo): Self = StObject.set(x, "outShapeInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: GPGPUProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformLocations(value: StringDictionary[WebGLUniformLocation]): Self = StObject.set(x, "uniformLocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebGLProgram(value: WebGLProgram): Self = StObject.set(x, "webGLProgram", value.asInstanceOf[js.Any])
    }
  }
  
  trait GPGPUProgram extends StObject {
    
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
    
    @scala.inline
    def apply(outputShape: js.Array[Double], userCode: String, variableNames: js.Array[String]): GPGPUProgram = {
      val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPGPUProgram]
    }
    
    @scala.inline
    implicit class GPGPUProgramMutableBuilder[Self <: GPGPUProgram] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutPackingScheme(value: PackingScheme): Self = StObject.set(x, "outPackingScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutPackingSchemeUndefined: Self = StObject.set(x, "outPackingScheme", js.undefined)
      
      @scala.inline
      def setOutTexUsage(value: TextureUsage): Self = StObject.set(x, "outTexUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutTexUsageUndefined: Self = StObject.set(x, "outTexUsage", js.undefined)
      
      @scala.inline
      def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
      
      @scala.inline
      def setPackedInputs(value: Boolean): Self = StObject.set(x, "packedInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackedInputsUndefined: Self = StObject.set(x, "packedInputs", js.undefined)
      
      @scala.inline
      def setPackedOutput(value: Boolean): Self = StObject.set(x, "packedOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackedOutputUndefined: Self = StObject.set(x, "packedOutput", js.undefined)
      
      @scala.inline
      def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableNames(value: js.Array[String]): Self = StObject.set(x, "variableNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableNamesVarargs(value: String*): Self = StObject.set(x, "variableNames", js.Array(value :_*))
    }
  }
  
  trait TensorData extends StObject {
    
    var isUniform: Boolean
    
    var shape: js.Array[Double]
    
    var texData: TextureData
    
    var uniformValues: js.UndefOr[TypedArray] = js.undefined
  }
  object TensorData {
    
    @scala.inline
    def apply(isUniform: Boolean, shape: js.Array[Double], texData: TextureData): TensorData = {
      val __obj = js.Dynamic.literal(isUniform = isUniform.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texData = texData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorData]
    }
    
    @scala.inline
    implicit class TensorDataMutableBuilder[Self <: TensorData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setTexData(value: TextureData): Self = StObject.set(x, "texData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformValues(value: TypedArray): Self = StObject.set(x, "uniformValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformValuesUndefined: Self = StObject.set(x, "uniformValues", js.undefined)
    }
  }
}
