package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(value: java.lang.String): js.UndefOr[Extension with java.lang.String] = js.native
  /* ".d.ts" */ @js.native
  object Dts
    extends TopLevel[Dts with java.lang.String]
  
  /* ".js" */ @js.native
  object Js
    extends TopLevel[Js with java.lang.String]
  
  /* ".json" */ @js.native
  object Json
    extends TopLevel[Json with java.lang.String]
  
  /* ".jsx" */ @js.native
  object Jsx
    extends TopLevel[Jsx with java.lang.String]
  
  /* ".ts" */ @js.native
  object Ts
    extends TopLevel[Ts with java.lang.String]
  
  /* ".tsbuildinfo" */ @js.native
  object TsBuildInfo
    extends TopLevel[TsBuildInfo with java.lang.String]
  
  /* ".tsx" */ @js.native
  object Tsx
    extends TopLevel[Tsx with java.lang.String]
  
}

