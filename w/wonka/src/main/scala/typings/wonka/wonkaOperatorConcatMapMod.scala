package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorConcatMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_concatMap", "concat")
  @js.native
  def concat[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_concatMap", "concatAll")
  @js.native
  def concatAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_concatMap", "concatMap")
  @js.native
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
