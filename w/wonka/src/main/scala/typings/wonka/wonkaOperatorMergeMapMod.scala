package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_mergeMap", JSImport.Namespace)
@js.native
object wonkaOperatorMergeMapMod extends js.Object {
  
  def flatten[A](source: Source[Source[A]]): Source[A] = js.native
  
  def merge[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  def mergeAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
