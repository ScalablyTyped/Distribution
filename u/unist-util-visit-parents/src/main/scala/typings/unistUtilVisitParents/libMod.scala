package typings.unistUtilVisitParents

import typings.std.Extract
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilVisitParents.libComplexTypesMod.InclusiveDescendant
import typings.unistUtilVisitParents.libComplexTypesMod.Matches
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`false`
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`true`
import typings.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unist-util-visit-parents/lib", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit-parents/lib", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit-parents/lib", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit-parents/lib", "visitParents")
  @js.native
  val visitParents: (js.Function4[
    /* tree */ typings.unist.mod.Node[Data], 
    /* test */ typings.unistUtilIs.libMod.Test, 
    /* visitor */ BuildVisitor[typings.unist.mod.Node[Data], typings.unistUtilIs.libMod.Test], 
    /* reverse */ js.UndefOr[Boolean | Null], 
    Unit
  ]) & (js.Function3[
    /* tree */ typings.unist.mod.Node[Data], 
    /* visitor */ BuildVisitor[typings.unist.mod.Node[Data], String], 
    /* reverse */ js.UndefOr[Boolean | Null], 
    Unit
  ]) = js.native
  
  type Action = Boolean | skip
  
  type ActionTuple = js.Tuple2[js.UndefOr[Action | Null | Unit], js.UndefOr[Index | Null]]
  
  type BuildVisitor[Tree /* <: typings.unist.mod.Node[Data] */, Check /* <: typings.unistUtilIs.libMod.Test */] = Visitor[
    Matches[InclusiveDescendant[Tree, Unit], Check], 
    Extract[InclusiveDescendant[Tree, Unit], Parent]
  ]
  
  type Index = Double
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Test = typings.unistUtilIs.mod.Test
  
  type Visitor[Visited /* <: typings.unist.mod.Node[Data] */, Ancestor /* <: typings.unist.mod.Parent[typings.unist.mod.Node[Data], Data] */] = js.Function2[/* node */ Visited, /* ancestors */ js.Array[Ancestor], VisitorResult]
  
  type VisitorResult = js.UndefOr[
    Action | (js.Tuple2[js.UndefOr[Unit | Action | Null], js.UndefOr[Double | Null]]) | Index | Null | Unit
  ]
}
