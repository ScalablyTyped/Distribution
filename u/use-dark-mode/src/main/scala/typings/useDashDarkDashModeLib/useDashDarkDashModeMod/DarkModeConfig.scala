package typings
package useDashDarkDashModeLib.useDashDarkDashModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkModeConfig extends js.Object {
  /**
    * The class to apply. Default = `dark-mode`.
    */
  var classNameDark: java.lang.String
  /**
    * The class to apply. Default = `light-mode`.
    */
  var classNameLight: java.lang.String
  /**
    * The element to apply the class name. Default = `document.body`.
    */
  var element: stdLib.Element
  /**
    * A string that will be used by the `storageProvider` to persist the
    * dark mode value. If you specify a value of `null`, nothing will not
    * be persisted. Default = `darkMode`.
    */
  var storageKey: java.lang.String | scala.Null
  /**
    * A storage provider. Default = `localStorage`. You will generally
    * never need to change this value.
    */
  var storageProvider: stdLib.Storage
  /**
    * A function that will be called when the dark mode value changes and
    * it is safe to access the DOM (i.e. it is called from within a
    * `useEffect`). If you specify `onChange` then `classNameDark`,
    * `classNameLight`, and `element` are ignored (i.e. no classes are
    * automatically placed on the DOM). You have full control!
    */
  def onChange(value: scala.Boolean): scala.Unit
}

object DarkModeConfig {
  @scala.inline
  def apply(
    classNameDark: java.lang.String,
    classNameLight: java.lang.String,
    element: stdLib.Element,
    onChange: scala.Boolean => scala.Unit,
    storageProvider: stdLib.Storage,
    storageKey: java.lang.String = null
  ): DarkModeConfig = {
    val __obj = js.Dynamic.literal(classNameDark = classNameDark, classNameLight = classNameLight, element = element, onChange = js.Any.fromFunction1(onChange), storageProvider = storageProvider)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[DarkModeConfig]
  }
}

