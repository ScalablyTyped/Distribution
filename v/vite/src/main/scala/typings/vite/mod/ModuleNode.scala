package typings.vite.mod

import typings.rollup.mod.ModuleInfo
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.vite.viteStrings.css
import typings.vite.viteStrings.js_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vite", "ModuleNode")
@js.native
open class ModuleNode protected () extends StObject {
  /**
    * @param setIsSelfAccepting - set `false` to set `isSelfAccepting` later. e.g. #7870
    */
  def this(url: String) = this()
  def this(url: String, setIsSelfAccepting: Boolean) = this()
  
  var acceptedHmrDeps: Set[ModuleNode] = js.native
  
  var acceptedHmrExports: Set[String] | Null = js.native
  
  var file: String | Null = js.native
  
  /**
    * Resolved file system path + query
    */
  var id: String | Null = js.native
  
  var importedBindings: (Map[String, Set[String]]) | Null = js.native
  
  var importedModules: Set[ModuleNode] = js.native
  
  var importers: Set[ModuleNode] = js.native
  
  var info: js.UndefOr[ModuleInfo] = js.native
  
  var isSelfAccepting: js.UndefOr[Boolean] = js.native
  
  var lastHMRTimestamp: Double = js.native
  
  var lastInvalidationTimestamp: Double = js.native
  
  var meta: js.UndefOr[Record[String, Any]] = js.native
  
  var ssrError: js.Error | Null = js.native
  
  var ssrModule: (Record[String, Any]) | Null = js.native
  
  var ssrTransformResult: TransformResult | Null = js.native
  
  var transformResult: TransformResult | Null = js.native
  
  var `type`: js_ | css = js.native
  
  /**
    * Public served url path, starts with /
    */
  var url: String = js.native
}
