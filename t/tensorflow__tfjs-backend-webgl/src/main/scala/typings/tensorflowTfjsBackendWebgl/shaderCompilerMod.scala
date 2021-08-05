package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderCompilerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCoordsDataType(rank: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordsDataType")(rank.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeShader(
    inputsInfo: js.Array[InputInfo],
    outputShape: ShapeInfo,
    userCode: String,
    usesPackedTextures: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShader")(inputsInfo.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], userCode.asInstanceOf[js.Any], usesPackedTextures.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
      
      inline def setLogicalShapeVarargs(value: Double*): Self = StObject.set(x, "logicalShape", js.Array(value :_*))
      
      inline def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
    }
  }
}
