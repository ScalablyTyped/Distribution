package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_skipUntil", JSImport.Namespace)
@js.native
object wonkaOperatorSkipUntilMod extends js.Object {
  
  def skipUntil[A](signal: Source[_]): Operator[A, A] = js.native
}
