package typings.yargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPromiseMod {
  
  @JSImport("yargs/build/lib/is-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPromise[T](maybePromise: T): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(maybePromise.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  inline def isPromise[T](maybePromise: js.Promise[T]): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(maybePromise.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
}
