package typings.unistUtilIs

import typings.std.Partial
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilIs.unistUtilIsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unist-util-is/lib", "convert")
  @js.native
  val convert: (js.Function1[
    /* test */ PredicateTest[typings.unist.mod.Node[Data]], 
    AssertPredicate[typings.unist.mod.Node[Data]]
  ]) & (js.Function1[/* test */ js.UndefOr[Test], AssertAnything]) = js.native
  
  @JSImport("unist-util-is/lib", "is")
  @js.native
  val is: js.Function0[`false`] & (js.Function5[
    /* node */ Any, 
    /* test */ PredicateTest[typings.unist.mod.Node[Data]], 
    /* index */ Double, 
    /* parent */ Parent, 
    /* context */ js.UndefOr[Any], 
    /* is unist.unist.Node<unist.unist.Data> */ Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ PredicateTest[typings.unist.mod.Node[Data]], 
    /* index */ js.UndefOr[Null], 
    /* parent */ js.UndefOr[Null], 
    /* context */ js.UndefOr[Any], 
    /* is unist.unist.Node<unist.unist.Data> */ Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ Test, 
    /* index */ Double, 
    /* parent */ Parent, 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ js.UndefOr[Test], 
    /* index */ js.UndefOr[Null], 
    /* parent */ js.UndefOr[Null], 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) = js.native
  
  type AssertAnything = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean
  ]
  
  type AssertPredicate[Kind /* <: typings.unist.mod.Node[Data] */] = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is Kind */ Boolean
  ]
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type PredicateTest[Kind /* <: typings.unist.mod.Node[Data] */] = (/* import warning: importer.ImportType#apply Failed type conversion: Kind['type'] */ js.Any) | Partial[Kind] | TestFunctionPredicate[Kind] | (js.Array[
    (/* import warning: importer.ImportType#apply Failed type conversion: Kind['type'] */ js.Any) | Partial[Kind] | TestFunctionPredicate[Kind]
  ])
  
  type Props = Record[String, Any]
  
  type Test = js.UndefOr[
    Null | String | Props | TestFunctionAnything | (js.Array[String | Props | TestFunctionAnything])
  ]
  
  type TestFunctionAnything = js.ThisFunction3[
    /* this */ Any, 
    /* node */ Node, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean | Unit
  ]
  
  type TestFunctionPredicate[Kind /* <: typings.unist.mod.Node[Data] */] = js.Function3[
    /* node */ Node, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is Kind */ Boolean
  ]
}
