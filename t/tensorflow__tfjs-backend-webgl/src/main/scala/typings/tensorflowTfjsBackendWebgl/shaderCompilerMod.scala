package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderCompilerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCoordsDataType(rank: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordsDataType")(rank.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def makeShader(
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
    
    @scala.inline
    def apply(name: String, shapeInfo: ShapeInfo): InputInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shapeInfo = shapeInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputInfo]
    }
    
    @scala.inline
    implicit class InputInfoMutableBuilder[Self <: InputInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeInfo(value: ShapeInfo): Self = StObject.set(x, "shapeInfo", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      flatOffset: Double,
      isPacked: Boolean,
      isUniform: Boolean,
      logicalShape: js.Array[Double],
      texShape: js.Tuple2[Double, Double]
    ): ShapeInfo = {
      val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], isPacked = isPacked.asInstanceOf[js.Any], isUniform = isUniform.asInstanceOf[js.Any], logicalShape = logicalShape.asInstanceOf[js.Any], texShape = texShape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeInfo]
    }
    
    @scala.inline
    implicit class ShapeInfoMutableBuilder[Self <: ShapeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlatOffset(value: Double): Self = StObject.set(x, "flatOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPacked(value: Boolean): Self = StObject.set(x, "isPacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalShape(value: js.Array[Double]): Self = StObject.set(x, "logicalShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalShapeVarargs(value: Double*): Self = StObject.set(x, "logicalShape", js.Array(value :_*))
      
      @scala.inline
      def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
    }
  }
}
