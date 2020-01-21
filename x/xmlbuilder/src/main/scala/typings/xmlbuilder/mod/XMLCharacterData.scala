package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class of character data nodes.
  */
@JSImport("xmlbuilder", "XMLCharacterData")
@js.native
abstract class XMLCharacterData () extends XMLNode {
  /**
    * Node value
    */
  var value: String = js.native
}

