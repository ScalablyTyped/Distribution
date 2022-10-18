package typings.upath2

import typings.upath2.anon.PickIPathsepname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFixMod {
  
  @JSImport("upath2/lib/fix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixSpecial[T /* <: String */](who: PickIPathsepname, path: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_fix_special")(who.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fixSpecial[T /* <: String */](who: PickIPathsepname, path: T, returnOldIfNoPreset: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_fix_special")(who.asInstanceOf[js.Any], path.asInstanceOf[js.Any], returnOldIfNoPreset.asInstanceOf[js.Any])).asInstanceOf[T]
}
