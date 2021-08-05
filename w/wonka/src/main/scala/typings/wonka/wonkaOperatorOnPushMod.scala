package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorOnPushMod {
  
  @JSImport("wonka/src/operators/wonka_operator_onPush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  inline def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
