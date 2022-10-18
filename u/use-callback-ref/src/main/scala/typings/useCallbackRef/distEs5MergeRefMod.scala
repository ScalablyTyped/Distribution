package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.useCallbackRef.distEs5TypesMod.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5MergeRefMod {
  
  @JSImport("use-callback-ref/dist/es5/mergeRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
}
