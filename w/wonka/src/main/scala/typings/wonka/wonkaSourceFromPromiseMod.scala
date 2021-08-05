package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromPromiseMod {
  
  @JSImport("wonka/src/web/wonka_source_fromPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPromise[A](promise: js.Promise[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
