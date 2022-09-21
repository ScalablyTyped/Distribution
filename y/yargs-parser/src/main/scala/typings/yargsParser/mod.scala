package typings.yargsParser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.yargsParser.anon.PartialConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("yargs-parser", JSImport.Namespace)
  @js.native
  val ^ : Parser = js.native
  
  trait Arguments
    extends StObject
       with /** All remaining options */
  /* argName */ StringDictionary[Any] {
    
    /** Arguments after the end-of-options flag `--` */
    var `--`: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** Non-option arguments */
    @JSName("_")
    var _underscore: js.Array[String | Double]
  }
  object Arguments {
    
    inline def apply(_underscore: js.Array[String | Double]): Arguments = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    extension [Self <: Arguments](x: Self) {
      
      inline def `set--`(value: js.Array[String | Double]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      inline def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      inline def `set--Varargs`(value: (String | Double)*): Self = StObject.set(x, "--", js.Array(value*))
      
      inline def set_underscore(value: js.Array[String | Double]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: (String | Double)*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
  
  trait Configuration extends StObject {
    
    /** Should variables prefixed with --no be treated as negations? Default is `true` */
    var `boolean-negation`: Boolean
    
    /** Should hyphenated arguments be expanded into camel-case aliases? Default is `true` */
    var `camel-case-expansion`: Boolean
    
    /** Should arrays be combined when provided by both command line arguments and a configuration file. Default is `false`  */
    var `combine-arrays`: Boolean
    
    /** Should keys that contain . be treated as objects? Default is `true` */
    var `dot-notation`: Boolean
    
    /** Should arguments be coerced into an array when duplicated. Default is `true` */
    var `duplicate-arguments-array`: Boolean
    
    /** Should array arguments be coerced into a single array when duplicated. Default is `true` */
    var `flatten-duplicate-arrays`: Boolean
    
    /** Should arrays consume more than one positional argument following their flag. Default is `true` */
    var `greedy-arrays`: Boolean
    
    /** Should parsing stop at the first text argument? This is similar to how e.g. ssh parses its command line. Default is `false` */
    var `halt-at-non-option`: Boolean
    
    /** Should nargs consume dash options as well as positional arguments. Default is `false` */
    var `nargs-eats-options`: Boolean
    
    /** The prefix to use for negated boolean variables. Default is `'no-'` */
    var `negation-prefix`: String
    
    /** Should keys that look like numbers be treated as such? Default is `true` */
    var `parse-numbers`: Boolean
    
    /** Should positional keys that look like numbers be treated as such? Default is `true` */
    var `parse-positional-numbers`: Boolean
    
    /** Should unparsed flags be stored in -- or _. Default is `false` */
    var `populate--`: Boolean
    
    /** Should a placeholder be added for keys not set via the corresponding CLI argument? Default is `false` */
    var `set-placeholder-key`: Boolean
    
    /** Should a group of short-options be treated as boolean flags? Default is `true` */
    var `short-option-groups`: Boolean
    
    /** Should aliases be removed before returning results? Default is `false` */
    var `strip-aliased`: Boolean
    
    /** Should dashed keys be removed before returning results? This option has no effect if camel-case-expansion is disabled. Default is `false` */
    var `strip-dashed`: Boolean
    
    /** Should unknown options be treated like regular arguments? An unknown option is one that is not configured in opts. Default is `false` */
    var `unknown-options-as-args`: Boolean
  }
  object Configuration {
    
    inline def apply(
      `boolean-negation`: Boolean,
      `camel-case-expansion`: Boolean,
      `combine-arrays`: Boolean,
      `dot-notation`: Boolean,
      `duplicate-arguments-array`: Boolean,
      `flatten-duplicate-arrays`: Boolean,
      `greedy-arrays`: Boolean,
      `halt-at-non-option`: Boolean,
      `nargs-eats-options`: Boolean,
      `negation-prefix`: String,
      `parse-numbers`: Boolean,
      `parse-positional-numbers`: Boolean,
      `populate--`: Boolean,
      `set-placeholder-key`: Boolean,
      `short-option-groups`: Boolean,
      `strip-aliased`: Boolean,
      `strip-dashed`: Boolean,
      `unknown-options-as-args`: Boolean
    ): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("boolean-negation")(`boolean-negation`.asInstanceOf[js.Any])
      __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`.asInstanceOf[js.Any])
      __obj.updateDynamic("combine-arrays")(`combine-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("dot-notation")(`dot-notation`.asInstanceOf[js.Any])
      __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`.asInstanceOf[js.Any])
      __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("greedy-arrays")(`greedy-arrays`.asInstanceOf[js.Any])
      __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.asInstanceOf[js.Any])
      __obj.updateDynamic("nargs-eats-options")(`nargs-eats-options`.asInstanceOf[js.Any])
      __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
      __obj.updateDynamic("parse-numbers")(`parse-numbers`.asInstanceOf[js.Any])
      __obj.updateDynamic("parse-positional-numbers")(`parse-positional-numbers`.asInstanceOf[js.Any])
      __obj.updateDynamic("populate--")(`populate--`.asInstanceOf[js.Any])
      __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("short-option-groups")(`short-option-groups`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-aliased")(`strip-aliased`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-dashed")(`strip-dashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def `setBoolean-negation`(value: Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      inline def `setCamel-case-expansion`(value: Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      inline def `setCombine-arrays`(value: Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      inline def `setDot-notation`(value: Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      inline def `setDuplicate-arguments-array`(value: Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      inline def `setFlatten-duplicate-arrays`(value: Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      inline def `setGreedy-arrays`(value: Boolean): Self = StObject.set(x, "greedy-arrays", value.asInstanceOf[js.Any])
      
      inline def `setHalt-at-non-option`(value: Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      inline def `setNargs-eats-options`(value: Boolean): Self = StObject.set(x, "nargs-eats-options", value.asInstanceOf[js.Any])
      
      inline def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      inline def `setParse-numbers`(value: Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      inline def `setParse-positional-numbers`(value: Boolean): Self = StObject.set(x, "parse-positional-numbers", value.asInstanceOf[js.Any])
      
      inline def `setPopulate--`(value: Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      inline def `setSet-placeholder-key`(value: Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      inline def `setShort-option-groups`(value: Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      inline def `setStrip-aliased`(value: Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      inline def `setStrip-dashed`(value: Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      inline def `setUnknown-options-as-args`(value: Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetailedArguments extends StObject {
    
    /** The inferred list of aliases built by combining lists in opts.alias. */
    var aliases: StringDictionary[js.Array[String]]
    
    /** An object representing the parsed value of `args` */
    var argv: Arguments
    
    /** The configuration loaded from the yargs stanza in package.json. */
    var configuration: Configuration
    
    /** Populated with an error object if an exception occurred during parsing. */
    var error: js.Error | Null
    
    /** Any new aliases added via camel-case expansion. */
    var newAliases: StringDictionary[Boolean]
  }
  object DetailedArguments {
    
    inline def apply(
      aliases: StringDictionary[js.Array[String]],
      argv: Arguments,
      configuration: Configuration,
      newAliases: StringDictionary[Boolean]
    ): DetailedArguments = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[DetailedArguments]
    }
    
    extension [Self <: DetailedArguments](x: Self) {
      
      inline def setAliases(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setArgv(value: Arguments): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setNewAliases(value: StringDictionary[Boolean]): Self = StObject.set(x, "newAliases", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
    var default: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    /**
      * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
      * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
      * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
      */
    var array: js.UndefOr[js.Array[typings.yargsParser.anon.Boolean | String]] = js.undefined
    
    /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
    var boolean: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
      * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
      */
    var coerce: js.UndefOr[StringDictionary[js.Function1[/* arg */ Any, Any]]] = js.undefined
    
    /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
    var config: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
    
    /** Provide configuration options to the yargs-parser. */
    var configuration: js.UndefOr[PartialConfiguration] = js.undefined
    
    /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
    var count: js.UndefOr[js.Array[String]] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArray(value: js.Array[typings.yargsParser.anon.Boolean | String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setArrayVarargs(value: (typings.yargsParser.anon.Boolean | String)*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setBoolean(value: js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setCoerce(value: StringDictionary[js.Function1[/* arg */ Any, Any]]): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setConfig(value: String | js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConfigVarargs(value: String*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setConfiguration(value: PartialConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setCount(value: js.Array[String]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setCountVarargs(value: String*): Self = StObject.set(x, "count", js.Array(value*))
      
      inline def setDefault(value: StringDictionary[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEnvPrefix(value: String): Self = StObject.set(x, "envPrefix", value.asInstanceOf[js.Any])
      
      inline def setEnvPrefixUndefined: Self = StObject.set(x, "envPrefix", js.undefined)
      
      inline def setNarg(value: StringDictionary[Double]): Self = StObject.set(x, "narg", value.asInstanceOf[js.Any])
      
      inline def setNargUndefined: Self = StObject.set(x, "narg", js.undefined)
      
      inline def setNormalize(value: js.Array[String]): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setNormalizeVarargs(value: String*): Self = StObject.set(x, "normalize", js.Array(value*))
      
      inline def setNumber(value: js.Array[String]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumberVarargs(value: String*): Self = StObject.set(x, "number", js.Array(value*))
      
      inline def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    def apply(argv: String): Arguments = js.native
    def apply(argv: String, opts: Options): Arguments = js.native
    def apply(argv: js.Array[String]): Arguments = js.native
    def apply(argv: js.Array[String], opts: Options): Arguments = js.native
    
    def camelCase(str: String): String = js.native
    
    def decamelize(str: String): String = js.native
    def decamelize(str: String, joinString: String): String = js.native
    
    def detailed(argv: String): DetailedArguments = js.native
    def detailed(argv: String, opts: Options): DetailedArguments = js.native
    def detailed(argv: js.Array[String]): DetailedArguments = js.native
    def detailed(argv: js.Array[String], opts: Options): DetailedArguments = js.native
    
    def looksLikeNumber(): Boolean = js.native
    def looksLikeNumber(value: String): Boolean = js.native
    def looksLikeNumber(value: Double): Boolean = js.native
  }
  
  type _To = Parser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parser = ^
}
