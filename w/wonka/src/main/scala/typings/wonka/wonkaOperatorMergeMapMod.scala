package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorMergeMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_mergeMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  inline def merge[A](sources: js.Array[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  inline def mergeAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  inline def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
}
