package typings.atUifabricUtilities

import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettings
import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopedSettings extends js.Object {
  /**
    * Scoped settings are settings that are scoped to a specific scope. The
    * scope is the name that is passed to the `customizable` function when the
    * the component is customized.
    *
    * @example
    * Scoped settings can be represented by a plain object that contains the key value pairs.
    * ```
    *  const myScopedSettings = {
    *    Button: { color: 'red' };
    *  };
    *
    *  <Customizer scopedSettings={myScopedSettings} />
    * ```
    * or a function that receives the current settings and returns the new ones
    * ```
    *  const myScopedSettings = {
    *    Button: { color: 'red' };
    *  };
    *
    *  <Customizer scopedSettings={(currentScopedSettings) => ({ ...currentScopedSettings, ...myScopedSettings })} />
    * ```
    */
  var scopedSettings: ISettings | ISettingsFunction
  /**
    * Settings are used as general settings for the React tree below.
    * Components can subscribe to receive the settings by using `customizable`.
    *
    * @example
    * Settings can be represented by a plain object that contains the key value pairs.
    * ```
    *  <Customizer settings={{ color: 'red' }} />
    * ```
    * or a function that receives the current settings and returns the new ones
    * ```
    *  <Customizer settings={(currentSettings) => ({ ...currentSettings, color: 'red' })} />
    * ```
    */
  var settings: ISettings | ISettingsFunction
}

object Anon_ScopedSettings {
  @scala.inline
  def apply(scopedSettings: ISettings | ISettingsFunction, settings: ISettings | ISettingsFunction): Anon_ScopedSettings = {
    val __obj = js.Dynamic.literal(scopedSettings = scopedSettings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ScopedSettings]
  }
}

