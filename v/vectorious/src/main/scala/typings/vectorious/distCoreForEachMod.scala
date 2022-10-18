package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import typings.vectorious.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreForEachMod {
  
  @JSImport("vectorious/dist/core/forEach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def forEach(x: NDArray, f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
