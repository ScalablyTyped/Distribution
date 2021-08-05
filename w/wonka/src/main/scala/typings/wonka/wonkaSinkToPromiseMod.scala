package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSinkToPromiseMod {
  
  @JSImport("wonka/src/web/wonka_sink_toPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toPromise[A](source: Source[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
}
