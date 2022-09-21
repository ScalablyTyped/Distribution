package typings.stylus.mod.Stylus

import typings.stylus.mod.Stylus.Nodes.Expression
import typings.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  /**
    * Check if `path` looks absolute.
    */
  def absolute(path: String): Boolean = js.native
  
  /**
    * Assert that `node` is a `RGBA` or `HSLA`.
    */
  def assertColor(node: Node, param: String): Unit = js.native
  
  /**
    * Assert that param `name` is given, aka the `node` is passed.
    */
  def assertPresent(node: Node, name: String): Unit = js.native
  
  /**
    * Assert that `node` is a `String` or `Ident`.
    */
  def assertString(node: Node, param: String): Unit = js.native
  
  /**
    * Assert that `node` is of the given `type`, or throw.
    */
  def assertType(node: Node, `type`: String, param: String): Unit = js.native
  
  /**
    * Coerce JavaScript values to their Stylus equivalents.
    */
  def coerce(`val`: Any): Node = js.native
  def coerce(`val`: Any, raw: Boolean): Node = js.native
  
  /**
    * Coerce a javascript `Array` to a Stylus `Expression`.
    */
  def coerceArray(`val`: Any): Expression = js.native
  def coerceArray(`val`: Any, raw: Boolean): Expression = js.native
  
  /**
    * Coerce a javascript object to a Stylus `Expression` or `Object`.
    *
    * For example `{ foo: 'bar', bar: 'baz' }` would become
    * the expression `(foo 'bar') (bar 'baz')`. If `raw` is true
    * given `obj` would become a Stylus hash object.
    */
  def coerceObject(obj: Any): Expression = js.native
  def coerceObject(obj: Any, raw: Boolean): Expression = js.native
  
  /**
    * Compile selector strings in `arr` from the bottom-up
    * to produce the selector combinations. For example
    * the following Stylus:
    */
  def compileSelectors(arr: js.Array[String], leaveHidden: Boolean): js.Array[String] = js.native
  
  /**
    * Like `utils.lookup` but uses `glob` to find files.
    */
  def find(path: String, paths: String, ignore: String): js.Array[String] = js.native
  
  /**
    * Format the given `err` with the given `options`.
    */
  def formatException(err: js.Error, options: ExceptionOptions): js.Error = js.native
  
  /**
    * Attempt to lookup `path` within `paths` from tail to head.
    * Optionally a path to `ignore` may be passed.
    */
  def lookup(path: String, paths: String, ignore: String, resolveURL: Boolean): String = js.native
  
  /**
    * Attempt to lookup `path` within `paths` from tail to head.
    * Optionally a path to `ignore` may be passed.
    */
  def lookupIndex(path: String, paths: String, filename: String): js.Array[String] = js.native
  
  /**
    * Merge object `b` with `a`.
    */
  def merge(a: Any, b: Any): Any = js.native
  
  /**
    * Return param names for `fn`.
    */
  def params(fn: js.Function1[/* repeated */ Any, Any]): js.Array[String] = js.native
  
  /**
    * Returns an array with unique values.
    */
  def uniq(arr: js.Array[Any]): js.Array[Any] = js.native
  
  /**
    * Unwrap `expr`.
    *
    * Takes an expressions with length of 1
    * such as `((1 2 3))` and unwraps it to `(1 2 3)`.
    */
  def unwrap(expr: Expression): Node = js.native
}
