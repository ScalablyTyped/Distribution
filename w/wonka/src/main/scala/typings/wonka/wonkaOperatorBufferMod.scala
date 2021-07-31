package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorBufferMod {
  
  @JSImport("wonka/src/operators/wonka_operator_buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buffer[A](signal: Source[js.Any]): Operator[A, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, js.Array[A]]]
}
