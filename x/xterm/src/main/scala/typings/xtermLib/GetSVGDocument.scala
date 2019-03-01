package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document
}

object GetSVGDocument {
  @scala.inline
  def apply(getSVGDocument: js.Function0[Document]): GetSVGDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSVGDocument")(getSVGDocument)
    __obj.asInstanceOf[GetSVGDocument]
  }
}

