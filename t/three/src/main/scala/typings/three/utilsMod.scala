package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("three/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayMax(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMax")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def arrayMin(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMin")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
}
