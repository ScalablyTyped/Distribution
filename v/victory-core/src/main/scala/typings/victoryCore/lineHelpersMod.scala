package typings.victoryCore

import typings.d3Shape.mod.LineRadial_
import typings.d3Shape.mod.Line_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineHelpersMod {
  
  @JSImport("victory-core/lib/victory-util/line-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInterpolationFunction(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolationFunction")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLineFunction(props: Any): (LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineFunction")(props.asInstanceOf[js.Any]).asInstanceOf[(LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.basis
    - typings.victoryCore.victoryCoreStrings.cardinal
    - typings.victoryCore.victoryCoreStrings.bumpX
    - typings.victoryCore.victoryCoreStrings.bumpY
    - typings.victoryCore.victoryCoreStrings.bundle
    - typings.victoryCore.victoryCoreStrings.catmullRom
    - typings.victoryCore.victoryCoreStrings.linear
    - typings.victoryCore.victoryCoreStrings.monotoneX
    - typings.victoryCore.victoryCoreStrings.monotoneY
    - typings.victoryCore.victoryCoreStrings.step
    - typings.victoryCore.victoryCoreStrings.stepAfter
    - typings.victoryCore.victoryCoreStrings.stepBefore
    - typings.victoryCore.victoryCoreStrings.natural
  */
  trait CurveName extends StObject
  object CurveName {
    
    inline def basis: typings.victoryCore.victoryCoreStrings.basis = "basis".asInstanceOf[typings.victoryCore.victoryCoreStrings.basis]
    
    inline def bumpX: typings.victoryCore.victoryCoreStrings.bumpX = "bumpX".asInstanceOf[typings.victoryCore.victoryCoreStrings.bumpX]
    
    inline def bumpY: typings.victoryCore.victoryCoreStrings.bumpY = "bumpY".asInstanceOf[typings.victoryCore.victoryCoreStrings.bumpY]
    
    inline def bundle: typings.victoryCore.victoryCoreStrings.bundle = "bundle".asInstanceOf[typings.victoryCore.victoryCoreStrings.bundle]
    
    inline def cardinal: typings.victoryCore.victoryCoreStrings.cardinal = "cardinal".asInstanceOf[typings.victoryCore.victoryCoreStrings.cardinal]
    
    inline def catmullRom: typings.victoryCore.victoryCoreStrings.catmullRom = "catmullRom".asInstanceOf[typings.victoryCore.victoryCoreStrings.catmullRom]
    
    inline def linear: typings.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typings.victoryCore.victoryCoreStrings.linear]
    
    inline def monotoneX: typings.victoryCore.victoryCoreStrings.monotoneX = "monotoneX".asInstanceOf[typings.victoryCore.victoryCoreStrings.monotoneX]
    
    inline def monotoneY: typings.victoryCore.victoryCoreStrings.monotoneY = "monotoneY".asInstanceOf[typings.victoryCore.victoryCoreStrings.monotoneY]
    
    inline def natural: typings.victoryCore.victoryCoreStrings.natural = "natural".asInstanceOf[typings.victoryCore.victoryCoreStrings.natural]
    
    inline def step: typings.victoryCore.victoryCoreStrings.step = "step".asInstanceOf[typings.victoryCore.victoryCoreStrings.step]
    
    inline def stepAfter: typings.victoryCore.victoryCoreStrings.stepAfter = "stepAfter".asInstanceOf[typings.victoryCore.victoryCoreStrings.stepAfter]
    
    inline def stepBefore: typings.victoryCore.victoryCoreStrings.stepBefore = "stepBefore".asInstanceOf[typings.victoryCore.victoryCoreStrings.stepBefore]
  }
}
