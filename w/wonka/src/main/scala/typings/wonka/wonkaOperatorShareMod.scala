package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorShareMod {
  
  @JSImport("wonka/src/operators/wonka_operator_share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def share[A](source: Source[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
