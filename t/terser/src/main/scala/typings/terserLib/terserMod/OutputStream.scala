package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputStream extends js.Object {
  // If options.source_map is set, this will generate a source mapping between the given token (which should be an AST_Token-like {}) and the current line/col.
  // The name is optional; in most cases it will be inferred from the token.
  def add_mapping(token: AST_Node): scala.Unit = js.native
  // If options.source_map is set, this will generate a source mapping between the given token (which should be an AST_Token-like {}) and the current line/col.
  // The name is optional; in most cases it will be inferred from the token.
  def add_mapping(token: AST_Node, name: java.lang.String): scala.Unit = js.native
  // Returns the current column in the output (zero-based).
  def col(): scala.Double = js.native
  // Inserts a colon, and calls space() if options.space_colon is set.
  def colon(): scala.Unit = js.native
  // Inserts a comma, and calls space() — that is, if beautification is on you'll get a space after the comma.
  def comma(): scala.Unit = js.native
  // return the width of the current line text minus indentation.
  def current_width(): scala.Double = js.native
  // Always inserts a semicolon and clears the hint that a semicolon might be needed.
  def force_semicolon(): scala.Unit = js.native
  // Return the output so far as a string
  def get(): java.lang.String = js.native
  // Insert one indentation string (usually 4 characters).
  // Optionally pass true to indent half the width (I'm using that for case and default lines in switch blocks.
  // If beautify is off, this function does nothing.
  def indent(): scala.Unit = js.native
  // Insert one indentation string (usually 4 characters).
  // Optionally pass true to indent half the width (I'm using that for case and default lines in switch blocks.
  // If beautify is off, this function does nothing.
  def indent(half: scala.Boolean): scala.Unit = js.native
  // Return the current indentation width (not level; for example if we're in level 2 and indent_level is 4, this method would return 8.
  def indentation(): scala.Double = js.native
  // Returns the last printed chunk.
  def last(): java.lang.String = js.native
  // Returns the current line in the output (1-based).
  def line(): scala.Double = js.native
  // If beautification is on, this inserts a newline. Otherwise it does nothing.
  def newline(): scala.Unit = js.native
  // Returns the width of the next indentation level. For example if current level is 2 and options.indent_level is 4, it'll return 12.
  def next_indent(): scala.Double = js.native
  // Returns the option with the given name.
  def option(name: java.lang.String): js.Any = js.native
  // Returns the n-th parent node (where zero means the direct parent).
  def parent(n: scala.Double): AST_Node = js.native
  // Pops the top of the stack and returns it.
  def pop_node(): AST_Node = js.native
  // Include the given string into the output, adjusting current_line, current_col and current_pos accordingly.
  def print(str: java.lang.String): scala.Unit = js.native
  // Prints an identifier. If options.ascii_only is set, non-ASCII chars will be encoded with JavaScript conventions.
  def print_name(name: java.lang.String): scala.Unit = js.native
  // Prints a string. It adds quotes automatically.
  // It prefers double-quotes, but will actually count any quotes in the string and will use single-quotes if the output proves to be shorter (depending on how many backslashes it has to insert).
  // It encodes to ASCII if options.ascii_only is set.
  def print_string(str: java.lang.String): scala.Unit = js.native
  // Push the given node into an internal stack. This is used to keep track of current node's parent(s).
  def push_node(node: AST_Node): scala.Unit = js.native
  // If beautification is on it always inserts a semicolon.
  // Otherwise it saves a hint that a semicolon might be needed at current point.
  // The semicolon is inserted when the next output comes in, only if required to not break the JS syntax.
  def semicolon(): scala.Unit = js.native
  // Return true if current_width() is bigger than options.width (assuming options.width is non-null, non-zero).
  def should_break(): scala.Boolean = js.native
  // If beautification is on this always includes a space character.
  // Otherwise it saves a hint somewhere that a space might be needed at current point.
  // The space will go in at the next output but only when absolutely required, for example it will insert the space in return 10 but not in return"stuff".
  def space(): scala.Unit = js.native
  // Returns that internal stack.
  def stack(): js.Any = js.native
  // Encodes any non-ASCII characters in string with JavaScript's conventions (using \\uCODE).
  def to_ascii(str: java.lang.String): scala.Unit = js.native
  // This is used to output blocks in curly brackets.
  // It'll print an open bracket at current point, then call newline() and with the next indentation level it calls your func.
  // Lastly, it'll print an indented closing bracket. As usual, if beautification is off you'll just get {x} where x is whatever func outputs.
  def with_block(func: js.Function0[scala.Unit]): scala.Unit = js.native
  // Sets the current indentation to col (column), calls the function and thereafter restores the previous indentation level.
  // If beautification is off it simply calls func.
  def with_indent(col: scala.Double, func: js.Function0[scala.Unit]): scala.Unit = js.native
  // Adds parens around the output that your function prints.
  def with_parens(func: js.Function0[scala.Unit]): scala.Unit = js.native
  // Adds square brackets around the output that your function prints.
  def with_square(func: js.Function0[scala.Unit]): scala.Unit = js.native
}

