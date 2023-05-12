package typings.unistUtilIs

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unistUtilIs.libMod.Parent
import typings.unistUtilIs.unistUtilIsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-is", "convert")
  @js.native
  val convert: (js.Function1[
    /* test */ typings.unistUtilIs.libMod.PredicateTest[Node[Data]], 
    typings.unistUtilIs.libMod.AssertPredicate[Node[Data]]
  ]) & (js.Function1[
    /* test */ js.UndefOr[typings.unistUtilIs.libMod.Test], 
    typings.unistUtilIs.libMod.AssertAnything
  ]) = js.native
  
  @JSImport("unist-util-is", "is")
  @js.native
  val is: js.Function0[`false`] & (js.Function5[
    /* node */ Any, 
    /* test */ typings.unistUtilIs.libMod.PredicateTest[Node[Data]], 
    /* index */ Double, 
    /* parent */ Parent, 
    /* context */ js.UndefOr[Any], 
    /* is unist.unist.Node<unist.unist.Data> */ Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ typings.unistUtilIs.libMod.PredicateTest[Node[Data]], 
    /* index */ js.UndefOr[Null], 
    /* parent */ js.UndefOr[Null], 
    /* context */ js.UndefOr[Any], 
    /* is unist.unist.Node<unist.unist.Data> */ Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ typings.unistUtilIs.libMod.Test, 
    /* index */ Double, 
    /* parent */ Parent, 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ js.UndefOr[typings.unistUtilIs.libMod.Test], 
    /* index */ js.UndefOr[Null], 
    /* parent */ js.UndefOr[Null], 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) = js.native
  
  type AssertAnything = typings.unistUtilIs.libMod.AssertAnything
  
  type AssertPredicate[Kind /* <: Node[Data] */] = typings.unistUtilIs.libMod.AssertPredicate[Kind]
  
  type PredicateTest[Kind /* <: Node[Data] */] = typings.unistUtilIs.libMod.PredicateTest[Kind]
  
  type Test = typings.unistUtilIs.libMod.Test
  
  type TestFunctionAnything = typings.unistUtilIs.libMod.TestFunctionAnything
  
  type TestFunctionPredicate[Kind /* <: Node[Data] */] = typings.unistUtilIs.libMod.TestFunctionPredicate[Kind]
}
