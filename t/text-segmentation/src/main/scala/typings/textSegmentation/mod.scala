package typings.textSegmentation

import typings.textSegmentation.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-segmentation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GraphemeBreaker(str: String): Next = ^.asInstanceOf[js.Dynamic].applyDynamic("GraphemeBreaker")(str.asInstanceOf[js.Any]).asInstanceOf[Next]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def splitGraphemes(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitGraphemes")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toCodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
