package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  /**
    * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v2.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
    * @format uri
    */
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Vega-Lite configuration object.  This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[vegaDashLiteLib.buildSrcConfigMod.Config] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply($schema: java.lang.String = null, config: vegaDashLiteLib.buildSrcConfigMod.Config = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Config]
  }
}

