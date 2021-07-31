package typings.useCallbackRef

import typings.useCallbackRef.typesMod.ReactRef
import typings.useCallbackRef.typesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTransformRefMod {
  
  @JSImport("use-callback-ref/dist/es5/useTransformRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTransformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[RefObject[T]]
}
