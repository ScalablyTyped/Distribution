package typings.unistUtilVisitParents

import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilVisitParents.complexTypesMod.BuildVisitor
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`false`
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`true`
import typings.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit-parents", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit-parents", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit-parents", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit-parents", "visitParents")
  @js.native
  val visitParents: (js.Function4[
    /* tree */ typings.unist.mod.Node[Data], 
    /* test */ typings.unistUtilIs.mod.Test, 
    /* visitor */ BuildVisitor[typings.unist.mod.Node[Data], typings.unistUtilIs.mod.Test], 
    /* reverse */ js.UndefOr[Boolean], 
    Unit
  ]) & (js.Function3[
    /* tree */ typings.unist.mod.Node[Data], 
    /* visitor */ BuildVisitor[typings.unist.mod.Node[Data], String], 
    /* reverse */ js.UndefOr[Boolean], 
    Unit
  ]) = js.native
  
  type Action = typings.unistUtilVisitParents.complexTypesMod.Action
  
  type ActionTuple = typings.unistUtilVisitParents.complexTypesMod.ActionTuple
  
  type Index = typings.unistUtilVisitParents.complexTypesMod.Index
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Test = typings.unistUtilIs.mod.Test
  
  type Visitor = typings.unistUtilVisitParents.complexTypesMod.Visitor[
    typings.unist.mod.Node[Data], 
    typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  ]
  
  type VisitorResult = typings.unistUtilVisitParents.complexTypesMod.VisitorResult
}
