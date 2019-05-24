package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the XML declaration.
  */
@JSImport("xmlbuilder", "XMLDeclaration")
@js.native
class XMLDeclaration () extends js.Object {
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: java.lang.String = js.native
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: scala.Boolean = js.native
  /**
    * A version number string, e.g. `1.0`
    */
  var version: java.lang.String = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
}

