package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Extension extends StObject
@JSImport("typescript", "Extension")
@js.native
object Extension extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[Extension with java.lang.String] = js.native
  
  @js.native
  sealed trait Dts extends Extension
  /* ".d.ts" */ val Dts: typings.typescript.mod.Extension.Dts with java.lang.String = js.native
  
  @js.native
  sealed trait Js extends Extension
  /* ".js" */ val Js: typings.typescript.mod.Extension.Js with java.lang.String = js.native
  
  @js.native
  sealed trait Json extends Extension
  /* ".json" */ val Json: typings.typescript.mod.Extension.Json with java.lang.String = js.native
  
  @js.native
  sealed trait Jsx extends Extension
  /* ".jsx" */ val Jsx: typings.typescript.mod.Extension.Jsx with java.lang.String = js.native
  
  @js.native
  sealed trait Ts extends Extension
  /* ".ts" */ val Ts: typings.typescript.mod.Extension.Ts with java.lang.String = js.native
  
  @js.native
  sealed trait TsBuildInfo extends Extension
  /* ".tsbuildinfo" */ val TsBuildInfo: typings.typescript.mod.Extension.TsBuildInfo with java.lang.String = js.native
  
  @js.native
  sealed trait Tsx extends Extension
  /* ".tsx" */ val Tsx: typings.typescript.mod.Extension.Tsx with java.lang.String = js.native
}
