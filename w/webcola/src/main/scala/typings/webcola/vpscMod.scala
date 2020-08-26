package typings.webcola

import typings.webcola.anon.DesiredCenter
import typings.webcola.anon.LowerBound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", JSImport.Namespace)
@js.native
object vpscMod extends js.Object {
  @js.native
  class Block protected () extends js.Object {
    def this(v: Variable) = this()
    var addVariable: js.Any = js.native
    var blockInd: Double = js.native
    var compute_lm: js.Any = js.native
    var findMinLMBetween: js.Any = js.native
    var findPath: js.Any = js.native
    var populateSplitBlock: js.Any = js.native
    var posn: Double = js.native
    var ps: PositionStats = js.native
    var vars: js.Array[Variable] = js.native
    def cost(): Double = js.native
    def findMinLM(): Constraint = js.native
    def isActiveDirectedPathBetween(u: Variable, v: Variable): Boolean = js.native
    def mergeAcross(b: Block, c: Constraint, dist: Double): Unit = js.native
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
  }
  
  @js.native
  class Blocks protected () extends js.Object {
    def this(vs: js.Array[Variable]) = this()
    var list: js.Any = js.native
    var vs: js.Array[Variable] = js.native
    def cost(): Double = js.native
    def forEach(f: js.Function2[/* b */ Block, /* i */ Double, Unit]): Unit = js.native
    def insert(b: Block): Unit = js.native
    def merge(c: Constraint): Unit = js.native
    def remove(b: Block): Unit = js.native
    def split(inactive: js.Array[Constraint]): Unit = js.native
    def updateBlockPositions(): Unit = js.native
  }
  
  @js.native
  class Constraint protected () extends js.Object {
    def this(left: Variable, right: Variable, gap: Double) = this()
    def this(left: Variable, right: Variable, gap: Double, equality: Boolean) = this()
    var active: Boolean = js.native
    var equality: Boolean = js.native
    var gap: Double = js.native
    var left: Variable = js.native
    var lm: Double = js.native
    var right: Variable = js.native
    var unsatisfiable: Boolean = js.native
    def slack(): Double = js.native
  }
  
  @js.native
  class PositionStats protected () extends js.Object {
    def this(scale: Double) = this()
    var A2: Double = js.native
    var AB: Double = js.native
    var AD: Double = js.native
    var scale: Double = js.native
    def addVariable(v: Variable): Unit = js.native
    def getPosn(): Double = js.native
  }
  
  @js.native
  class Solver protected () extends js.Object {
    def this(vs: js.Array[Variable], cs: js.Array[Constraint]) = this()
    var bs: Blocks = js.native
    var cs: js.Array[Constraint] = js.native
    var inactive: js.Array[Constraint] = js.native
    var mostViolated: js.Any = js.native
    var vs: js.Array[Variable] = js.native
    def cost(): Double = js.native
    def satisfy(): Unit = js.native
    def setDesiredPositions(ps: js.Array[Double]): Unit = js.native
    def setStartingPositions(ps: js.Array[Double]): Unit = js.native
    def solve(): Double = js.native
  }
  
  @js.native
  class Variable protected () extends js.Object {
    def this(desiredPosition: Double) = this()
    def this(desiredPosition: Double, weight: Double) = this()
    def this(desiredPosition: Double, weight: js.UndefOr[scala.Nothing], scale: Double) = this()
    def this(desiredPosition: Double, weight: Double, scale: Double) = this()
    var block: Block = js.native
    var cIn: js.Array[Constraint] = js.native
    var cOut: js.Array[Constraint] = js.native
    var desiredPosition: Double = js.native
    var offset: Double = js.native
    var scale: Double = js.native
    var weight: Double = js.native
    def dfdv(): Double = js.native
    def position(): Double = js.native
    def visitNeighbours(prev: Variable, f: js.Function2[/* c */ Constraint, /* next */ this.type, Unit]): Unit = js.native
  }
  
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter]): LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: js.UndefOr[scala.Nothing], upperBound: Double): LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double): LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double, upperBound: Double): LowerBound = js.native
  /* static members */
  @js.native
  object Block extends js.Object {
    var createSplitBlock: js.Any = js.native
    def split(c: Constraint): js.Array[Block] = js.native
  }
  
  /* static members */
  @js.native
  object Solver extends js.Object {
    var LAGRANGIAN_TOLERANCE: Double = js.native
    var ZERO_UPPERBOUND: Double = js.native
  }
  
}

