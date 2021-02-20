package typings.yargsParser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.yargsParser.anon.PartialConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("yargs-parser", JSImport.Namespace)
  @js.native
  val ^ : Parser = js.native
  
  @js.native
  trait Arguments
    extends /** All remaining options */
  /* argName */ StringDictionary[js.Any] {
    
    /** The script name or node command */
    @JSName("$0")
    var $0: String = js.native
    
    /** Non-option arguments */
    @JSName("_")
    var _underscore: js.Array[String] = js.native
  }
  object Arguments {
    
    @scala.inline
    def apply($0: String, _underscore: js.Array[String]): Arguments = {
      val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    @scala.inline
    implicit class ArgumentsMutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$0(value: String): Self = StObject.set(x, "$0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Configuration extends StObject {
    
    /** Should variables prefixed with --no be treated as negations? Default is `true` */
    var `boolean-negation`: Boolean = js.native
    
    /** Should hyphenated arguments be expanded into camel-case aliases? Default is `true` */
    var `camel-case-expansion`: Boolean = js.native
    
    /** Should arrays be combined when provided by both command line arguments and a configuration file. Default is `false`  */
    var `combine-arrays`: Boolean = js.native
    
    /** Should keys that contain . be treated as objects? Default is `true` */
    var `dot-notation`: Boolean = js.native
    
    /** Should arguments be coerced into an array when duplicated. Default is `true` */
    var `duplicate-arguments-array`: Boolean = js.native
    
    /** Should array arguments be coerced into a single array when duplicated. Default is `true` */
    var `flatten-duplicate-arrays`: Boolean = js.native
    
    /** Should parsing stop at the first text argument? This is similar to how e.g. ssh parses its command line. Default is `false` */
    var `halt-at-non-option`: Boolean = js.native
    
    /** The prefix to use for negated boolean variables. Default is `'no-'` */
    var `negation-prefix`: String = js.native
    
    /** Should keys that look like numbers be treated as such? Default is `true` */
    var `parse-numbers`: Boolean = js.native
    
    /** Should unparsed flags be stored in -- or _. Default is `false` */
    var `populate--`: Boolean = js.native
    
    /** Should a placeholder be added for keys not set via the corresponding CLI argument? Default is `false` */
    var `set-placeholder-key`: Boolean = js.native
    
    /** Should a group of short-options be treated as boolean flags? Default is `true` */
    var `short-option-groups`: Boolean = js.native
    
    /** Should aliases be removed before returning results? Default is `false` */
    var `strip-aliased`: Boolean = js.native
    
    /** Should dashed keys be removed before returning results? This option has no effect if camel-case-expansion is disabled. Default is `false` */
    var `strip-dashed`: Boolean = js.native
    
    /** Should unknown options be treated like regular arguments? An unknown option is one that is not configured in opts. Default is `false` */
    var `unknown-options-as-args`: Boolean = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(
      `boolean-negation`: Boolean,
      `camel-case-expansion`: Boolean,
      `combine-arrays`: Boolean,
      `dot-notation`: Boolean,
      `duplicate-arguments-array`: Boolean,
      `flatten-duplicate-arrays`: Boolean,
      `halt-at-non-option`: Boolean,
      `negation-prefix`: String,
      `parse-numbers`: Boolean,
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
      __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.asInstanceOf[js.Any])
      __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
      __obj.updateDynamic("parse-numbers")(`parse-numbers`.asInstanceOf[js.Any])
      __obj.updateDynamic("populate--")(`populate--`.asInstanceOf[js.Any])
      __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("short-option-groups")(`short-option-groups`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-aliased")(`strip-aliased`.asInstanceOf[js.Any])
      __obj.updateDynamic("strip-dashed")(`strip-dashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBoolean-negation`(value: Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCamel-case-expansion`(value: Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCombine-arrays`(value: Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDot-notation`(value: Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDuplicate-arguments-array`(value: Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlatten-duplicate-arrays`(value: Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHalt-at-non-option`(value: Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setParse-numbers`(value: Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPopulate--`(value: Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSet-placeholder-key`(value: Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-option-groups`(value: Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-aliased`(value: Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-dashed`(value: Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUnknown-options-as-args`(value: Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DetailedArguments extends StObject {
    
    /** The inferred list of aliases built by combining lists in opts.alias. */
    var aliases: StringDictionary[js.Array[String]] = js.native
    
    /** An object representing the parsed value of `args` */
    var argv: Arguments = js.native
    
    /** The configuration loaded from the yargs stanza in package.json. */
    var configuration: Configuration = js.native
    
    /** Populated with an error object if an exception occurred during parsing. */
    var error: Error | Null = js.native
    
    /** Any new aliases added via camel-case expansion. */
    var newAliases: StringDictionary[Boolean] = js.native
  }
  object DetailedArguments {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[js.Array[String]],
      argv: Arguments,
      configuration: Configuration,
      newAliases: StringDictionary[Boolean]
    ): DetailedArguments = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedArguments]
    }
    
    @scala.inline
    implicit class DetailedArgumentsMutableBuilder[Self <: DetailedArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgv(value: Arguments): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setNewAliases(value: StringDictionary[Boolean]): Self = StObject.set(x, "newAliases", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
    var default: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    /**
      * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
      * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
      * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
      */
    var array: js.UndefOr[js.Array[typings.yargsParser.anon.Boolean | String]] = js.native
    
    /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
    var boolean: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
      * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
      */
    var coerce: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.native
    
    /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
    var config: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.native
    
    /** Provide configuration options to the yargs-parser. */
    var configuration: js.UndefOr[PartialConfiguration] = js.native
    
    /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
    var count: js.UndefOr[js.Array[String]] = js.native
    
    /** Environment variables (`process.env`) with the prefix provided should be parsed. */
    var envPrefix: js.UndefOr[String] = js.native
    
    /** Specify that a key requires n arguments: `{ narg: {x: 2} }`. */
    var narg: js.UndefOr[StringDictionary[Double]] = js.native
    
    /** `path.normalize()` will be applied to values set to this key. */
    var normalize: js.UndefOr[js.Array[String]] = js.native
    
    /** Keys should be treated as numbers. */
    var number: js.UndefOr[js.Array[String]] = js.native
    
    /** Keys should be treated as strings (even if they resemble a number `-x 33`). */
    var string: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setArray(value: js.Array[typings.yargsParser.anon.Boolean | String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setArrayVarargs(value: (typings.yargsParser.anon.Boolean | String)*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      @scala.inline
      def setBoolean(value: js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setCoerce(value: StringDictionary[js.Function1[/* arg */ js.Any, _]]): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      @scala.inline
      def setConfig(value: String | js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConfigVarargs(value: String*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setConfiguration(value: PartialConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setCount(value: js.Array[String]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCountVarargs(value: String*): Self = StObject.set(x, "count", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setEnvPrefix(value: String): Self = StObject.set(x, "envPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvPrefixUndefined: Self = StObject.set(x, "envPrefix", js.undefined)
      
      @scala.inline
      def setNarg(value: StringDictionary[Double]): Self = StObject.set(x, "narg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNargUndefined: Self = StObject.set(x, "narg", js.undefined)
      
      @scala.inline
      def setNormalize(value: js.Array[String]): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setNormalizeVarargs(value: String*): Self = StObject.set(x, "normalize", js.Array(value :_*))
      
      @scala.inline
      def setNumber(value: js.Array[String]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setNumberVarargs(value: String*): Self = StObject.set(x, "number", js.Array(value :_*))
      
      @scala.inline
      def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    def apply(argv: String): Arguments = js.native
    def apply(argv: String, opts: Options): Arguments = js.native
    def apply(argv: js.Array[String]): Arguments = js.native
    def apply(argv: js.Array[String], opts: Options): Arguments = js.native
    
    def detailed(argv: String): DetailedArguments = js.native
    def detailed(argv: String, opts: Options): DetailedArguments = js.native
    def detailed(argv: js.Array[String]): DetailedArguments = js.native
    def detailed(argv: js.Array[String], opts: Options): DetailedArguments = js.native
  }
  
  type _To = Parser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parser = ^
}
