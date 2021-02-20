package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryFlags extends StObject
@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags with Double] = js.native
  
  @js.native
  sealed trait None extends WatchDirectoryFlags
  /* 0 */ val None: typings.typescript.mod.WatchDirectoryFlags.None with Double = js.native
  
  @js.native
  sealed trait Recursive extends WatchDirectoryFlags
  /* 1 */ val Recursive: typings.typescript.mod.WatchDirectoryFlags.Recursive with Double = js.native
}
