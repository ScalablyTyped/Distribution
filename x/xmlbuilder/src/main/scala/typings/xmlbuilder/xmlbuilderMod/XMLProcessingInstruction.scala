package typings.xmlbuilder.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a processing instruction node.
  */
@JSImport("xmlbuilder", "XMLProcessingInstruction")
@js.native
class XMLProcessingInstruction () extends XMLCharacterData {
  /**  Instruction target
    */
  var target: String = js.native
  def toString(options: XMLToStringOptions): String = js.native
}

