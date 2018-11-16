package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", JSImport.Namespace)
@js.native
object terserModMembers extends js.Object {
  def Compressor(): AST_Toplevel = js.native
  def Compressor(options: CompressorOptions): AST_Toplevel = js.native
  def OutputStream(): OutputStream = js.native
  def OutputStream(options: BeautifierOptions): OutputStream = js.native
  def SourceMap(): SourceMap = js.native
  def SourceMap(options: SourceMapOptions): SourceMap = js.native
  def minify(files: js.Object): MinifyOutput = js.native
  def minify(files: js.Object, options: MinifyOptions): MinifyOutput = js.native
  def parse(code: java.lang.String): AST_Toplevel = js.native
  def parse(code: java.lang.String, options: ParseOptions): AST_Toplevel = js.native
}

