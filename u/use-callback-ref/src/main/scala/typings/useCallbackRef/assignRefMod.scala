package typings.useCallbackRef

import typings.useCallbackRef.typesMod.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignRefMod {
  
  @JSImport("use-callback-ref/dist/es5/assignRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assignRef[T](ref: ReactRef[T]): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any]).asInstanceOf[ReactRef[T]]
  @scala.inline
  def assignRef[T](ref: ReactRef[T], value: T): ReactRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReactRef[T]]
}
