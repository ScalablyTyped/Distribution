package typings.xmlcreate.xmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlProcInstOptions extends js.Object {
  /**
    * The data of the processing instruction, or undefined if there is no
    * content.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The target of the processing instruction.
    */
  var target: String
}

object IXmlProcInstOptions {
  @scala.inline
  def apply(target: String, content: String = null): IXmlProcInstOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlProcInstOptions]
  }
}

