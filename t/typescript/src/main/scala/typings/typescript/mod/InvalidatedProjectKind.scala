package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvalidatedProjectKind extends js.Object
@JSImport("typescript", "InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InvalidatedProjectKind with Double] = js.native
  
  @js.native
  sealed trait Build extends InvalidatedProjectKind
  /* 0 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  @js.native
  sealed trait UpdateBundle extends InvalidatedProjectKind
  /* 1 */ @js.native
  object UpdateBundle extends TopLevel[UpdateBundle with Double]
  
  @js.native
  sealed trait UpdateOutputFileStamps extends InvalidatedProjectKind
  /* 2 */ @js.native
  object UpdateOutputFileStamps extends TopLevel[UpdateOutputFileStamps with Double]
}
