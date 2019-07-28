package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

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
  var value: String
}

object MarkupContent {
  @scala.inline
  def apply(kind: MarkupKind, value: String): MarkupContent = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[MarkupContent]
  }
}

