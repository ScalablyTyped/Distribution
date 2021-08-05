package typings.three.mod

import typings.three.polyfillsMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "LoaderUtils")
@js.native
class LoaderUtils ()
  extends typings.three.loaderUtilsMod.LoaderUtils
/* static members */
object LoaderUtils {
  
  @JSImport("three", "LoaderUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeText(array: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractUrlBase(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlBase")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
