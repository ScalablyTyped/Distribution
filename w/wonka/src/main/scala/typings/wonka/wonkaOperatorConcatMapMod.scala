package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_concatMap", JSImport.Namespace)
@js.native
object wonkaOperatorConcatMapMod extends js.Object {
  
  def concat[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  def concatAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
