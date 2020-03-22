package typings.xmlcreate.xmlDeclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDeclOptions extends js.Object {
  /**
    * The encoding attribute to be included in the declaration. If defined,
    * this value must be a valid encoding. By default, no encoding attribute
    * is included.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * The value of the standalone attribute to be included in the declaration.
    * If defined, this value must be "yes" or "no". By default, no standalone
    * attribute is included.
    */
  var standalone: js.UndefOr[String] = js.undefined
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. Defaults to "1.0".
    */
  var version: js.UndefOr[String] = js.undefined
}

object IXmlDeclOptions {
  @scala.inline
  def apply(encoding: String = null, standalone: String = null, version: String = null): IXmlDeclOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDeclOptions]
  }
}

