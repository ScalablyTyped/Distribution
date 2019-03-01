package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser extends js.Object {
  /**
    * Determined dynamically
    * @deprecated
    */
  var major: js.UndefOr[java.lang.String]
  /**
    * Possible values :
    * Amaya, Android Browser, Arora, Avant, Baidu, Blazer, Bolt, Camino, Chimera, Chrome,
    * Chromium, Comodo Dragon, Conkeror, Dillo, Dolphin, Doris, Edge, Epiphany, Fennec,
    * Firebird, Firefox, Flock, GoBrowser, iCab, ICE Browser, IceApe, IceCat, IceDragon,
    * Iceweasel, IE [Mobile], Iron, Jasmine, K-Meleon, Konqueror, Kindle, Links,
    * Lunascape, Lynx, Maemo, Maxthon, Midori, Minimo, MIUI Browser, [Mobile] Safari,
    * Mosaic, Mozilla, Netfront, Netscape, NetSurf, Nokia, OmniWeb, Opera [Mini/Mobi/Tablet],
    * Phoenix, Polaris, QQBrowser, RockMelt, Silk, Skyfire, SeaMonkey, SlimBrowser, Swiftfox,
    * Tizen, UCBrowser, Vivaldi, w3m, Yandex
    *
    */
  var name: js.UndefOr[java.lang.String]
  /**
    * Determined dynamically
    */
  var version: js.UndefOr[java.lang.String]
}

object IBrowser {
  @scala.inline
  def apply(major: java.lang.String = null, name: java.lang.String = null, version: java.lang.String = null): IBrowser = {
    val __obj = js.Dynamic.literal()
    if (major != null) __obj.updateDynamic("major")(major)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IBrowser]
  }
}

