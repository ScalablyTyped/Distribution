package typings
package winjsLib.WinJSNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Properties
//#region Interfaces
trait ILogOptions extends js.Object {
  var action: js.UndefOr[
    js.Function3[
      /* message */ java.lang.String, 
      /* tags */ java.lang.String, 
      /* type */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var excludeTags: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ILogOptions {
  @scala.inline
  def apply(
    action: js.Function3[
      /* message */ java.lang.String, 
      /* tags */ java.lang.String, 
      /* type */ java.lang.String, 
      scala.Unit
    ] = null,
    excludeTags: java.lang.String = null,
    tags: java.lang.String = null,
    `type`: java.lang.String = null
  ): ILogOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (excludeTags != null) __obj.updateDynamic("excludeTags")(excludeTags)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILogOptions]
  }
}

