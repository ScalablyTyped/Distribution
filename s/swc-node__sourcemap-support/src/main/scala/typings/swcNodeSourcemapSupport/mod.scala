package typings.swcNodeSourcemapSupport

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@swc-node/sourcemap-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@swc-node/sourcemap-support", "SourcemapMap")
  @js.native
  val SourcemapMap: Map[Any, Any] = js.native
  
  inline def installSourceMapSupport(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installSourceMapSupport")().asInstanceOf[Unit]
}
