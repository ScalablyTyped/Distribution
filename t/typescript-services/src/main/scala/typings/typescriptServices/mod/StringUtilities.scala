package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "StringUtilities")
@js.native
open class StringUtilities ()
  extends StObject
     with typings.typescriptServices.TypeScript.StringUtilities
object StringUtilities {
  
  @JSImport("typescript-services", "StringUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def copyTo(
    source: String,
    sourceIndex: Double,
    destination: js.Array[Double],
    destinationIndex: Double,
    count: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTo")(source.asInstanceOf[js.Any], sourceIndex.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], destinationIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def endsWith(string: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromCharCodeArray(array: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCharCodeArray")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def isString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def repeat(value: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def startsWith(string: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def stringEquals(val1: String, val2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringEquals")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
