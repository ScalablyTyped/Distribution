package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvalidatedProjectKind extends StObject
@JSImport("typescript", "InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InvalidatedProjectKind with Double] = js.native
  
  @js.native
  sealed trait Build extends InvalidatedProjectKind
  /* 0 */ val Build: typings.typescript.mod.InvalidatedProjectKind.Build with Double = js.native
  
  @js.native
  sealed trait UpdateBundle extends InvalidatedProjectKind
  /* 1 */ val UpdateBundle: typings.typescript.mod.InvalidatedProjectKind.UpdateBundle with Double = js.native
  
  @js.native
  sealed trait UpdateOutputFileStamps extends InvalidatedProjectKind
  /* 2 */ val UpdateOutputFileStamps: typings.typescript.mod.InvalidatedProjectKind.UpdateOutputFileStamps with Double = js.native
}
