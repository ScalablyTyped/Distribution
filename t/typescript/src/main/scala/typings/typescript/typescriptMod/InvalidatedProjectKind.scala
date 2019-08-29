package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InvalidatedProjectKind extends js.Object

@JSImport("typescript", "InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends js.Object {
  @js.native
  sealed trait Build extends InvalidatedProjectKind
  
  @js.native
  sealed trait UpdateBundle extends InvalidatedProjectKind
  
  @js.native
  sealed trait UpdateOutputFileStamps extends InvalidatedProjectKind
  
  /* 0 */ val Build: typings.typescript.typescriptMod.InvalidatedProjectKind.Build with Double = js.native
  /* 1 */ val UpdateBundle: typings.typescript.typescriptMod.InvalidatedProjectKind.UpdateBundle with Double = js.native
  /* 2 */ val UpdateOutputFileStamps: typings.typescript.typescriptMod.InvalidatedProjectKind.UpdateOutputFileStamps with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InvalidatedProjectKind with Double] = js.native
}

