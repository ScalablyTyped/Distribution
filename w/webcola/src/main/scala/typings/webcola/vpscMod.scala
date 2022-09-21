package typings.webcola

import typings.webcola.anon.DesiredCenter
import typings.webcola.anon.LowerBound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpscMod {
  
  @JSImport("webcola/dist/src/vpsc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola/dist/src/vpsc", "Block")
  @js.native
  open class Block protected () extends StObject {
    def this(v: Variable) = this()
    
    /* private */ var addVariable: Any = js.native
    
    var blockInd: Double = js.native
    
    /* private */ var compute_lm: Any = js.native
    
    def cost(): Double = js.native
    
    def findMinLM(): Constraint = js.native
    
    /* private */ var findMinLMBetween: Any = js.native
    
    /* private */ var findPath: Any = js.native
    
    def isActiveDirectedPathBetween(u: Variable, v: Variable): Boolean = js.native
    
    def mergeAcross(b: Block, c: Constraint, dist: Double): Unit = js.native
    
    /* private */ var populateSplitBlock: Any = js.native
    
    var posn: Double = js.native
    
    var ps: PositionStats = js.native
    
    def splitBetween(vl: Variable, vr: Variable): typings.webcola.anon.Constraint = js.native
    
    def traverse(visit: js.Function1[/* c */ Constraint, Any], acc: js.Array[Any]): Unit = js.native
    def traverse(visit: js.Function1[/* c */ Constraint, Any], acc: js.Array[Any], v: Unit, prev: Variable): Unit = js.native
    def traverse(visit: js.Function1[/* c */ Constraint, Any], acc: js.Array[Any], v: Variable): Unit = js.native
    def traverse(visit: js.Function1[/* c */ Constraint, Any], acc: js.Array[Any], v: Variable, prev: Variable): Unit = js.native
    
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
    def createSplitBlock: Any = js.native
    inline def createSplitBlock_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSplitBlock")(x.asInstanceOf[js.Any])
    
    inline def split(c: Constraint): js.Array[Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(c.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block]]
  }
  
  @JSImport("webcola/dist/src/vpsc", "Blocks")
  @js.native
  open class Blocks protected () extends StObject {
    def this(vs: js.Array[Variable]) = this()
    
    def cost(): Double = js.native
    
    def forEach(f: js.Function2[/* b */ Block, /* i */ Double, Unit]): Unit = js.native
    
    def insert(b: Block): Unit = js.native
    
    /* private */ var list: Any = js.native
    
    def merge(c: Constraint): Unit = js.native
    
    def remove(b: Block): Unit = js.native
    
    def split(inactive: js.Array[Constraint]): Unit = js.native
    
    def updateBlockPositions(): Unit = js.native
    
    var vs: js.Array[Variable] = js.native
  }
  
  @JSImport("webcola/dist/src/vpsc", "Constraint")
  @js.native
  open class Constraint protected () extends StObject {
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
  open class PositionStats protected () extends StObject {
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
  open class Solver protected () extends StObject {
    def this(vs: js.Array[Variable], cs: js.Array[Constraint]) = this()
    
    var bs: Blocks = js.native
    
    def cost(): Double = js.native
    
    var cs: js.Array[Constraint] = js.native
    
    var inactive: js.Array[Constraint] = js.native
    
    /* private */ var mostViolated: Any = js.native
    
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
    inline def LAGRANGIAN_TOLERANCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAGRANGIAN_TOLERANCE")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/vpsc", "Solver.ZERO_UPPERBOUND")
    @js.native
    def ZERO_UPPERBOUND: Double = js.native
    inline def ZERO_UPPERBOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO_UPPERBOUND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/vpsc", "Variable")
  @js.native
  open class Variable protected () extends StObject {
    def this(desiredPosition: Double) = this()
    def this(desiredPosition: Double, weight: Double) = this()
    def this(desiredPosition: Double, weight: Double, scale: Double) = this()
    def this(desiredPosition: Double, weight: Unit, scale: Double) = this()
    
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
  
  inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter]): LowerBound = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any]).asInstanceOf[LowerBound]
  inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]
  inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double, upperBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]
  inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Unit, upperBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]
}
