package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "AST_Toplevel")
@js.native
class AST_Toplevel () extends AST_Node {
  // Get names that are optimized for GZip compression (names will be generated using the most frequent characters first)
  def compute_char_frequency(): scala.Unit = js.native
  // Terser contains a scope analyzer which figures out variable/function definitions, references etc.
  // You need to call it manually before compression or mangling.
  // The figure_out_scope method is defined only on the AST_Toplevel node.
  def figure_out_scope(): scala.Unit = js.native
  def mangle_names(): scala.Unit = js.native
  def print(stream: OutputStream): scala.Unit = js.native
  def print_to_string(): java.lang.String = js.native
  def print_to_string(options: BeautifierOptions): java.lang.String = js.native
}

