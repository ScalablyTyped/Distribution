package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functions extends js.Object {
  /**
           * Return the opposites of the given `positions`.
           */
  def `-math-prop`(prop: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Prefix css classes in a block
           */
  def `-prefix-classes`(
    prefix: stylusLib.stylusMod.StylusNs.NodesNs.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block
  ): stylusLib.stylusMod.StylusNs.NodesNs.Block = js.native
  /**
           * Add property `name` with the given `expr` to the mixin-able block.
           */
  def `add-property`(
    name: stylusLib.stylusMod.StylusNs.NodesNs.String,
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  ): stylusLib.stylusMod.StylusNs.NodesNs.Property = js.native
  def adjust(
    hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    prop: stylusLib.stylusMod.StylusNs.NodesNs.String,
    amount: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Adjust HSL `color` `prop` by `amount`.
           */
  def adjust(
    rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    prop: stylusLib.stylusMod.StylusNs.NodesNs.String,
    amount: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def alpha(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def alpha(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the alpha component of the given `color`,
           * or set the alpha component to the optional second `value` argument.
           */
  def alpha(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def alpha(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return a `Literal` `num` converted to the provided `base`, padded to `width`
           * with zeroes (default width is 2)
           */
  def `base-convert`(
    num: stylusLib.stylusMod.StylusNs.NodesNs.Number,
    base: stylusLib.stylusMod.StylusNs.NodesNs.Number,
    width: stylusLib.stylusMod.StylusNs.NodesNs.Number
  ): stylusLib.stylusMod.StylusNs.NodesNs.Literal = js.native
  /**
           * Return component `name` for the given `color`.
           */
  def basename(path: stylusLib.stylusMod.StylusNs.NodesNs.String): java.lang.String = js.native
  def basename(
    path: stylusLib.stylusMod.StylusNs.NodesNs.String,
    ext: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): java.lang.String = js.native
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Blend the `top` color over the `bottom`
           */
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def blend(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def blue(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def blue(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the blue component of the given `color`,
           * or set the blue component to the optional second `value` argument.
           */
  def blue(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def blue(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return a clone of the given `expr`.
           */
  def clone(expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.Expression = js.native
  def component(
    color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    name: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Return component `name` for the given `color`.
           */
  def component(
    color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    name: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Returns the contrast ratio object between `top` and `bottom` colors,
           * based on http://leaverou.github.io/contrast-ratio/
           * and https://github.com/LeaVerou/contrast-ratio/blob/gh-pages/color.js#L108
           */
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def contrast(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Like `unquote` but tries to convert the given `str` to a Stylus node.
           */
  def convert(str: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  /**
           * Returns the @media string for the current block
           */
  def `current-media`(): stylusLib.stylusMod.StylusNs.NodesNs.String = js.native
  /**
           * Set a variable `name` on current scope.
           */
  def define(
    name: stylusLib.stylusMod.StylusNs.NodesNs.String,
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  ): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  /**
           * Return the dirname of `path`.
           */
  def dirname(path: stylusLib.stylusMod.StylusNs.NodesNs.String): java.lang.String = js.native
  /**
           * Throw an error with the given `msg`.
           */
  def error(msg: stylusLib.stylusMod.StylusNs.NodesNs.String): scala.Unit = js.native
  /**
           * Merge the object `dest` with the given args.
           */
  def extend(
    dest: stylusLib.stylusMod.StylusNs.NodesNs.Object,
    objs: stylusLib.stylusMod.StylusNs.NodesNs.Object*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Return the extension of `path`.
           */
  def extname(path: stylusLib.stylusMod.StylusNs.NodesNs.String): java.lang.String = js.native
  def green(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def green(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the green component of the given `color`,
           * or set the green component to the optional second `value` argument.
           */
  def green(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def green(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def hsl(hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  def hsl(
    hue: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    saturation: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    lightness: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  /**
           * Convert the given `color` to an `HSLA` node,
           * or h,s,l component values.
           */
  def hsl(rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  def hsla(hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  def hsla(
    hue: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    saturation: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    lightness: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  /**
           * Convert the given `color` to an `HSLA` node,
           * or h,s,l,a component values.
           */
  def hsla(rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.HSLA = js.native
  def hue(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def hue(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the hue component of the given `color`,
           * or set the hue component to the optional second `value` argument.
           */
  def hue(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def hue(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the width and height of the given `img` path.
           */
  def `image-size`(
    img: stylusLib.stylusMod.StylusNs.NodesNs.String,
    ignoreErr: stylusLib.stylusMod.StylusNs.NodesNs.Boolean
  ): stylusLib.stylusMod.StylusNs.NodesNs.Expression = js.native
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
  def json(
    path: stylusLib.stylusMod.StylusNs.NodesNs.String,
    local: stylusLib.stylusMod.StylusNs.NodesNs.Boolean,
    namePrefix: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): js.Any = js.native
  /**
           * Inspect the given `expr`.
           */
  def length(expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression*): stylusLib.stylusMod.StylusNs.NodesNs.Null = js.native
  /**
           * Return length of the given `expr`.
           */
  def length(expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def lightness(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def lightness(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the lightness component of the given `color`,
           * or set the lightness component to the optional second `value` argument.
           */
  def lightness(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def lightness(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the separator of the given `list`.
           */
  def `list-separator`(list: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.String = js.native
  /**
           * Lookup variable `name` or return Null.
           */
  def lookup(name: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  def luminosity(rgba: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Returns the relative luminance of the given `color`,
           * see http://www.w3.org/TR/WCAG20/#relativeluminancedef
           */
  def luminosity(rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def `match`(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.Ident
  ): stylusLib.stylusMod.StylusNs.NodesNs.Boolean = js.native
  /**
           * Test if `val` matches the given `pattern`.
           */
  def `match`(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.Boolean = js.native
  /**
           * Return the tangent of the given `angle`.
           */
  def math(n: stylusLib.stylusMod.StylusNs.NodesNs.Unit, fn: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Merge the object `dest` with the given args.
           */
  def merge(
    dest: stylusLib.stylusMod.StylusNs.NodesNs.Object,
    objs: stylusLib.stylusMod.StylusNs.NodesNs.Object*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Perform `op` on the `left` and `right` operands.
           */
  def operate(
    op: stylusLib.stylusMod.StylusNs.NodesNs.String,
    left: stylusLib.stylusMod.StylusNs.NodesNs.Node,
    right: stylusLib.stylusMod.StylusNs.NodesNs.Node
  ): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  /**
           * Return the opposites of the given `positions`.
           */
  def `opposite-position`(positions: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.Expression = js.native
  /**
           * Joins given paths
           */
  def pathjoin(paths: stylusLib.stylusMod.StylusNs.NodesNs.String*): java.lang.String = js.native
  /**
           * Pop a value from `expr`.
           */
  def pop(expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  /**
           * Unshift the given args to `expr`..
           */
  def prepend(
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    nodes: stylusLib.stylusMod.StylusNs.NodesNs.Node*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Push the given args to `expr`.
           */
  def push(
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    nodes: stylusLib.stylusMod.StylusNs.NodesNs.Node*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def red(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def red(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the red component of the given `color`,
           * or set the red component to the optional second `value` argument.
           */
  def red(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def red(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def replace(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    replacement: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.Ident
  ): stylusLib.stylusMod.StylusNs.NodesNs.Ident = js.native
  /**
           * Returns string with all matches of `pattern` replaced by `replacement` in given `val`
           */
  def replace(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    replacement: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.String = js.native
  def rgb(hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def rgb(
    hue: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    saturation: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    lightness: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return a `RGBA` from the r,g,b channels.
           */
  def rgb(rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def rgba(hsla: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  def rgba(
    hue: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    saturation: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    lightness: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return a `RGBA` from the r,g,b,a channels.
           */
  def rgba(rgba: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return a `Literal` with the given `fmt`, and variable number of arguments.
           */
  def s(
    fmt: stylusLib.stylusMod.StylusNs.NodesNs.String,
    nodes: stylusLib.stylusMod.StylusNs.NodesNs.Node*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Literal = js.native
  def saturation(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def saturation(color: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the saturation component of the given `color`,
           * or set the saturation component to the optional second `value` argument.
           */
  def saturation(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  def saturation(color: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, value: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.RGBA = js.native
  /**
           * Return the current selector or compile `sel` selector.
           */
  def selector(): java.lang.String = js.native
  def selector(sel: stylusLib.stylusMod.StylusNs.NodesNs.String): java.lang.String = js.native
  /**
           * Shift a value from `expr`.
           */
  def shift(expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression): stylusLib.stylusMod.StylusNs.NodesNs.Node = js.native
  def split(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.Ident
  ): stylusLib.stylusMod.StylusNs.NodesNs.Expression = js.native
  /**
           * Splits the given `val` by `delim`
           */
  def split(
    pattern: stylusLib.stylusMod.StylusNs.NodesNs.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.Expression = js.native
  def substr(
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.Ident,
    start: stylusLib.stylusMod.StylusNs.NodesNs.Number,
    length: stylusLib.stylusMod.StylusNs.NodesNs.Number
  ): stylusLib.stylusMod.StylusNs.NodesNs.Ident = js.native
  /**
           * Returns substring of the given `val`.
           */
  def substr(
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.String,
    start: stylusLib.stylusMod.StylusNs.NodesNs.Number,
    length: stylusLib.stylusMod.StylusNs.NodesNs.Number
  ): stylusLib.stylusMod.StylusNs.NodesNs.String = js.native
  /**
           * Return the tangent of the given `angle`.
           */
  def tan(angle: stylusLib.stylusMod.StylusNs.NodesNs.Unit): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Output stack trace.
           */
  def trace(): stylusLib.stylusMod.StylusNs.NodesNs.Null = js.native
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(
    top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(
    top: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Returns the transparent version of the given `top` color,
           * as if it was blend over the given `bottom` color.
           */
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(
    top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    bottom: stylusLib.stylusMod.StylusNs.NodesNs.HSLA,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA, bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  def transparentify(
    top: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    bottom: stylusLib.stylusMod.StylusNs.NodesNs.RGBA,
    alpha: stylusLib.stylusMod.StylusNs.NodesNs.Unit
  ): stylusLib.stylusMod.StylusNs.NodesNs.Object = js.native
  /**
           * Return type of `node`.
           */
  def `type`(node: stylusLib.stylusMod.StylusNs.NodesNs.Node): java.lang.String = js.native
  /**
           * Return type of `node`.
           */
  def `type-of`(node: stylusLib.stylusMod.StylusNs.NodesNs.Node): java.lang.String = js.native
  /**
           * Return type of `node`.
           */
  def typeof(node: stylusLib.stylusMod.StylusNs.NodesNs.Node): java.lang.String = js.native
  /**
           * Assign `type` to the given `unit` or return `unit`'s type.
           */
  def unit(
    unit: stylusLib.stylusMod.StylusNs.NodesNs.Unit,
    `type`: stylusLib.stylusMod.StylusNs.NodesNs.String
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Unquote the given `string`.
           */
  def unquote(str: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Literal = js.native
  /**
           * Unshift the given args to `expr`.
           */
  def unshift(
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    nodes: stylusLib.stylusMod.StylusNs.NodesNs.Node*
  ): stylusLib.stylusMod.StylusNs.NodesNs.Unit = js.native
  /**
           * Use the given `plugin`.
           */
  def use(plugin: stylusLib.stylusMod.StylusNs.NodesNs.String): scala.Unit = js.native
  def use(plugin: stylusLib.stylusMod.StylusNs.NodesNs.String, options: js.Any): scala.Unit = js.native
  /**
           * Warn with the given `msg` prefixed by "Warning: ".
           */
  def warn(msg: stylusLib.stylusMod.StylusNs.NodesNs.String): stylusLib.stylusMod.StylusNs.NodesNs.Null = js.native
}

