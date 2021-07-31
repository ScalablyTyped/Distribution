package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useConstMod {
  
  @JSImport("@uifabric/react-hooks/lib/useConst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useConst[T](initialValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useConst[T](initialValue: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
}
