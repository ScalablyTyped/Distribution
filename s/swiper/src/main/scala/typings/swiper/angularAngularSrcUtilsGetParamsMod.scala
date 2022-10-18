package typings.swiper

import org.scalablytyped.runtime.StringDictionary
import typings.swiper.anon.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularAngularSrcUtilsGetParamsMod {
  
  @JSImport("swiper/angular/angular/src/utils/get-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/angular/angular/src/utils/get-params", "allowedParams")
  @js.native
  val allowedParams: js.Array[String] = js.native
  
  inline def getParams(): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")().asInstanceOf[Params]
  inline def getParams(obj: Any): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(obj.asInstanceOf[js.Any]).asInstanceOf[Params]
  
  type KeyValueType = StringDictionary[Any]
}
