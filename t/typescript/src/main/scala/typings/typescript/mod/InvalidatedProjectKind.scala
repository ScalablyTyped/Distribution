package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvalidatedProjectKind extends StObject
@JSImport("typescript", "InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InvalidatedProjectKind & Double] = js.native
  
  @js.native
  sealed trait Build
    extends StObject
       with InvalidatedProjectKind
  /* 0 */ val Build: typings.typescript.mod.InvalidatedProjectKind.Build & Double = js.native
  
  @js.native
  sealed trait UpdateBundle
    extends StObject
       with InvalidatedProjectKind
  /* 1 */ val UpdateBundle: typings.typescript.mod.InvalidatedProjectKind.UpdateBundle & Double = js.native
  
  @js.native
  sealed trait UpdateOutputFileStamps
    extends StObject
       with InvalidatedProjectKind
  /* 2 */ val UpdateOutputFileStamps: typings.typescript.mod.InvalidatedProjectKind.UpdateOutputFileStamps & Double = js.native
}
