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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuMathMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", "compileProgram")
  @js.native
  def compileProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", "makeShaderKey")
  @js.native
  def makeShaderKey(program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", "runProgram")
  @js.native
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, binary: GPGPUBinary, inputs: js.Array[TensorData], output: TensorData): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_math", "runProgram")
  @js.native
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](
    gpgpu: GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): Unit = js.native
  
  @js.native
  trait GPGPUBinary extends StObject {
    
    var inShapeInfos: js.Array[ShapeInfo] = js.native
    
    var infLoc: WebGLUniformLocation = js.native
    
    var nanLoc: WebGLUniformLocation = js.native
    
    var outShapeInfo: ShapeInfo = js.native
    
    var program: GPGPUProgram = js.native
    
    var source: String = js.native
    
    var uniformLocations: StringDictionary[WebGLUniformLocation] = js.native
    
    var webGLProgram: WebGLProgram = js.native
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
  
  @js.native
  trait GPGPUProgram extends StObject {
    
    /**
      * The type of scheme to use when packing texels for the output values.
      * See `PackingScheme` for details. Defaults to `PackingScheme.SHARED_BATCH`.
      */
    var outPackingScheme: js.UndefOr[PackingScheme] = js.native
    
    /**
      * Affects what type of texture we allocate for the output. Defaults to
      * `TextureUsage.RENDER`.
      */
    var outTexUsage: js.UndefOr[TextureUsage] = js.native
    
    var outputShape: js.Array[Double] = js.native
    
    /** If true, this program expects packed input textures. Defaults to false. */
    var packedInputs: js.UndefOr[Boolean] = js.native
    
    /** If true, this program produces a packed texture. Defaults to false. */
    var packedOutput: js.UndefOr[Boolean] = js.native
    
    var userCode: String = js.native
    
    var variableNames: js.Array[String] = js.native
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
  
  @js.native
  trait TensorData extends StObject {
    
    var isUniform: Boolean = js.native
    
    var shape: js.Array[Double] = js.native
    
    var texData: TextureData = js.native
    
    var uniformValues: js.UndefOr[TypedArray] = js.native
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
