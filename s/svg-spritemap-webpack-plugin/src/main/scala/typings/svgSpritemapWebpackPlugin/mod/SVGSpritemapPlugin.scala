package typings.svgSpritemapWebpackPlugin.mod

import typings.svgSpritemapWebpackPlugin.anon.Assets
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.asset
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.dir
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.module
import typings.webpack.mod.Plugin
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGSpritemapPlugin extends Plugin {
  val directories: js.Array[String] = js.native
  val files: js.Array[String] = js.native
  /* private */ def getContentHash(source: String): String = js.native
  /* private */ def getSpritemapHashes(compilation: Compilation): js.Array[String] = js.native
  /* private */ def getStylesHashes(compilation: Compilation): js.Array[String] = js.native
  /* private */ def getStylesType(styles: js.Object): js.UndefOr[asset | dir | module] = js.native
  /* private */ def getStylesType(styles: js.Object, filename: String): js.UndefOr[asset | dir | module] = js.native
  /* private */ def hashFilename(fileaname: String): String = js.native
  /* private */ def hashFilename(fileaname: String, hashes: js.Array[String]): String = js.native
  /* private */ def rewriteAssetsHashes(filename: String): Assets = js.native
  /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object): Assets = js.native
  /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object, hashes: js.Array[String]): Assets = js.native
  /* private */ def updateDependencies(): Unit = js.native
  /* private */ def writeStylesToDisk(styles: js.Object, `type`: String): Unit = js.native
}

