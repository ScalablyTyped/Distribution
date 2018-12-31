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

