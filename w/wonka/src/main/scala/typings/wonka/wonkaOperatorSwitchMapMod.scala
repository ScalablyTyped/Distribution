package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorSwitchMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_switchMap", "switchAll")
  @js.native
  def switchAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_switchMap", "switchMap")
  @js.native
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
