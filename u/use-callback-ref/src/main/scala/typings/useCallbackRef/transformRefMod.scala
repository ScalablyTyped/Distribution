package typings.useCallbackRef

import typings.useCallbackRef.typesMod.ReactRef
import typings.useCallbackRef.typesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformRefMod {
  
  @JSImport("use-callback-ref/dist/es5/transformRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[RefObject[T]]
}
