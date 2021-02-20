package typings.webgme.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
object GmeConfig {
  
  @JSGlobal("GmeConfig")
  @js.native
  val ^ : js.Any = js.native
  @JSGlobal("GmeConfig.GmeConfig")
  @js.native
  class GmeConfig ()
    extends typings.webgme.GmeConfig.GmeConfig
  
  @JSGlobal("GmeConfig.PluginConfig")
  @js.native
  class PluginConfig ()
    extends typings.webgme.GmeConfig.PluginConfig
  
  @JSGlobal("GmeConfig.config")
  @js.native
  def config: typings.webgme.GmeConfig.PluginConfig = js.native
  @scala.inline
  def config_=(x: typings.webgme.GmeConfig.PluginConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
}
