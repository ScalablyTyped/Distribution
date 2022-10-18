package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.ArrayIndex
import typings.tensorflowTfjsBackendWebgl.anon.KeptDims
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShaderCompilerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCoordsDataType(rank: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordsDataType")(rank.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUniformInfoFromShape(isPacked: Boolean, shape: js.Array[Double], texShape: js.Array[Double]): KeptDims = (^.asInstanceOf[js.Dynamic].applyDynamic("getUniformInfoFromShape")(isPacked.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], texShape.asInstanceOf[js.Any])).asInstanceOf[KeptDims]
  
  inline def makeShader(inputsInfo: js.Array[InputInfo], outputShape: ShapeInfo, program: ProgramParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShader")(inputsInfo.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def squeezeInputInfo(inInfo: InputInfo, squeezedShape: js.Array[Double]): InputInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("squeezeInputInfo")(inInfo.asInstanceOf[js.Any], squeezedShape.asInstanceOf[js.Any])).asInstanceOf[InputInfo]
  
  trait InputInfo extends StObject {
    
    var name: String
    
    var shapeInfo: ShapeInfo
  }
  object InputInfo {
    
    inline def apply(name: String, shapeInfo: ShapeInfo): InputInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shapeInfo = shapeInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputInfo]
    }
    
    extension [Self <: InputInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShapeInfo(value: ShapeInfo): Self = StObject.set(x, "shapeInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgramParams extends StObject {
    
    var customUniforms: js.UndefOr[js.Array[ArrayIndex]] = js.undefined
    
    var enableShapeUniforms: js.UndefOr[Boolean] = js.undefined
    
    var packedInputs: js.UndefOr[Boolean] = js.undefined
    
    var userCode: String
  }
  object ProgramParams {
    
    inline def apply(userCode: String): ProgramParams = {
      val __obj = js.Dynamic.literal(userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgramParams]
    }
    
    extension [Self <: ProgramParams](x: Self) {
      
      inline def setCustomUniforms(value: js.Array[ArrayIndex]): Self = StObject.set(x, "customUniforms", value.asInstanceOf[js.Any])
      
      inline def setCustomUniformsUndefined: Self = StObject.set(x, "customUniforms", js.undefined)
      
      inline def setCustomUniformsVarargs(value: ArrayIndex*): Self = StObject.set(x, "customUniforms", js.Array(value*))
      
      inline def setEnableShapeUniforms(value: Boolean): Self = StObject.set(x, "enableShapeUniforms", value.asInstanceOf[js.Any])
      
      inline def setEnableShapeUniformsUndefined: Self = StObject.set(x, "enableShapeUniforms", js.undefined)
      
      inline def setPackedInputs(value: Boolean): Self = StObject.set(x, "packedInputs", value.asInstanceOf[js.Any])
      
      inline def setPackedInputsUndefined: Self = StObject.set(x, "packedInputs", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShapeInfo extends StObject {
    
    var flatOffset: Double
    
    var isPacked: Boolean
    
    var isUniform: Boolean
    
    var logicalShape: js.Array[Double]
    
    var texShape: js.Tuple2[Double, Double]
  }
  object ShapeInfo {
    
    inline def apply(
      flatOffset: Double,
      isPacked: Boolean,
      isUniform: Boolean,
      logicalShape: js.Array[Double],
      texShape: js.Tuple2[Double, Double]
    ): ShapeInfo = {
      val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], isPacked = isPacked.asInstanceOf[js.Any], isUniform = isUniform.asInstanceOf[js.Any], logicalShape = logicalShape.asInstanceOf[js.Any], texShape = texShape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeInfo]
    }
    
    extension [Self <: ShapeInfo](x: Self) {
      
      inline def setFlatOffset(value: Double): Self = StObject.set(x, "flatOffset", value.asInstanceOf[js.Any])
      
      inline def setIsPacked(value: Boolean): Self = StObject.set(x, "isPacked", value.asInstanceOf[js.Any])
      
      inline def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
      
      inline def setLogicalShape(value: js.Array[Double]): Self = StObject.set(x, "logicalShape", value.asInstanceOf[js.Any])
      
      inline def setLogicalShapeVarargs(value: Double*): Self = StObject.set(x, "logicalShape", js.Array(value*))
      
      inline def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.float
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec2
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec3
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec4
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.int
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec2
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec3
    - typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec4
  */
  trait UniformType extends StObject
  object UniformType {
    
    inline def float: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.float = "float".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.float]
    
    inline def int: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.int = "int".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.int]
    
    inline def ivec2: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec2 = "ivec2".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec2]
    
    inline def ivec3: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec3 = "ivec3".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec3]
    
    inline def ivec4: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec4 = "ivec4".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec4]
    
    inline def vec2: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec2 = "vec2".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec2]
    
    inline def vec3: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec3 = "vec3".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec3]
    
    inline def vec4: typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec4 = "vec4".asInstanceOf[typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.vec4]
  }
}
