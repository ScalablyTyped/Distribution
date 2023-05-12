package typings.vscodeTextmate

import typings.vscodeTextmate.releaseOnigLibMod.IOnigCaptureIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseUtilsMod {
  
  @JSImport("vscode-textmate/release/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/utils", "CachedFn")
  @js.native
  open class CachedFn[TKey, TValue] protected () extends StObject {
    def this(fn: js.Function1[/* key */ TKey, TValue]) = this()
    
    /* private */ val cache: Any = js.native
    
    /* private */ val fn: Any = js.native
    
    def get(key: TKey): TValue = js.native
  }
  
  @JSImport("vscode-textmate/release/utils", "RegexSource")
  @js.native
  open class RegexSource () extends StObject
  /* static members */
  object RegexSource {
    
    @JSImport("vscode-textmate/release/utils", "RegexSource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hasCaptures(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCaptures")().asInstanceOf[Boolean]
    inline def hasCaptures(regexSource: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCaptures")(regexSource.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def replaceCaptures(regexSource: String, captureSource: String, captureIndices: js.Array[IOnigCaptureIndex]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCaptures")(regexSource.asInstanceOf[js.Any], captureSource.asInstanceOf[js.Any], captureIndices.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clone_[T](something: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(something.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def escapeRegExpCharacters(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExpCharacters")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidHexColor(hex: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHexColor")(hex.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeObjects(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def performanceNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("performanceNow")().asInstanceOf[Double]
  
  inline def strArrCmp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strArrCmp")().asInstanceOf[Double]
  inline def strArrCmp(a: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strArrCmp")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def strArrCmp(a: js.Array[String], b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strArrCmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def strArrCmp(a: Null, b: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strArrCmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def strcmp(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strcmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type OrMask[T /* <: Double */] = Double
}
