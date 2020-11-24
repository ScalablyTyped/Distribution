package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_switchMap", JSImport.Namespace)
@js.native
object wonkaOperatorSwitchMapMod extends js.Object {
  
  def switchAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
}
