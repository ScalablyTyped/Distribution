package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDataFormat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDataFormat")().asInstanceOf[Unit]
  inline def checkDataFormat(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDataFormat")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkInterpolationFormat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkInterpolationFormat")().asInstanceOf[Unit]
  inline def checkInterpolationFormat(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkInterpolationFormat")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkPaddingMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPaddingMode")().asInstanceOf[Unit]
  inline def checkPaddingMode(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPaddingMode")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkPoolMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPoolMode")().asInstanceOf[Unit]
  inline def checkPoolMode(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPoolMode")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getScopedTensorName(tensorName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedTensorName")(tensorName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUniqueTensorName(scopedName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueTensorName")(scopedName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidTensorName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTensorName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nameScope[T](name: String, fn: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("nameScope")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
