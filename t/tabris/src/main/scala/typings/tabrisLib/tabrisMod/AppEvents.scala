package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEvents extends NativeObjectEvents {
  /**
    * Fired when the back button is pressed on Android.
    */
  var backNavigation: js.UndefOr[js.Function1[/* event */ AppBackNavigationEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the app becomes invisible. Either because another app is in the foreground or the user has
    * returned to the home screen.
    */
  var background: js.UndefOr[js.Function1[/* event */ EventObject[App], scala.Unit]] = js.undefined
  /**
    * The event is fired when the app starts or when it returns from the background.
    */
  var foreground: js.UndefOr[js.Function1[/* event */ EventObject[App], scala.Unit]] = js.undefined
  /**
    * Fired when the [*id*](#id) property has changed.
    * @param value The new value of [*id*](#id).
    */
  var idChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[App, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the app is not the interaction target of the user anymore. Usually preceded by `resume`.
    */
  var pause: js.UndefOr[js.Function1[/* event */ EventObject[App], scala.Unit]] = js.undefined
  /**
    * Fired when the [*pinnedCertificates*](#pinnedCertificates) property has changed.
    * @param value The new value of [*pinnedCertificates*](#pinnedCertificates).
    */
  var pinnedCertificatesChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[App, js.Array[_]], scala.Unit]] = js.undefined
  /**
    * Fired when the app is visible and ready to interact with the user. The event is preceded by either
    * `foreground` (the app becomes visible again) or `pause` (the app regains ability to interact with
    * user).
    */
  var resume: js.UndefOr[js.Function1[/* event */ EventObject[App], scala.Unit]] = js.undefined
  /**
    * Fired when the app is being destroyed. After this callback no more interaction with the app is
    * possible.
    */
  var terminate: js.UndefOr[js.Function1[/* event */ EventObject[App], scala.Unit]] = js.undefined
  /**
    * Fired when the [*trustedCertificates*](#trustedCertificates) property has changed.
    * @param value The new value of [*trustedCertificates*](#trustedCertificates).
    */
  var trustedCertificatesChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[App, js.Array[_]], scala.Unit]] = js.undefined
  /**
    * Fired when the [*version*](#version) property has changed.
    * @param value The new value of [*version*](#version).
    */
  var versionChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[App, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*versionCode*](#versionCode) property has changed.
    * @param value The new value of [*versionCode*](#versionCode).
    */
  var versionCodeChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[App, scala.Double], scala.Unit]] = js.undefined
}

object AppEvents {
  @scala.inline
  def apply(
    backNavigation: /* event */ AppBackNavigationEvent => scala.Unit = null,
    background: /* event */ EventObject[App] => scala.Unit = null,
    foreground: /* event */ EventObject[App] => scala.Unit = null,
    idChanged: /* event */ PropertyChangedEvent[App, java.lang.String] => scala.Unit = null,
    pause: /* event */ EventObject[App] => scala.Unit = null,
    pinnedCertificatesChanged: /* event */ PropertyChangedEvent[App, js.Array[_]] => scala.Unit = null,
    resume: /* event */ EventObject[App] => scala.Unit = null,
    terminate: /* event */ EventObject[App] => scala.Unit = null,
    trustedCertificatesChanged: /* event */ PropertyChangedEvent[App, js.Array[_]] => scala.Unit = null,
    versionChanged: /* event */ PropertyChangedEvent[App, java.lang.String] => scala.Unit = null,
    versionCodeChanged: /* event */ PropertyChangedEvent[App, scala.Double] => scala.Unit = null
  ): AppEvents = {
    val __obj = js.Dynamic.literal()
    if (backNavigation != null) __obj.updateDynamic("backNavigation")(js.Any.fromFunction1(backNavigation))
    if (background != null) __obj.updateDynamic("background")(js.Any.fromFunction1(background))
    if (foreground != null) __obj.updateDynamic("foreground")(js.Any.fromFunction1(foreground))
    if (idChanged != null) __obj.updateDynamic("idChanged")(js.Any.fromFunction1(idChanged))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1(pause))
    if (pinnedCertificatesChanged != null) __obj.updateDynamic("pinnedCertificatesChanged")(js.Any.fromFunction1(pinnedCertificatesChanged))
    if (resume != null) __obj.updateDynamic("resume")(js.Any.fromFunction1(resume))
    if (terminate != null) __obj.updateDynamic("terminate")(js.Any.fromFunction1(terminate))
    if (trustedCertificatesChanged != null) __obj.updateDynamic("trustedCertificatesChanged")(js.Any.fromFunction1(trustedCertificatesChanged))
    if (versionChanged != null) __obj.updateDynamic("versionChanged")(js.Any.fromFunction1(versionChanged))
    if (versionCodeChanged != null) __obj.updateDynamic("versionCodeChanged")(js.Any.fromFunction1(versionCodeChanged))
    __obj.asInstanceOf[AppEvents]
  }
}

