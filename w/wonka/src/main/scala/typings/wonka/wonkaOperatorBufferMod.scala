package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_buffer", JSImport.Namespace)
@js.native
object wonkaOperatorBufferMod extends js.Object {
  
  def buffer[A](signal: Source[_]): Operator[A, js.Array[A]] = js.native
}
