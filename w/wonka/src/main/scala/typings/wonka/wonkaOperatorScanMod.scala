package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorScanMod {
  
  @JSImport("wonka/src/operators/wonka_operator_scan", "scan")
  @js.native
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = js.native
}
