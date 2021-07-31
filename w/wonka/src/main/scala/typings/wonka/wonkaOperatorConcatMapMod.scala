package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorConcatMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_concatMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concat[A](sources: js.Array[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def concatAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
}
