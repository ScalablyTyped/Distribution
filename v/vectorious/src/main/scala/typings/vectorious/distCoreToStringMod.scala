package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreToStringMod {
  
  @JSImport("vectorious/dist/core/toString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  
  inline def toString_(x: ArrayLike[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(x: NDArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
}
