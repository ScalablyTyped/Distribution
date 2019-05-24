package typings
package xmlcreateLib.libNodesXmlDeclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDeclOptions extends js.Object {
  /**
    * The encoding attribute to be included in the declaration. If defined,
    * this value must be a valid encoding. By default, no encoding attribute
    * is included.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of the standalone attribute to be included in the declaration.
    * If defined, this value must be "yes" or "no". By default, no standalone
    * attribute is included.
    */
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. Defaults to "1.0".
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object IXmlDeclOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    standalone: java.lang.String = null,
    version: java.lang.String = null
  ): IXmlDeclOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (standalone != null) __obj.updateDynamic("standalone")(standalone)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IXmlDeclOptions]
  }
}

