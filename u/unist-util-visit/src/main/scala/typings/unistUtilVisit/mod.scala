package typings.unistUtilVisit

import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilVisit.complexTypesMod.BuildVisitor
import typings.unistUtilVisit.unistUtilVisitBooleans.`false`
import typings.unistUtilVisit.unistUtilVisitBooleans.`true`
import typings.unistUtilVisit.unistUtilVisitStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit", "visit")
  @js.native
  val visit: (js.Function4[
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
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Test = typings.unistUtilIs.mod.Test
  
  type Visitor = typings.unistUtilVisit.complexTypesMod.Visitor[
    typings.unist.mod.Node[Data], 
    typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  ]
  
  type VisitorResult = typings.unistUtilVisitParents.mod.VisitorResult
}
