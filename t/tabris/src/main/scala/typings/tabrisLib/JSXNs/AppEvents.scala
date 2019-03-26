package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEvents extends NativeObjectEvents {
  /**
    * Fired when the back button is pressed on Android.
    */
  var onBackNavigation: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.AppBackNavigationEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the app becomes invisible. Either because another app is in the foreground or the user has
    * returned to the home screen.
    */
  var onBackground: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App], scala.Unit]
  ] = js.undefined
  /**
    * The event is fired when the app starts or when it returns from the background.
    */
  var onForeground: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*id*](#id) property has changed.
    * @param value The new value of [*id*](#id).
    */
  var onIdChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the app is not the interaction target of the user anymore. Usually preceded by `resume`.
    */
  var onPause: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*pinnedCertificates*](#pinnedCertificates) property has changed.
    * @param value The new value of [*pinnedCertificates*](#pinnedCertificates).
    */
  var onPinnedCertificatesChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, js.Array[_]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the app is visible and ready to interact with the user. The event is preceded by either
    * `foreground` (the app becomes visible again) or `pause` (the app regains ability to interact with
    * user).
    */
  var onResume: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the app is being destroyed. After this callback no more interaction with the app is
    * possible.
    */
  var onTerminate: js.UndefOr[
    js.Function1[/* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*trustedCertificates*](#trustedCertificates) property has changed.
    * @param value The new value of [*trustedCertificates*](#trustedCertificates).
    */
  var onTrustedCertificatesChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, js.Array[_]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*version*](#version) property has changed.
    * @param value The new value of [*version*](#version).
    */
  var onVersionChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*versionCode*](#versionCode) property has changed.
    * @param value The new value of [*versionCode*](#versionCode).
    */
  var onVersionCodeChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

object AppEvents {
  @scala.inline
  def apply(
    onBackNavigation: /* event */ tabrisLib.tabrisMod.AppBackNavigationEvent => scala.Unit = null,
    onBackground: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App] => scala.Unit = null,
    onForeground: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App] => scala.Unit = null,
    onIdChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, java.lang.String] => scala.Unit = null,
    onPause: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App] => scala.Unit = null,
    onPinnedCertificatesChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, js.Array[_]] => scala.Unit = null,
    onResume: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App] => scala.Unit = null,
    onTerminate: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.App] => scala.Unit = null,
    onTrustedCertificatesChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, js.Array[_]] => scala.Unit = null,
    onVersionChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, java.lang.String] => scala.Unit = null,
    onVersionCodeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.App, scala.Double] => scala.Unit = null
  ): AppEvents = {
    val __obj = js.Dynamic.literal()
    if (onBackNavigation != null) __obj.updateDynamic("onBackNavigation")(js.Any.fromFunction1(onBackNavigation))
    if (onBackground != null) __obj.updateDynamic("onBackground")(js.Any.fromFunction1(onBackground))
    if (onForeground != null) __obj.updateDynamic("onForeground")(js.Any.fromFunction1(onForeground))
    if (onIdChanged != null) __obj.updateDynamic("onIdChanged")(js.Any.fromFunction1(onIdChanged))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPinnedCertificatesChanged != null) __obj.updateDynamic("onPinnedCertificatesChanged")(js.Any.fromFunction1(onPinnedCertificatesChanged))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction1(onResume))
    if (onTerminate != null) __obj.updateDynamic("onTerminate")(js.Any.fromFunction1(onTerminate))
    if (onTrustedCertificatesChanged != null) __obj.updateDynamic("onTrustedCertificatesChanged")(js.Any.fromFunction1(onTrustedCertificatesChanged))
    if (onVersionChanged != null) __obj.updateDynamic("onVersionChanged")(js.Any.fromFunction1(onVersionChanged))
    if (onVersionCodeChanged != null) __obj.updateDynamic("onVersionCodeChanged")(js.Any.fromFunction1(onVersionCodeChanged))
    __obj.asInstanceOf[AppEvents]
  }
}

