package typings.wonka

import typings.wonka.distTypesTypesMod.Source
import typings.wonka.distTypesTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSinksMod {
  
  @JSImport("wonka/dist/types/sinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEach[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Unit]]
  
  inline def publish[T](source: Source[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subscribe[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Subscription]]
  
  inline def toArray[T](source: Source[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toPromise[T](source: Source[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
