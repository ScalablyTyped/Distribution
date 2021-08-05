package typings.tspromise

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tspromise", JSImport.Namespace)
  @js.native
  class ^[T] protected ()
    extends StObject
       with Thenable[T] {
    def this(callback: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T], Unit], 
            /* reject */ js.UndefOr[js.Function1[/* error */ Error, Unit]], 
            Unit
          ]) = this()
  }
  @JSImport("tspromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def all(promises: js.Array[Thenable[js.Any]]): Thenable[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[js.Any]]]
  
  /* static member */
  inline def async[TR](callback: js.Function0[TR]): js.Function0[Thenable[TR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Thenable[TR]]]
  /* static member */
  inline def async[T1, TR](callback: js.Function1[/* p1 */ T1, TR]): js.Function1[/* p1 */ T1, Thenable[TR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p1 */ T1, Thenable[TR]]]
  /* static member */
  inline def async[T1, T2, TR](callback: js.Function2[/* p1 */ T1, /* p2 */ T2, TR]): js.Function2[/* p1 */ T1, /* p2 */ T2, Thenable[TR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* p1 */ T1, /* p2 */ T2, Thenable[TR]]]
  /* static member */
  inline def async[T1, T2, T3, TR](callback: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, TR]): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, Thenable[TR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, Thenable[TR]]]
  /* static member */
  inline def async[T1, T2, T3, T4, TR](callback: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, TR]): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, Thenable[TR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, Thenable[TR]]]
  
  /* static member */
  inline def nfcall[T](obj: js.Any, methodName: String, args: js.Any*): Thenable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nfcall")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Thenable[T]]
  
  /* static member */
  inline def reject[T](error: Error): Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(error.asInstanceOf[js.Any]).asInstanceOf[Thenable[T]]
  
  /* static member */
  inline def resolve[T](): Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Thenable[T]]
  /* static member */
  inline def resolve[T](promise: Thenable[T]): Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(promise.asInstanceOf[js.Any]).asInstanceOf[Thenable[T]]
  inline def resolve[T](value: T): Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[Thenable[T]]
  
  /* static member */
  inline def rewriteFolderSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriteFolderSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def spawn[TR](generatorFunction: js.Function0[TR]): Thenable[TR] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[Thenable[TR]]
  
  /* static member */
  inline def waitAsync(time: Double): Thenable[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitAsync")(time.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Object]]
  
  type Promise[T] = Thenable[T]
}
