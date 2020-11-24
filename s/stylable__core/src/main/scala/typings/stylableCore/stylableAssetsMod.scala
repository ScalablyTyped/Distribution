package typings.stylableCore

import typings.postcss.mod.Declaration
import typings.postcss.mod.Root_
import typings.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-assets", JSImport.Namespace)
@js.native
object stylableAssetsMod extends js.Object {
  
  def assureRelativeUrlPrefix(url: String): String = js.native
  
  def collectAssets(ast: Root_): js.Array[String] = js.native
  
  def fixRelativeUrls(ast: Root_, originPath: String, targetPath: String): Unit = js.native
  
  def isAsset(url: String): Boolean = js.native
  
  def isExternal(url: String): Boolean = js.native
  
  def makeAbsolute(resourcePath: String, rootContext: String, moduleContext: String): String = js.native
  
  def processDeclarationUrls(decl: Declaration, onUrl: OnUrlCallback, transform: Boolean): Unit = js.native
  
  type OnUrlCallback = js.Function1[/* node */ ParsedValue, Unit]
}
