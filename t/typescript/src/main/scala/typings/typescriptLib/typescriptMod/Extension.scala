package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Extension extends js.Object

@JSImport("typescript", "Extension")
@js.native
object Extension extends js.Object {
  @js.native
  sealed trait Dts
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait Js
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait Json
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait Jsx
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait Ts
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait TsBuildInfo
    extends typescriptLib.typescriptMod.Extension
  
  @js.native
  sealed trait Tsx
    extends typescriptLib.typescriptMod.Extension
  
  /* ".d.ts" */ val Dts: Dts with java.lang.String = js.native
  /* ".js" */ val Js: Js with java.lang.String = js.native
  /* ".json" */ val Json: Json with java.lang.String = js.native
  /* ".jsx" */ val Jsx: Jsx with java.lang.String = js.native
  /* ".ts" */ val Ts: Ts with java.lang.String = js.native
  /* ".tsbuildinfo" */ val TsBuildInfo: TsBuildInfo with java.lang.String = js.native
  /* ".tsx" */ val Tsx: Tsx with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.Extension with java.lang.String] = js.native
}

