package typings.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.yargsParser.AnonBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  /**
    * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
    * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
    * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
    */
  var array: js.UndefOr[js.Array[AnonBoolean | String]] = js.undefined
  /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
  var boolean: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
    * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
    */
  var coerce: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.undefined
  /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
  var config: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
  /** Provide configuration options to the yargs-parser. */
  var configuration: js.UndefOr[Partial[Configuration]] = js.undefined
  /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
  var count: js.UndefOr[js.Array[String]] = js.undefined
  /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
  var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** Environment variables (`process.env`) with the prefix provided should be parsed. */
  var envPrefix: js.UndefOr[String] = js.undefined
  /** Specify that a key requires n arguments: `{ narg: {x: 2} }`. */
  var narg: js.UndefOr[StringDictionary[Double]] = js.undefined
  /** `path.normalize()` will be applied to values set to this key. */
  var normalize: js.UndefOr[js.Array[String]] = js.undefined
  /** Keys should be treated as numbers. */
  var number: js.UndefOr[js.Array[String]] = js.undefined
  /** Keys should be treated as strings (even if they resemble a number `-x 33`). */
  var string: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: StringDictionary[String | js.Array[String]] = null,
    array: js.Array[AnonBoolean | String] = null,
    boolean: js.Array[String] = null,
    coerce: StringDictionary[js.Function1[/* arg */ js.Any, _]] = null,
    config: String | js.Array[String] | StringDictionary[Boolean] = null,
    configuration: Partial[Configuration] = null,
    count: js.Array[String] = null,
    default: StringDictionary[js.Any] = null,
    envPrefix: String = null,
    narg: StringDictionary[Double] = null,
    normalize: js.Array[String] = null,
    number: js.Array[String] = null,
    string: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (envPrefix != null) __obj.updateDynamic("envPrefix")(envPrefix.asInstanceOf[js.Any])
    if (narg != null) __obj.updateDynamic("narg")(narg.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

