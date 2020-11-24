package typings.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.yargsParser.anon.Boolean
import typings.yargsParser.anon.PartialConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  /**
    * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
    * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
    * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
    */
  var array: js.UndefOr[js.Array[Boolean | String]] = js.native
  
  /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
  var boolean: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
    * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
    */
  var coerce: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.native
  
  /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
  var config: js.UndefOr[String | js.Array[String] | StringDictionary[scala.Boolean]] = js.native
  
  /** Provide configuration options to the yargs-parser. */
  var configuration: js.UndefOr[PartialConfiguration] = js.native
  
  /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
  var count: js.UndefOr[js.Array[String]] = js.native
  
  /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
  var default: js.UndefOr[StringDictionary[js.Any]] = js.native
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: StringDictionary[String | js.Array[String]]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setArrayVarargs(value: (Boolean | String)*): Self = this.set("array", js.Array(value :_*))
    
    @scala.inline
    def setArray(value: js.Array[Boolean | String]): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setBooleanVarargs(value: String*): Self = this.set("boolean", js.Array(value :_*))
    
    @scala.inline
    def setBoolean(value: js.Array[String]): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    
    @scala.inline
    def setCoerce(value: StringDictionary[js.Function1[/* arg */ js.Any, _]]): Self = this.set("coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    
    @scala.inline
    def setConfigVarargs(value: String*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: String | js.Array[String] | StringDictionary[scala.Boolean]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setConfiguration(value: PartialConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setCountVarargs(value: String*): Self = this.set("count", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: js.Array[String]): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefault(value: StringDictionary[js.Any]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setEnvPrefix(value: String): Self = this.set("envPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvPrefix: Self = this.set("envPrefix", js.undefined)
    
    @scala.inline
    def setNarg(value: StringDictionary[Double]): Self = this.set("narg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarg: Self = this.set("narg", js.undefined)
    
    @scala.inline
    def setNormalizeVarargs(value: String*): Self = this.set("normalize", js.Array(value :_*))
    
    @scala.inline
    def setNormalize(value: js.Array[String]): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setNumberVarargs(value: String*): Self = this.set("number", js.Array(value :_*))
    
    @scala.inline
    def setNumber(value: js.Array[String]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    
    @scala.inline
    def setString(value: js.Array[String]): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
