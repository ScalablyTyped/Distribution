package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  val defaultConfig: vegaDashLiteLib.buildSrcConfigMod.Config
  val defaultViewConfig: vegaDashLiteLib.buildSrcConfigMod.ViewConfig
  def initConfig(config: vegaDashLiteLib.buildSrcConfigMod.Config): vegaDashLiteLib.buildSrcConfigMod.Config
  def stripAndRedirectConfig(config: vegaDashLiteLib.buildSrcConfigMod.Config): vegaDashLiteLib.buildSrcConfigMod.Config
}

object Anon_Config {
  @scala.inline
  def apply(
    defaultConfig: vegaDashLiteLib.buildSrcConfigMod.Config,
    defaultViewConfig: vegaDashLiteLib.buildSrcConfigMod.ViewConfig,
    initConfig: vegaDashLiteLib.buildSrcConfigMod.Config => vegaDashLiteLib.buildSrcConfigMod.Config,
    stripAndRedirectConfig: vegaDashLiteLib.buildSrcConfigMod.Config => vegaDashLiteLib.buildSrcConfigMod.Config
  ): Anon_Config = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig, defaultViewConfig = defaultViewConfig, initConfig = js.Any.fromFunction1(initConfig), stripAndRedirectConfig = js.Any.fromFunction1(stripAndRedirectConfig))
  
    __obj.asInstanceOf[Anon_Config]
  }
}

