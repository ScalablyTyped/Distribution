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
  sealed trait Cjs
    extends StObject
       with Extension
  /* ".cjs" */ val Cjs: typings.typescript.mod.Extension.Cjs & java.lang.String = js.native
  
  @js.native
  sealed trait Cts
    extends StObject
       with Extension
  /* ".cts" */ val Cts: typings.typescript.mod.Extension.Cts & java.lang.String = js.native
  
  @js.native
  sealed trait Dcts
    extends StObject
       with Extension
  /* ".d.cts" */ val Dcts: typings.typescript.mod.Extension.Dcts & java.lang.String = js.native
  
  @js.native
  sealed trait Dmts
    extends StObject
       with Extension
  /* ".d.mts" */ val Dmts: typings.typescript.mod.Extension.Dmts & java.lang.String = js.native
  
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
  sealed trait Mjs
    extends StObject
       with Extension
  /* ".mjs" */ val Mjs: typings.typescript.mod.Extension.Mjs & java.lang.String = js.native
  
  @js.native
  sealed trait Mts
    extends StObject
       with Extension
  /* ".mts" */ val Mts: typings.typescript.mod.Extension.Mts & java.lang.String = js.native
  
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
