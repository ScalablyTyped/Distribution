package typings.victoryCore.libMod

import typings.d3Shape.mod.LineRadial_
import typings.d3Shape.mod.Line_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineHelpers {
  
  @JSImport("victory-core/lib", "LineHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInterpolationFunction(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolationFunction")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLineFunction(props: Any): (LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineFunction")(props.asInstanceOf[js.Any]).asInstanceOf[(LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]])]
}
