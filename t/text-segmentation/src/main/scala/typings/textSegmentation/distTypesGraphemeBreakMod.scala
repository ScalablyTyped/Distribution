package typings.textSegmentation

import typings.textSegmentation.anon.Next
import typings.utrie.mod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGraphemeBreakMod {
  
  @JSImport("text-segmentation/dist/types/GraphemeBreak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("text-segmentation/dist/types/GraphemeBreak", "BREAK_ALLOWED")
  @js.native
  val BREAK_ALLOWED: /* "\\u00F7" */ String = js.native
  
  @JSImport("text-segmentation/dist/types/GraphemeBreak", "BREAK_NOT_ALLOWED")
  @js.native
  val BREAK_NOT_ALLOWED: /* "\\u00D7" */ String = js.native
  
  inline def GraphemeBreaker(str: String): Next = ^.asInstanceOf[js.Dynamic].applyDynamic("GraphemeBreaker")(str.asInstanceOf[js.Any]).asInstanceOf[Next]
  
  @JSImport("text-segmentation/dist/types/GraphemeBreak", "UnicodeTrie")
  @js.native
  val UnicodeTrie: Trie = js.native
  
  inline def codePointToClass(codePoint: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("codePointToClass")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def graphemeBreakAtIndex(codePoints: js.Array[Double], index: Double): BREAK_OPPORTUNITIES = (^.asInstanceOf[js.Dynamic].applyDynamic("graphemeBreakAtIndex")(codePoints.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[BREAK_OPPORTUNITIES]
  
  inline def splitGraphemes(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitGraphemes")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toCodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  type BREAK_OPPORTUNITIES = /* "\\u00D7" */ String
}
