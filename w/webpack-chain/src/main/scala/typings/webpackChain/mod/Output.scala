package typings.webpackChain.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Output")
@js.native
class Output ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  def auxiliaryComment(value: String): this.type = js.native
  def auxiliaryComment(value: StringDictionary[String]): this.type = js.native
  def chunkFilename(value: String): this.type = js.native
  def chunkLoadTimeout(value: Double): this.type = js.native
  def crossOriginLoading(value: String): this.type = js.native
  def crossOriginLoading(value: Boolean): this.type = js.native
  def devtoolFallbackModuleFilenameTemplate(value: js.Any): this.type = js.native
  def devtoolLineToLine(value: js.Any): this.type = js.native
  def devtoolModuleFilenameTemplate(value: js.Any): this.type = js.native
  def devtoolNamespace(value: String): this.type = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def filename(value: String): this.type = js.native
  def futureEmitAssets(value: Boolean): this.type = js.native
  def globalObject(value: String): this.type = js.native
  def hashDigest(value: String): this.type = js.native
  def hashDigestLength(value: Double): this.type = js.native
  def hashFunction(value: String): this.type = js.native
  def hashSalt(value: js.Any): this.type = js.native
  def hotUpdateChunkFilename(value: String): this.type = js.native
  def hotUpdateFunction(value: js.Any): this.type = js.native
  def hotUpdateMainFilename(value: String): this.type = js.native
  def jsonpFunction(value: String): this.type = js.native
  def library(value: String): this.type = js.native
  def libraryExport(value: String): this.type = js.native
  def libraryExport(value: js.Array[String]): this.type = js.native
  def libraryTarget(value: String): this.type = js.native
  def path(value: String): this.type = js.native
  def pathinfo(value: Boolean): this.type = js.native
  def publicPath(value: String): this.type = js.native
  def sourceMapFilename(value: String): this.type = js.native
  def sourcePrefix(value: String): this.type = js.native
  def strictModuleExceptionHandling(value: Boolean): this.type = js.native
  def umdNamedDefine(value: Boolean): this.type = js.native
}

