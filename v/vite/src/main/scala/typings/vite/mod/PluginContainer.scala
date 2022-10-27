package typings.vite.mod

import typings.rollup.mod.InputOptions
import typings.rollup.mod.LoadResult
import typings.rollup.mod.ModuleInfo
import typings.rollup.mod.PartialResolvedId
import typings.rollup.mod.SourceDescription
import typings.vite.anon.Custom
import typings.vite.anon.InMap
import typings.vite.anon.Ssr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginContainer extends StObject {
  
  def buildStart(options: InputOptions): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def getModuleInfo(id: String): ModuleInfo | Null = js.native
  
  def load(id: String): js.Promise[LoadResult | Null] = js.native
  def load(id: String, options: Ssr): js.Promise[LoadResult | Null] = js.native
  
  var options: InputOptions = js.native
  
  def resolveId(id: String): js.Promise[PartialResolvedId | Null] = js.native
  def resolveId(id: String, importer: String): js.Promise[PartialResolvedId | Null] = js.native
  def resolveId(id: String, importer: String, options: Custom): js.Promise[PartialResolvedId | Null] = js.native
  def resolveId(id: String, importer: Unit, options: Custom): js.Promise[PartialResolvedId | Null] = js.native
  
  def transform(code: String, id: String): js.Promise[SourceDescription | Null] = js.native
  def transform(code: String, id: String, options: InMap): js.Promise[SourceDescription | Null] = js.native
}
