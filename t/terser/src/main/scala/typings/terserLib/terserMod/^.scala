package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Compressor(): terserLib.terserMod.AST_Toplevel = js.native
  def Compressor(options: terserLib.terserMod.CompressorOptions): terserLib.terserMod.AST_Toplevel = js.native
  def OutputStream(): terserLib.terserMod.OutputStream = js.native
  def OutputStream(options: terserLib.terserMod.BeautifierOptions): terserLib.terserMod.OutputStream = js.native
  def SourceMap(): terserLib.terserMod.SourceMap = js.native
  def SourceMap(options: terserLib.terserMod.SourceMapOptions): terserLib.terserMod.SourceMap = js.native
  def minify(files: js.Object): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: js.Object, options: terserLib.terserMod.MinifyOptions): terserLib.terserMod.MinifyOutput = js.native
  def parse(code: java.lang.String): terserLib.terserMod.AST_Toplevel = js.native
  def parse(code: java.lang.String, options: terserLib.terserMod.ParseOptions): terserLib.terserMod.AST_Toplevel = js.native
}

