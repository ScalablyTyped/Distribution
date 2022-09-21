package typings.vfileSort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sort[F /* <: typings.vfile.mod.VFile */](file: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(file.asInstanceOf[js.Any]).asInstanceOf[F]
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileMessage = typings.vfileMessage.mod.VFileMessage
}
