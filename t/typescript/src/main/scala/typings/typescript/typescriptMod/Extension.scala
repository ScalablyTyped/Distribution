package typings.typescript.typescriptMod

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
  
  /* ".d.ts" */ val Dts: typings.typescript.typescriptMod.Extension.Dts with String = js.native
  /* ".js" */ val Js: typings.typescript.typescriptMod.Extension.Js with String = js.native
  /* ".json" */ val Json: typings.typescript.typescriptMod.Extension.Json with String = js.native
  /* ".jsx" */ val Jsx: typings.typescript.typescriptMod.Extension.Jsx with String = js.native
  /* ".ts" */ val Ts: typings.typescript.typescriptMod.Extension.Ts with String = js.native
  /* ".tsbuildinfo" */ val TsBuildInfo: typings.typescript.typescriptMod.Extension.TsBuildInfo with String = js.native
  /* ".tsx" */ val Tsx: typings.typescript.typescriptMod.Extension.Tsx with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Extension with String] = js.native
}

