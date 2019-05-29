package typings
package yargsDashParserLib.yargsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  /**
    * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
    * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
    * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
    */
  var array: js.UndefOr[js.Array[yargsDashParserLib.Anon_Boolean | java.lang.String]] = js.undefined
  /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
  var boolean: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
    * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
    */
  var coerce: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.undefined
  /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
  var config: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  /** Provide configuration options to the yargs-parser. */
  var configuration: js.UndefOr[stdLib.Partial[Configuration]] = js.undefined
  /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
  var count: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Environment variables (`process.env`) with the prefix provided should be parsed. */
  var envPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specify that a key requires n arguments: `{ narg: {x: 2} }`. */
  var narg: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /** `path.normalize()` will be applied to values set to this key. */
  var normalize: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Keys should be treated as numbers. */
  var number: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Keys should be treated as strings (even if they resemble a number `-x 33`). */
  var string: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    array: js.Array[yargsDashParserLib.Anon_Boolean | java.lang.String] = null,
    boolean: js.Array[java.lang.String] = null,
    coerce: org.scalablytyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]] = null,
    config: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    configuration: stdLib.Partial[Configuration] = null,
    count: js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    envPrefix: java.lang.String = null,
    narg: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    normalize: js.Array[java.lang.String] = null,
    number: js.Array[java.lang.String] = null,
    string: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (array != null) __obj.updateDynamic("array")(array)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (count != null) __obj.updateDynamic("count")(count)
    if (default != null) __obj.updateDynamic("default")(default)
    if (envPrefix != null) __obj.updateDynamic("envPrefix")(envPrefix)
    if (narg != null) __obj.updateDynamic("narg")(narg)
    if (normalize != null) __obj.updateDynamic("normalize")(normalize)
    if (number != null) __obj.updateDynamic("number")(number)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Options]
  }
}

