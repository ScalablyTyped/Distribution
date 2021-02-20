package typings.stylableCore

import typings.postcss.mod.Declaration
import typings.postcss.mod.Root_
import typings.stylableCore.typesMod.ParsedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableAssetsMod {
  
  @JSImport("@stylable/core/cjs/stylable-assets", "assureRelativeUrlPrefix")
  @js.native
  def assureRelativeUrlPrefix(url: String): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "collectAssets")
  @js.native
  def collectAssets(ast: Root_): js.Array[String] = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "fixRelativeUrls")
  @js.native
  def fixRelativeUrls(ast: Root_, originPath: String, targetPath: String): Unit = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "isAsset")
  @js.native
  def isAsset(url: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "isExternal")
  @js.native
  def isExternal(url: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "makeAbsolute")
  @js.native
  def makeAbsolute(resourcePath: String, rootContext: String, moduleContext: String): String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-assets", "processDeclarationUrls")
  @js.native
  def processDeclarationUrls(decl: Declaration, onUrl: OnUrlCallback, transform: Boolean): Unit = js.native
  
  type OnUrlCallback = js.Function1[/* node */ ParsedValue, Unit]
}
