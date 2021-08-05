package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorScanMod {
  
  @JSImport("wonka/src/operators/wonka_operator_scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(f.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Operator[A, B]]
}
