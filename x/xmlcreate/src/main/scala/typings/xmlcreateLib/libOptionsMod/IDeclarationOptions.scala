package typings
package xmlcreateLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDeclarationOptions extends js.Object {
  /**
       * The XML encoding to be included in the declaration. This value must be a
       * valid encoding. If left undefined, no encoding is included.
       */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The XML standalone attribute to be included. This value must be "yes" or
       * "no". If left undefined, no standalone attribute is included.
       */
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The XML version to be included in the declaration. This value must be a
       * valid XML version number. If left undefined, the default version is
       * "1.0".
       */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

