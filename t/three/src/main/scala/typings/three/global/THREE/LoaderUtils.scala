package typings.three.global.THREE

import typings.three.polyfillsMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.LoaderUtils")
@js.native
class LoaderUtils ()
  extends typings.three.mod.LoaderUtils
/* static members */
object LoaderUtils {
  
  @JSGlobal("THREE.LoaderUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeText(array: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractUrlBase(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlBase")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
