package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Extension extends StObject
@JSImport("typescript", "Extension")
@js.native
object Extension extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[Extension & java.lang.String] = js.native
  
  @js.native
  sealed trait Dts
    extends StObject
       with Extension
  /* ".d.ts" */ val Dts: typings.typescript.mod.Extension.Dts & java.lang.String = js.native
  
  @js.native
  sealed trait Js
    extends StObject
       with Extension
  /* ".js" */ val Js: typings.typescript.mod.Extension.Js & java.lang.String = js.native
  
  @js.native
  sealed trait Json
    extends StObject
       with Extension
  /* ".json" */ val Json: typings.typescript.mod.Extension.Json & java.lang.String = js.native
  
  @js.native
  sealed trait Jsx
    extends StObject
       with Extension
  /* ".jsx" */ val Jsx: typings.typescript.mod.Extension.Jsx & java.lang.String = js.native
  
  @js.native
  sealed trait Ts
    extends StObject
       with Extension
  /* ".ts" */ val Ts: typings.typescript.mod.Extension.Ts & java.lang.String = js.native
  
  @js.native
  sealed trait TsBuildInfo
    extends StObject
       with Extension
  /* ".tsbuildinfo" */ val TsBuildInfo: typings.typescript.mod.Extension.TsBuildInfo & java.lang.String = js.native
  
  @js.native
  sealed trait Tsx
    extends StObject
       with Extension
  /* ".tsx" */ val Tsx: typings.typescript.mod.Extension.Tsx & java.lang.String = js.native
}
