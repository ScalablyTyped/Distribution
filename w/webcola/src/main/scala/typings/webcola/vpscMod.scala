package typings.webcola

import typings.webcola.anon.DesiredCenter
import typings.webcola.anon.LowerBound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpscMod {
  
  @JSImport("webcola/dist/src/vpsc", "Block")
  @js.native
  class Block protected () extends StObject {
    def this(v: Variable) = this()
    
    var addVariable: js.Any = js.native
    
    var blockInd: Double = js.native
    
    var compute_lm: js.Any = js.native
    
    def cost(): Double = js.native
    
    def findMinLM(): Constraint = js.native
    
    var findMinLMBetween: js.Any = js.native
    
    var findPath: js.Any = js.native
    
    def isActiveDirectedPathBetween(u: Variable, v: Variable): Boolean = js.native
    
    def mergeAcross(b: Block, c: Constraint, dist: Double): Unit = js.native
    
    var populateSplitBlock: js.Any = js.native
    
    var posn: Double = js.native
    
    var ps: PositionStats = js.native
    
    def splitBetween(vl: Variable, vr: Variable): typings.webcola.anon.Constraint = js.native
    
    def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_]): Unit = js.native
    def traverse(
      visit: js.Function1[/* c */ Constraint, _],
      acc: js.Array[_],
      v: js.UndefOr[scala.Nothing],
      prev: Variable
    ): Unit = js.native
    def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable): Unit = js.native
    def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable, prev: Variable): Unit = js.native
    
    def updateWeightedPosition(): Unit = js.native
    
    var vars: js.Array[Variable] = js.native
  }
  /* static members */
  object Block {
    
    @JSImport("webcola/dist/src/vpsc", "Block")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/vpsc", "Block.createSplitBlock")
    @js.native
    def createSplitBlock: js.Any = js.native
    @scala.inline
    def createSplitBlock_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSplitBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/vpsc", "Block.split")
    @js.native
    def split(c: Constraint): js.Array[Block] = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "Blocks")
  @js.native
  class Blocks protected () extends StObject {
    def this(vs: js.Array[Variable]) = this()
    
    def cost(): Double = js.native
    
    def forEach(f: js.Function2[/* b */ Block, /* i */ Double, Unit]): Unit = js.native
    
    def insert(b: Block): Unit = js.native
    
    var list: js.Any = js.native
    
    def merge(c: Constraint): Unit = js.native
    
    def remove(b: Block): Unit = js.native
    
    def split(inactive: js.Array[Constraint]): Unit = js.native
    
    def updateBlockPositions(): Unit = js.native
    
    var vs: js.Array[Variable] = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "Constraint")
  @js.native
  class Constraint protected () extends StObject {
    def this(left: Variable, right: Variable, gap: Double) = this()
    def this(left: Variable, right: Variable, gap: Double, equality: Boolean) = this()
    
    var active: Boolean = js.native
    
    var equality: Boolean = js.native
    
    var gap: Double = js.native
    
    var left: Variable = js.native
    
    var lm: Double = js.native
    
    var right: Variable = js.native
    
    def slack(): Double = js.native
    
    var unsatisfiable: Boolean = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "PositionStats")
  @js.native
  class PositionStats protected () extends StObject {
    def this(scale: Double) = this()
    
    var A2: Double = js.native
    
    var AB: Double = js.native
    
    var AD: Double = js.native
    
    def addVariable(v: Variable): Unit = js.native
    
    def getPosn(): Double = js.native
    
    var scale: Double = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "Solver")
  @js.native
  class Solver protected () extends StObject {
    def this(vs: js.Array[Variable], cs: js.Array[Constraint]) = this()
    
    var bs: Blocks = js.native
    
    def cost(): Double = js.native
    
    var cs: js.Array[Constraint] = js.native
    
    var inactive: js.Array[Constraint] = js.native
    
    var mostViolated: js.Any = js.native
    
    def satisfy(): Unit = js.native
    
    def setDesiredPositions(ps: js.Array[Double]): Unit = js.native
    
    def setStartingPositions(ps: js.Array[Double]): Unit = js.native
    
    def solve(): Double = js.native
    
    var vs: js.Array[Variable] = js.native
  }
  /* static members */
  object Solver {
    
    @JSImport("webcola/dist/src/vpsc", "Solver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/vpsc", "Solver.LAGRANGIAN_TOLERANCE")
    @js.native
    def LAGRANGIAN_TOLERANCE: Double = js.native
    @scala.inline
    def LAGRANGIAN_TOLERANCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAGRANGIAN_TOLERANCE")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/vpsc", "Solver.ZERO_UPPERBOUND")
    @js.native
    def ZERO_UPPERBOUND: Double = js.native
    @scala.inline
    def ZERO_UPPERBOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO_UPPERBOUND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/vpsc", "Variable")
  @js.native
  class Variable protected () extends StObject {
    def this(desiredPosition: Double) = this()
    def this(desiredPosition: Double, weight: Double) = this()
    def this(desiredPosition: Double, weight: js.UndefOr[scala.Nothing], scale: Double) = this()
    def this(desiredPosition: Double, weight: Double, scale: Double) = this()
    
    var block: Block = js.native
    
    var cIn: js.Array[Constraint] = js.native
    
    var cOut: js.Array[Constraint] = js.native
    
    var desiredPosition: Double = js.native
    
    def dfdv(): Double = js.native
    
    var offset: Double = js.native
    
    def position(): Double = js.native
    
    var scale: Double = js.native
    
    def visitNeighbours(prev: Variable, f: js.Function2[/* c */ Constraint, /* next */ this.type, Unit]): Unit = js.native
    
    var weight: Double = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "removeOverlapInOneDimension")
  @js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter]): LowerBound = js.native
  @JSImport("webcola/dist/src/vpsc", "removeOverlapInOneDimension")
  @js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: js.UndefOr[scala.Nothing], upperBound: Double): LowerBound = js.native
  @JSImport("webcola/dist/src/vpsc", "removeOverlapInOneDimension")
  @js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double): LowerBound = js.native
  @JSImport("webcola/dist/src/vpsc", "removeOverlapInOneDimension")
  @js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double, upperBound: Double): LowerBound = js.native
}
