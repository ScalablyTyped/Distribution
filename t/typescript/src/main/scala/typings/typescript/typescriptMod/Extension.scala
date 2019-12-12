package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.Extension.Dts
import typings.typescript.typescriptMod.Extension.Js
import typings.typescript.typescriptMod.Extension.Json
import typings.typescript.typescriptMod.Extension.Jsx
import typings.typescript.typescriptMod.Extension.Ts
import typings.typescript.typescriptMod.Extension.TsBuildInfo
import typings.typescript.typescriptMod.Extension.Tsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Extension extends js.Object

@JSImport("typescript", "Extension")
@js.native
object Extension extends js.Object {
  @js.native
  sealed trait Dts extends Extension
  
  @js.native
  sealed trait Js extends Extension
  
  @js.native
  sealed trait Json extends Extension
  
  @js.native
  sealed trait Jsx extends Extension
  
  @js.native
  sealed trait Ts extends Extension
  
  @js.native
  sealed trait TsBuildInfo extends Extension
  
  @js.native
  sealed trait Tsx extends Extension
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Extension with String] = js.native
  /* ".d.ts" */ @js.native
  object Dts extends TopLevel[Dts with String]
  
  /* ".js" */ @js.native
  object Js extends TopLevel[Js with String]
  
  /* ".json" */ @js.native
  object Json extends TopLevel[Json with String]
  
  /* ".jsx" */ @js.native
  object Jsx extends TopLevel[Jsx with String]
  
  /* ".ts" */ @js.native
  object Ts extends TopLevel[Ts with String]
  
  /* ".tsbuildinfo" */ @js.native
  object TsBuildInfo extends TopLevel[TsBuildInfo with String]
  
  /* ".tsx" */ @js.native
  object Tsx extends TopLevel[Tsx with String]
  
}

