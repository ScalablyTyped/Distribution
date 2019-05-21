package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevice extends js.Object {
  /**
    * Determined dynamically
    */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible type:
    * console, mobile, tablet, smarttv, wearable, embedded
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible vendor:
    * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
    * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
    * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
    * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
    */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object IDevice {
  @scala.inline
  def apply(model: java.lang.String = null, `type`: java.lang.String = null, vendor: java.lang.String = null): IDevice = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[IDevice]
  }
}

