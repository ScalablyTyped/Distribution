package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.SemicolonPreference.Ignore
import typings.typescript.typescriptMod.SemicolonPreference.Insert
import typings.typescript.typescriptMod.SemicolonPreference.Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemicolonPreference extends js.Object

@JSImport("typescript", "SemicolonPreference")
@js.native
object SemicolonPreference extends js.Object {
  @js.native
  sealed trait Ignore extends SemicolonPreference
  
  @js.native
  sealed trait Insert extends SemicolonPreference
  
  @js.native
  sealed trait Remove extends SemicolonPreference
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemicolonPreference with String] = js.native
  /* "ignore" */ @js.native
  object Ignore extends TopLevel[Ignore with String]
  
  /* "insert" */ @js.native
  object Insert extends TopLevel[Insert with String]
  
  /* "remove" */ @js.native
  object Remove extends TopLevel[Remove with String]
  
}

