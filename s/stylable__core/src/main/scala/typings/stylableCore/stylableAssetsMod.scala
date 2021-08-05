package typings.stylableCore

import typings.postcss.mod.Declaration
import typings.postcss.mod.Root_
import typings.stylableCore.typesMod.ParsedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableAssetsMod {
  
  @JSImport("@stylable/core/cjs/stylable-assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assureRelativeUrlPrefix(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("assureRelativeUrlPrefix")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def collectAssets(ast: Root_): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectAssets")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def fixRelativeUrls(ast: Root_, originPath: String, targetPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixRelativeUrls")(ast.asInstanceOf[js.Any], originPath.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAsset(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsset")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExternal(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternal")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeAbsolute(resourcePath: String, rootContext: String, moduleContext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(resourcePath.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any], moduleContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def processDeclarationUrls(decl: Declaration, onUrl: OnUrlCallback, transform: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processDeclarationUrls")(decl.asInstanceOf[js.Any], onUrl.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type OnUrlCallback = js.Function1[/* node */ ParsedValue, Unit]
}
