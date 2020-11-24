package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_scan", JSImport.Namespace)
@js.native
object wonkaOperatorScanMod extends js.Object {
  
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = js.native
}
