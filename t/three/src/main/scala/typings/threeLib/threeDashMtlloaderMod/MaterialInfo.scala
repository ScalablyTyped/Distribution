package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialInfo extends js.Object {
  var bump: js.UndefOr[java.lang.String] = js.undefined
  var d: js.UndefOr[scala.Double] = js.undefined
  var kd: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var ke: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var ks: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var map_bump: js.UndefOr[java.lang.String] = js.undefined
  var map_d: js.UndefOr[java.lang.String] = js.undefined
  var map_kd: js.UndefOr[java.lang.String] = js.undefined
  var map_ke: js.UndefOr[java.lang.String] = js.undefined
  var map_ks: js.UndefOr[java.lang.String] = js.undefined
  var norm: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[scala.Double] = js.undefined
  var tr: js.UndefOr[scala.Double] = js.undefined
}

object MaterialInfo {
  @scala.inline
  def apply(
    bump: java.lang.String = null,
    d: scala.Int | scala.Double = null,
    kd: js.Array[scala.Double] = null,
    ke: js.Array[scala.Double] = null,
    ks: js.Array[scala.Double] = null,
    map_bump: java.lang.String = null,
    map_d: java.lang.String = null,
    map_kd: java.lang.String = null,
    map_ke: java.lang.String = null,
    map_ks: java.lang.String = null,
    norm: java.lang.String = null,
    ns: scala.Int | scala.Double = null,
    tr: scala.Int | scala.Double = null
  ): MaterialInfo = {
    val __obj = js.Dynamic.literal()
    if (bump != null) __obj.updateDynamic("bump")(bump)
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (kd != null) __obj.updateDynamic("kd")(kd)
    if (ke != null) __obj.updateDynamic("ke")(ke)
    if (ks != null) __obj.updateDynamic("ks")(ks)
    if (map_bump != null) __obj.updateDynamic("map_bump")(map_bump)
    if (map_d != null) __obj.updateDynamic("map_d")(map_d)
    if (map_kd != null) __obj.updateDynamic("map_kd")(map_kd)
    if (map_ke != null) __obj.updateDynamic("map_ke")(map_ke)
    if (map_ks != null) __obj.updateDynamic("map_ks")(map_ks)
    if (norm != null) __obj.updateDynamic("norm")(norm)
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialInfo]
  }
}

