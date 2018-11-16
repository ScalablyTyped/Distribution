package typings
package atUirouterCoreLib.libUrlUrlConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlConfig", "UrlConfig")
@js.native
class UrlConfig protected ()
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** @hidden */ def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @hidden */ var _defaultSquashPolicy: scala.Boolean | java.lang.String = js.native
  /** @hidden */ var _isCaseInsensitive: scala.Boolean = js.native
  /** @hidden */ var _isStrictMode: scala.Boolean = js.native
  /** @hidden */ var paramTypes: atUirouterCoreLib.libParamsMod.ParamTypes = js.native
  var router: js.Any = js.native
  /**
       * Gets the base Href, e.g., `http://localhost/approot/`
       *
       * @return the application's base href
       */
  def baseHref(): java.lang.String = js.native
  /**
       * Defines whether URL matching should be case sensitive (the default behavior), or not.
       *
       * #### Example:
       * ```js
       * // Allow case insensitive url matches
       * urlService.config.caseInsensitive(true);
       * ```
       *
       * @param value `false` to match URL in a case sensitive manner; otherwise `true`;
       * @returns the current value of caseInsensitive
       */
  def caseInsensitive(): scala.Boolean = js.native
  /**
       * Defines whether URL matching should be case sensitive (the default behavior), or not.
       *
       * #### Example:
       * ```js
       * // Allow case insensitive url matches
       * urlService.config.caseInsensitive(true);
       * ```
       *
       * @param value `false` to match URL in a case sensitive manner; otherwise `true`;
       * @returns the current value of caseInsensitive
       */
  def caseInsensitive(value: scala.Boolean): scala.Boolean = js.native
  /**
       * Sets the default behavior when generating or matching URLs with default parameter values.
       *
       * #### Example:
       * ```js
       * // Remove default parameter values from the url
       * urlService.config.defaultSquashPolicy(true);
       * ```
       *
       * @param value A string that defines the default parameter URL squashing behavior.
       *    - `nosquash`: When generating an href with a default parameter value, do not squash the parameter value from the URL
       *    - `slash`: When generating an href with a default parameter value, squash (remove) the parameter value, and, if the
       *      parameter is surrounded by slashes, squash (remove) one slash from the URL
       *    - any other string, e.g. "~": When generating an href with a default parameter value, squash (remove)
       *      the parameter value from the URL and replace it with this string.
       * @returns the current value of defaultSquashPolicy
       */
  def defaultSquashPolicy(): java.lang.String | scala.Boolean = js.native
  /**
       * Sets the default behavior when generating or matching URLs with default parameter values.
       *
       * #### Example:
       * ```js
       * // Remove default parameter values from the url
       * urlService.config.defaultSquashPolicy(true);
       * ```
       *
       * @param value A string that defines the default parameter URL squashing behavior.
       *    - `nosquash`: When generating an href with a default parameter value, do not squash the parameter value from the URL
       *    - `slash`: When generating an href with a default parameter value, squash (remove) the parameter value, and, if the
       *      parameter is surrounded by slashes, squash (remove) one slash from the URL
       *    - any other string, e.g. "~": When generating an href with a default parameter value, squash (remove)
       *      the parameter value from the URL and replace it with this string.
       * @returns the current value of defaultSquashPolicy
       */
  def defaultSquashPolicy(value: java.lang.String): java.lang.String | scala.Boolean = js.native
  /**
       * Sets the default behavior when generating or matching URLs with default parameter values.
       *
       * #### Example:
       * ```js
       * // Remove default parameter values from the url
       * urlService.config.defaultSquashPolicy(true);
       * ```
       *
       * @param value A string that defines the default parameter URL squashing behavior.
       *    - `nosquash`: When generating an href with a default parameter value, do not squash the parameter value from the URL
       *    - `slash`: When generating an href with a default parameter value, squash (remove) the parameter value, and, if the
       *      parameter is surrounded by slashes, squash (remove) one slash from the URL
       *    - any other string, e.g. "~": When generating an href with a default parameter value, squash (remove)
       *      the parameter value from the URL and replace it with this string.
       * @returns the current value of defaultSquashPolicy
       */
  def defaultSquashPolicy(value: scala.Boolean): java.lang.String | scala.Boolean = js.native
  /**
       * Gets or sets the hashPrefix
       *
       * This only applies when not running in [[html5Mode]] (pushstate mode)
       *
       * If the current url is `http://localhost/app#!/uirouter/path/#anchor`, it returns `!` which is the prefix for the "hashbang" portion.
       *
       * @return the hash prefix
       */
  def hashPrefix(): java.lang.String = js.native
  /**
       * Gets or sets the hashPrefix
       *
       * This only applies when not running in [[html5Mode]] (pushstate mode)
       *
       * If the current url is `http://localhost/app#!/uirouter/path/#anchor`, it returns `!` which is the prefix for the "hashbang" portion.
       *
       * @return the hash prefix
       */
  def hashPrefix(newprefix: java.lang.String): java.lang.String = js.native
  /**
       * Gets the host, e.g., `localhost`
       *
       * @return the protocol
       */
  def host(): java.lang.String = js.native
  /**
       * Returns true when running in pushstate mode
       *
       * @return true when running in html5 mode (pushstate mode).
       */
  def html5Mode(): scala.Boolean = js.native
  /**
       * Gets the port, e.g., `80`
       *
       * @return the port number
       */
  def port(): scala.Double = js.native
  /**
       * Gets the protocol, e.g., `http`
       *
       * @return the protocol
       */
  def protocol(): java.lang.String = js.native
  /**
       * Defines whether URLs should match trailing slashes, or not (the default behavior).
       *
       * #### Example:
       * ```js
       * // Allow optional trailing slashes
       * urlService.config.strictMode(false);
       * ```
       *
       * @param value `false` to match trailing slashes in URLs, otherwise `true`.
       * @returns the current value of strictMode
       */
  def strictMode(): scala.Boolean = js.native
  /**
       * Defines whether URLs should match trailing slashes, or not (the default behavior).
       *
       * #### Example:
       * ```js
       * // Allow optional trailing slashes
       * urlService.config.strictMode(false);
       * ```
       *
       * @param value `false` to match trailing slashes in URLs, otherwise `true`.
       * @returns the current value of strictMode
       */
  def strictMode(value: scala.Boolean): scala.Boolean = js.native
  /**
       * Creates and registers a custom [[ParamType]] object
       *
       * A custom parameter type can be used to generate URLs with typed parameters or custom encoding/decoding.
       *
       * #### Note: Register custom types *before using them* in a state definition.
       *
       * #### Example:
       * ```js
       * // Encode object parameter as JSON string
       * urlService.config.type('myjson', {
       *   encode: (obj) => JSON.stringify(obj),
       *   decode: (str) => JSON.parse(str),
       *   is: (val) => typeof(val) === 'object',
       *   pattern: /[^/]+/,
       *   equals: (a, b) => _.isEqual(a, b),
       * });
       * ```
       *
       * See [[ParamTypeDefinition]] for more examples
       *
       * @param name The type name.
       * @param definition The type definition. See [[ParamTypeDefinition]] for information on the values accepted.
       * @param definitionFn A function that is injected before the app runtime starts.
       *        The result of this function should be a [[ParamTypeDefinition]].
       *        The result is merged into the existing `definition`.
       *        See [[ParamType]] for information on the values accepted.
       *
       * @returns if only the `name` parameter was specified: the currently registered [[ParamType]] object, or undefined
       */
  def `type`(name: java.lang.String): js.Any = js.native
  /**
       * Creates and registers a custom [[ParamType]] object
       *
       * A custom parameter type can be used to generate URLs with typed parameters or custom encoding/decoding.
       *
       * #### Note: Register custom types *before using them* in a state definition.
       *
       * #### Example:
       * ```js
       * // Encode object parameter as JSON string
       * urlService.config.type('myjson', {
       *   encode: (obj) => JSON.stringify(obj),
       *   decode: (str) => JSON.parse(str),
       *   is: (val) => typeof(val) === 'object',
       *   pattern: /[^/]+/,
       *   equals: (a, b) => _.isEqual(a, b),
       * });
       * ```
       *
       * See [[ParamTypeDefinition]] for more examples
       *
       * @param name The type name.
       * @param definition The type definition. See [[ParamTypeDefinition]] for information on the values accepted.
       * @param definitionFn A function that is injected before the app runtime starts.
       *        The result of this function should be a [[ParamTypeDefinition]].
       *        The result is merged into the existing `definition`.
       *        See [[ParamType]] for information on the values accepted.
       *
       * @returns if only the `name` parameter was specified: the currently registered [[ParamType]] object, or undefined
       */
  def `type`(name: java.lang.String, definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition): js.Any = js.native
  /**
       * Creates and registers a custom [[ParamType]] object
       *
       * A custom parameter type can be used to generate URLs with typed parameters or custom encoding/decoding.
       *
       * #### Note: Register custom types *before using them* in a state definition.
       *
       * #### Example:
       * ```js
       * // Encode object parameter as JSON string
       * urlService.config.type('myjson', {
       *   encode: (obj) => JSON.stringify(obj),
       *   decode: (str) => JSON.parse(str),
       *   is: (val) => typeof(val) === 'object',
       *   pattern: /[^/]+/,
       *   equals: (a, b) => _.isEqual(a, b),
       * });
       * ```
       *
       * See [[ParamTypeDefinition]] for more examples
       *
       * @param name The type name.
       * @param definition The type definition. See [[ParamTypeDefinition]] for information on the values accepted.
       * @param definitionFn A function that is injected before the app runtime starts.
       *        The result of this function should be a [[ParamTypeDefinition]].
       *        The result is merged into the existing `definition`.
       *        See [[ParamType]] for information on the values accepted.
       *
       * @returns if only the `name` parameter was specified: the currently registered [[ParamType]] object, or undefined
       */
  def `type`(
    name: java.lang.String,
    definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition,
    definitionFn: js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]
  ): js.Any = js.native
}

