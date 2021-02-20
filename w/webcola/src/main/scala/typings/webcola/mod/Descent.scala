package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Descent")
@js.native
class Descent protected ()
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
  def copy: js.Any = js.native
  @scala.inline
  def copy_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.createSquareMatrix")
  @js.native
  def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("webcola", "Descent.dotProd")
  @js.native
  def dotProd: js.Any = js.native
  @scala.inline
  def dotProd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotProd")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.mApply")
  @js.native
  def mApply: js.Any = js.native
  @scala.inline
  def mApply_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mApply")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.mid")
  @js.native
  def mid: js.Any = js.native
  @scala.inline
  def mid_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mid")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.rightMultiply")
  @js.native
  def rightMultiply: js.Any = js.native
  @scala.inline
  def rightMultiply_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Descent.zeroDistance")
  @js.native
  def zeroDistance: js.Any = js.native
  @scala.inline
  def zeroDistance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroDistance")(x.asInstanceOf[js.Any])
}
