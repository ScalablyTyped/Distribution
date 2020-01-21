package typings.vmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about VMAP extension
  */
trait VMAPExtension extends js.Object {
  /**
    * Object containing all this extension attributes and their name as the key
    */
  var attribute: js.Any
  /**
    * Object containing all this extension children and their name as the key
    */
  var children: js.Any
  /**
    * Object parsed from CDATA or as a fallback all of the text nodes of this extension concatenated
    */
  var value: js.Any
}

object VMAPExtension {
  @scala.inline
  def apply(attribute: js.Any, children: js.Any, value: js.Any): VMAPExtension = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VMAPExtension]
  }
}

