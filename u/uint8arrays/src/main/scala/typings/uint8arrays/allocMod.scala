package typings.uint8arrays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allocMod {
  
  @JSImport("uint8arrays/types/src/alloc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")().asInstanceOf[js.typedarray.Uint8Array]
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def allocUnsafe(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")().asInstanceOf[js.typedarray.Uint8Array]
  inline def allocUnsafe(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
