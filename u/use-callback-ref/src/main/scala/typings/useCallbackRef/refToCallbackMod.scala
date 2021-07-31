package typings.useCallbackRef

import typings.useCallbackRef.typesMod.ReactRef
import typings.useCallbackRef.typesMod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refToCallbackMod {
  
  @JSImport("use-callback-ref/dist/es5/refToCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def refToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  @scala.inline
  def useRefToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
}
