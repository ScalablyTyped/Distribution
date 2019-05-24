package typings
package xmlcreateLib.libNodesXmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlProcInstOptions extends js.Object {
  /**
    * The data of the processing instruction, or undefined if there is no
    * content.
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target of the processing instruction.
    */
  var target: java.lang.String
}

object IXmlProcInstOptions {
  @scala.inline
  def apply(target: java.lang.String, content: java.lang.String = null): IXmlProcInstOptions = {
    val __obj = js.Dynamic.literal(target = target)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[IXmlProcInstOptions]
  }
}

