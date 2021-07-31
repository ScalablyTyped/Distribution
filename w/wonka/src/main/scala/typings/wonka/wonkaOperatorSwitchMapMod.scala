package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorSwitchMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_switchMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def switchAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
}
