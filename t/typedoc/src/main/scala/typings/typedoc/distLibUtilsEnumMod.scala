package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsEnumMod {
  
  @JSImport("typedoc/dist/lib/utils/enum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnumFlags[T /* <: Double */](flags: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumFlags")(flags.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def hasAllFlags(flags: Double, check: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAllFlags")(flags.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasAnyFlag(flags: Double, check: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAnyFlag")(flags.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeFlag[T /* <: Double */](flag: T, remove: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFlag")(flag.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[T]
}
