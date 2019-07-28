package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcConfigMod.ViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofconfig extends js.Object {
  val defaultConfig: Config
  val defaultViewConfig: ViewConfig
  def initConfig(config: Config): Config
  def stripAndRedirectConfig(config: Config): Config
}

object Typeofconfig {
  @scala.inline
  def apply(
    defaultConfig: Config,
    defaultViewConfig: ViewConfig,
    initConfig: Config => Config,
    stripAndRedirectConfig: Config => Config
  ): Typeofconfig = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig, defaultViewConfig = defaultViewConfig, initConfig = js.Any.fromFunction1(initConfig), stripAndRedirectConfig = js.Any.fromFunction1(stripAndRedirectConfig))
  
    __obj.asInstanceOf[Typeofconfig]
  }
}

