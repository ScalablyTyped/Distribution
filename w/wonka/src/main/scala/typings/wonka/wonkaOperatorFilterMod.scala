package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorFilterMod {
  
  @JSImport("wonka/src/operators/wonka_operator_filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
