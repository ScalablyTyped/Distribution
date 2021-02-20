package typings.three

import typings.three.polyfillsMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderUtilsMod {
  
  @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils")
  @js.native
  class LoaderUtils () extends StObject
  /* static members */
  object LoaderUtils {
    
    @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils.decodeText")
    @js.native
    def decodeText(array: TypedArray): String = js.native
    
    @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils.extractUrlBase")
    @js.native
    def extractUrlBase(url: String): String = js.native
  }
}
