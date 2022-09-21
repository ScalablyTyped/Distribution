package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Descent")
@js.native
open class Descent protected ()
  extends typings.webcola.descentMod.Descent {
  def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]]) = this()
  def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]], G: js.Array[js.Array[Double]]) = this()
}
/* static members */
object Descent {
  
  @JSImport("webcola", "Descent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Descent.copy")
  @js.native
  def copy: Any = js.native
  inline def copy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
  
  inline def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSquareMatrix")(n.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  @JSImport("webcola", "Descent.dotProd")
  @js.native
  def dotProd: Any = js.native
  inline def dotProd_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotProd")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.mApply")
  @js.native
  def mApply: Any = js.native
  inline def mApply_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mApply")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.mid")
  @js.native
  def mid: Any = js.native
  inline def mid_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mid")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.rightMultiply")
  @js.native
  def rightMultiply: Any = js.native
  inline def rightMultiply_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.zeroDistance")
  @js.native
  def zeroDistance: Any = js.native
  inline def zeroDistance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroDistance")(x.asInstanceOf[js.Any])
}
