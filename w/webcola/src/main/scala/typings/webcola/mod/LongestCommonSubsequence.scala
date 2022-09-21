package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "LongestCommonSubsequence")
@js.native
open class LongestCommonSubsequence[T] protected ()
  extends typings.webcola.gridrouterMod.LongestCommonSubsequence[T] {
  def this(s: js.Array[T], t: js.Array[T]) = this()
}
/* static members */
object LongestCommonSubsequence {
  
  @JSImport("webcola", "LongestCommonSubsequence")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "LongestCommonSubsequence.findMatch")
  @js.native
  def findMatch: Any = js.native
  inline def findMatch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findMatch")(x.asInstanceOf[js.Any])
}
