package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorMergeMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_mergeMap", "flatten")
  @js.native
  def flatten[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_mergeMap", "merge")
  @js.native
  def merge[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_mergeMap", "mergeAll")
  @js.native
  def mergeAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_mergeMap", "mergeMap")
  @js.native
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
