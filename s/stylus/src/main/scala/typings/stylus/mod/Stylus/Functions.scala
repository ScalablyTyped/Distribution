package typings.stylus.mod.Stylus

import typings.stylus.mod.Stylus.Nodes.Block
import typings.stylus.mod.Stylus.Nodes.Boolean
import typings.stylus.mod.Stylus.Nodes.Expression
import typings.stylus.mod.Stylus.Nodes.HSLA
import typings.stylus.mod.Stylus.Nodes.Ident
import typings.stylus.mod.Stylus.Nodes.Literal
import typings.stylus.mod.Stylus.Nodes.Node
import typings.stylus.mod.Stylus.Nodes.Null
import typings.stylus.mod.Stylus.Nodes.Number
import typings.stylus.mod.Stylus.Nodes.Object
import typings.stylus.mod.Stylus.Nodes.Property
import typings.stylus.mod.Stylus.Nodes.RGBA
import typings.stylus.mod.Stylus.Nodes.String
import typings.stylus.mod.Stylus.Nodes.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Functions extends js.Object {
  
  /**
    * Return the opposites of the given `positions`.
    */
  def `-math-prop`(prop: String): Unit = js.native
  
  /**
    * Prefix css classes in a block
    */
  def `-prefix-classes`(prefix: String, block: Block): Block = js.native
  
  /**
    * Add property `name` with the given `expr` to the mixin-able block.
    */
  def `add-property`(name: String, expr: Expression): Property = js.native
  
  def adjust(hsla: HSLA, prop: String, amount: Unit): RGBA = js.native
  /**
    * Adjust HSL `color` `prop` by `amount`.
    */
  def adjust(rgba: RGBA, prop: String, amount: Unit): RGBA = js.native
  
  def alpha(color: HSLA): Unit = js.native
  def alpha(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the alpha component of the given `color`,
    * or set the alpha component to the optional second `value` argument.
    */
  def alpha(color: RGBA): Unit = js.native
  def alpha(color: RGBA, value: Unit): RGBA = js.native
  
  /**
    * Return a `Literal` `num` converted to the provided `base`, padded to `width`
    * with zeroes (default width is 2)
    */
  def `base-convert`(num: Number, base: Number, width: Number): Literal = js.native
  
  /**
    * Return component `name` for the given `color`.
    */
  def basename(path: String): java.lang.String = js.native
  def basename(path: String, ext: String): java.lang.String = js.native
  
  def blend(top: HSLA): RGBA = js.native
  def blend(top: HSLA, bottom: HSLA): RGBA = js.native
  def blend(top: HSLA, bottom: RGBA): RGBA = js.native
  /**
    * Blend the `top` color over the `bottom`
    */
  def blend(top: RGBA): RGBA = js.native
  def blend(top: RGBA, bottom: HSLA): RGBA = js.native
  def blend(top: RGBA, bottom: RGBA): RGBA = js.native
  
  def blue(color: HSLA): Unit = js.native
  def blue(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the blue component of the given `color`,
    * or set the blue component to the optional second `value` argument.
    */
  def blue(color: RGBA): Unit = js.native
  def blue(color: RGBA, value: Unit): RGBA = js.native
  
  /**
    * Return a clone of the given `expr`.
    */
  def clone(expr: Expression): Expression = js.native
  
  def component(color: HSLA, name: String): Unit = js.native
  /**
    * Return component `name` for the given `color`.
    */
  def component(color: RGBA, name: String): Unit = js.native
  
  def contrast(top: HSLA): Object = js.native
  def contrast(top: HSLA, bottom: HSLA): Object = js.native
  def contrast(top: HSLA, bottom: RGBA): Object = js.native
  /**
    * Returns the contrast ratio object between `top` and `bottom` colors,
    * based on http://leaverou.github.io/contrast-ratio/
    * and https://github.com/LeaVerou/contrast-ratio/blob/gh-pages/color.js#L108
    */
  def contrast(top: RGBA): Object = js.native
  def contrast(top: RGBA, bottom: HSLA): Object = js.native
  def contrast(top: RGBA, bottom: RGBA): Object = js.native
  
  /**
    * Like `unquote` but tries to convert the given `str` to a Stylus node.
    */
  def convert(str: String): Node = js.native
  
  /**
    * Returns the @media string for the current block
    */
  def `current-media`(): String = js.native
  
  /**
    * Set a variable `name` on current scope.
    */
  def define(name: String, expr: Expression): Node = js.native
  
  /**
    * Return the dirname of `path`.
    */
  def dirname(path: String): java.lang.String = js.native
  
  /**
    * Throw an error with the given `msg`.
    */
  def error(msg: String): scala.Unit = js.native
  
  /**
    * Merge the object `dest` with the given args.
    */
  def extend(dest: Object, objs: Object*): Object = js.native
  
  /**
    * Return the extension of `path`.
    */
  def extname(path: String): java.lang.String = js.native
  
  def green(color: HSLA): Unit = js.native
  def green(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the green component of the given `color`,
    * or set the green component to the optional second `value` argument.
    */
  def green(color: RGBA): Unit = js.native
  def green(color: RGBA, value: Unit): RGBA = js.native
  
  def hsl(hsla: HSLA): HSLA = js.native
  def hsl(hue: Unit, saturation: Unit, lightness: Unit): HSLA = js.native
  /**
    * Convert the given `color` to an `HSLA` node,
    * or h,s,l component values.
    */
  def hsl(rgba: RGBA): HSLA = js.native
  
  def hsla(hsla: HSLA): HSLA = js.native
  def hsla(hue: Unit, saturation: Unit, lightness: Unit, alpha: Unit): HSLA = js.native
  /**
    * Convert the given `color` to an `HSLA` node,
    * or h,s,l,a component values.
    */
  def hsla(rgba: RGBA): HSLA = js.native
  
  def hue(color: HSLA): Unit = js.native
  def hue(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the hue component of the given `color`,
    * or set the hue component to the optional second `value` argument.
    */
  def hue(color: RGBA): Unit = js.native
  def hue(color: RGBA, value: Unit): RGBA = js.native
  
  /**
    * Return the width and height of the given `img` path.
    */
  def `image-size`(img: String, ignoreErr: Boolean): Expression = js.native
  
  /**
    * Convert a .json file into stylus variables or object.
    * Nested variable object keys are joined with a dash (-)
    *
    * Given this sample media-queries.json file:
    * {
    *   "small": "screen and (max-width:400px)",
    *   "tablet": {
    *     "landscape": "screen and (min-width:600px) and (orientation:landscape)",
    *     "portrait": "screen and (min-width:600px) and (orientation:portrait)"
    *   }
    * }
    */
  def json(path: String, local: Boolean, namePrefix: String): js.Any = js.native
  
  /**
    * Inspect the given `expr`.
    */
  def length(expr: Expression*): Null = js.native
  /**
    * Return length of the given `expr`.
    */
  def length(expr: Expression): Unit = js.native
  
  def lightness(color: HSLA): Unit = js.native
  def lightness(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the lightness component of the given `color`,
    * or set the lightness component to the optional second `value` argument.
    */
  def lightness(color: RGBA): Unit = js.native
  def lightness(color: RGBA, value: Unit): RGBA = js.native
  
  /**
    * Return the separator of the given `list`.
    */
  def `list-separator`(list: Expression): String = js.native
  
  /**
    * Lookup variable `name` or return Null.
    */
  def lookup(name: String): Node = js.native
  
  def luminosity(rgba: HSLA): Unit = js.native
  /**
    * Returns the relative luminance of the given `color`,
    * see http://www.w3.org/TR/WCAG20/#relativeluminancedef
    */
  def luminosity(rgba: RGBA): Unit = js.native
  
  def `match`(pattern: String, `val`: Ident): Boolean = js.native
  /**
    * Test if `val` matches the given `pattern`.
    */
  def `match`(pattern: String, `val`: String): Boolean = js.native
  
  /**
    * Return the tangent of the given `angle`.
    */
  def math(n: Unit, fn: String): Unit = js.native
  
  /**
    * Merge the object `dest` with the given args.
    */
  def merge(dest: Object, objs: Object*): Object = js.native
  
  /**
    * Perform `op` on the `left` and `right` operands.
    */
  def operate(op: String, left: Node, right: Node): Node = js.native
  
  /**
    * Return the opposites of the given `positions`.
    */
  def `opposite-position`(positions: Expression): Expression = js.native
  
  /**
    * Joins given paths
    */
  def pathjoin(paths: String*): java.lang.String = js.native
  
  /**
    * Pop a value from `expr`.
    */
  def pop(expr: Expression): Node = js.native
  
  /**
    * Unshift the given args to `expr`..
    */
  def prepend(expr: Expression, nodes: Node*): Unit = js.native
  
  /**
    * Push the given args to `expr`.
    */
  def push(expr: Expression, nodes: Node*): Unit = js.native
  
  def red(color: HSLA): Unit = js.native
  def red(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the red component of the given `color`,
    * or set the red component to the optional second `value` argument.
    */
  def red(color: RGBA): Unit = js.native
  def red(color: RGBA, value: Unit): RGBA = js.native
  
  def replace(pattern: String, replacement: String, `val`: Ident): Ident = js.native
  /**
    * Returns string with all matches of `pattern` replaced by `replacement` in given `val`
    */
  def replace(pattern: String, replacement: String, `val`: String): String = js.native
  
  def rgb(hsla: HSLA): RGBA = js.native
  def rgb(hue: Unit, saturation: Unit, lightness: Unit, alpha: Unit): RGBA = js.native
  /**
    * Return a `RGBA` from the r,g,b channels.
    */
  def rgb(rgba: RGBA): RGBA = js.native
  
  def rgba(hsla: HSLA): RGBA = js.native
  def rgba(hue: Unit, saturation: Unit, lightness: Unit, alpha: Unit): RGBA = js.native
  /**
    * Return a `RGBA` from the r,g,b,a channels.
    */
  def rgba(rgba: RGBA): RGBA = js.native
  
  /**
    * Return a `Literal` with the given `fmt`, and variable number of arguments.
    */
  def s(fmt: String, nodes: Node*): Literal = js.native
  
  def saturation(color: HSLA): Unit = js.native
  def saturation(color: HSLA, value: Unit): RGBA = js.native
  /**
    * Return the saturation component of the given `color`,
    * or set the saturation component to the optional second `value` argument.
    */
  def saturation(color: RGBA): Unit = js.native
  def saturation(color: RGBA, value: Unit): RGBA = js.native
  
  /**
    * Return the current selector or compile `sel` selector.
    */
  def selector(): java.lang.String = js.native
  def selector(sel: String): java.lang.String = js.native
  
  /**
    * Shift a value from `expr`.
    */
  def shift(expr: Expression): Node = js.native
  
  def split(pattern: String, `val`: Ident): Expression = js.native
  /**
    * Splits the given `val` by `delim`
    */
  def split(pattern: String, `val`: String): Expression = js.native
  
  def substr(`val`: Ident, start: Number, length: Number): Ident = js.native
  /**
    * Returns substring of the given `val`.
    */
  def substr(`val`: String, start: Number, length: Number): String = js.native
  
  /**
    * Return the tangent of the given `angle`.
    */
  def tan(angle: Unit): Unit = js.native
  
  /**
    * Output stack trace.
    */
  def trace(): Null = js.native
  
  def transparentify(top: HSLA): Object = js.native
  def transparentify(top: HSLA, bottom: HSLA): Object = js.native
  def transparentify(top: HSLA, bottom: HSLA, alpha: Unit): Object = js.native
  def transparentify(top: HSLA, bottom: RGBA): Object = js.native
  def transparentify(top: HSLA, bottom: RGBA, alpha: Unit): Object = js.native
  /**
    * Returns the transparent version of the given `top` color,
    * as if it was blend over the given `bottom` color.
    */
  def transparentify(top: RGBA): Object = js.native
  def transparentify(top: RGBA, bottom: HSLA): Object = js.native
  def transparentify(top: RGBA, bottom: HSLA, alpha: Unit): Object = js.native
  def transparentify(top: RGBA, bottom: RGBA): Object = js.native
  def transparentify(top: RGBA, bottom: RGBA, alpha: Unit): Object = js.native
  
  /**
    * Return type of `node`.
    */
  def `type`(node: Node): java.lang.String = js.native
  
  /**
    * Return type of `node`.
    */
  def `type-of`(node: Node): java.lang.String = js.native
  
  /**
    * Return type of `node`.
    */
  def typeof(node: Node): java.lang.String = js.native
  
  /**
    * Assign `type` to the given `unit` or return `unit`'s type.
    */
  def unit(unit: Unit, `type`: String): Unit = js.native
  
  /**
    * Unquote the given `string`.
    */
  def unquote(str: String): Literal = js.native
  
  /**
    * Unshift the given args to `expr`.
    */
  def unshift(expr: Expression, nodes: Node*): Unit = js.native
  
  /**
    * Use the given `plugin`.
    */
  def use(plugin: String): scala.Unit = js.native
  def use(plugin: String, options: js.Any): scala.Unit = js.native
  
  /**
    * Warn with the given `msg` prefixed by "Warning: ".
    */
  def warn(msg: String): Null = js.native
}
