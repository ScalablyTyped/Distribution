package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends StObject
@JSImport("typescript", "SemicolonPreference")
@js.native
object SemicolonPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemicolonPreference with java.lang.String] = js.native
  
  @js.native
  sealed trait Ignore extends SemicolonPreference
  /* "ignore" */ val Ignore: typings.typescript.mod.SemicolonPreference.Ignore with java.lang.String = js.native
  
  @js.native
  sealed trait Insert extends SemicolonPreference
  /* "insert" */ val Insert: typings.typescript.mod.SemicolonPreference.Insert with java.lang.String = js.native
  
  @js.native
  sealed trait Remove extends SemicolonPreference
  /* "remove" */ val Remove: typings.typescript.mod.SemicolonPreference.Remove with java.lang.String = js.native
}
