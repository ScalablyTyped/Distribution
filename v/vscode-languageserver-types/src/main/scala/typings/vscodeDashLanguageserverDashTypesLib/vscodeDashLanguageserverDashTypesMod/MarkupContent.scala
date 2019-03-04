package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkupContent extends js.Object {
  /**
    * The type of the Markup
    */
  var kind: MarkupKind
  /**
    * The content itself
    */
  var value: java.lang.String
}

object MarkupContent {
  @scala.inline
  def apply(kind: MarkupKind, value: java.lang.String): MarkupContent = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[MarkupContent]
  }
}

