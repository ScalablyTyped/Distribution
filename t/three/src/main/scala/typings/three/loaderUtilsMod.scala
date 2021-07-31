package typings.three

import typings.three.polyfillsMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderUtilsMod {
  
  @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils")
  @js.native
  class LoaderUtils () extends StObject
  /* static members */
  object LoaderUtils {
    
    @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decodeText(array: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(array.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def extractUrlBase(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlBase")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
