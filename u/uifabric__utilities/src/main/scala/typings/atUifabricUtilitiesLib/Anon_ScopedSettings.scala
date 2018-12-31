package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopedSettings extends js.Object {
  /**
    * @description
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
  var scopedSettings: atUifabricUtilitiesLib.libCustomizationsMod.Settings | atUifabricUtilitiesLib.libCustomizationsMod.SettingsFunction
  /**
    * @description
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
  var settings: atUifabricUtilitiesLib.libCustomizationsMod.Settings | atUifabricUtilitiesLib.libCustomizationsMod.SettingsFunction
}

