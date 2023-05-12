package typings.unistUtilVisit

import typings.std.Extract
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilVisit.unistUtilVisitBooleans.`false`
import typings.unistUtilVisit.unistUtilVisitBooleans.`true`
import typings.unistUtilVisit.unistUtilVisitStrings.skip
import typings.unistUtilVisitParents.libComplexTypesMod.InclusiveDescendant
import typings.unistUtilVisitParents.libComplexTypesMod.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unist-util-visit/lib", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit/lib", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit/lib", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit/lib", "visit")
  @js.native
  val visit: (js.Function4[
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
  
  type BuildVisitor[Tree /* <: typings.unist.mod.Node[Data] */, Check /* <: typings.unistUtilIs.libMod.Test */] = BuildVisitorFromDescendants[InclusiveDescendant[Tree, Unit], Check]
  
  type BuildVisitorFromDescendants[Descendant /* <: typings.unist.mod.Node[Data] */, Check /* <: typings.unistUtilIs.libMod.Test */] = BuildVisitorFromMatch[Matches[Descendant, Check], Extract[Descendant, Parent]]
  
  type BuildVisitorFromMatch[Visited /* <: typings.unist.mod.Node[Data] */, Ancestor /* <: typings.unist.mod.Parent[typings.unist.mod.Node[Data], Data] */] = Visitor[Visited, ParentsOf[Ancestor, Visited]]
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Ancestor extends unist-util-visit.unist-util-visit/lib.Parent ? Child extends Ancestor['children'][number] ? Ancestor : never : never
    }}}
    */
  type ParentsOf[Ancestor /* <: typings.unist.mod.Node[Data] */, Child /* <: typings.unist.mod.Node[Data] */] = Ancestor
  
  type Test = typings.unistUtilIs.mod.Test
  
  type Visitor[Visited /* <: typings.unist.mod.Node[Data] */, Ancestor /* <: typings.unist.mod.Parent[typings.unist.mod.Node[Data], Data] */] = js.Function3[
    /* node */ Visited, 
    /* import warning: importer.ImportType#apply Failed type conversion: Visited extends unist-util-visit.unist-util-visit/lib.Node ? number | null : never */ /* index */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Ancestor extends unist-util-visit.unist-util-visit/lib.Node ? Ancestor | null : never */ /* parent */ js.Any, 
    VisitorResult
  ]
  
  type VisitorResult = typings.unistUtilVisitParents.libMod.VisitorResult
}
