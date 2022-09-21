package typings.useGestureCore

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/utils/fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignDefault[T /* <: js.Object */](value: Unit, fallback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignDefault")(value.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assignDefault[T /* <: js.Object */](value: Partial[T], fallback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignDefault")(value.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def call[T](v: T, args: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(List(v.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  inline def call[T](v: js.Function1[/* repeated */ Any, T], args: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(List(v.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  inline def chain(fns: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
