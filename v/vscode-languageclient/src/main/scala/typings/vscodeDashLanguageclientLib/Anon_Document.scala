package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ js.Any
  var range: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ js.Any
}

object Anon_Document {
  @scala.inline
  def apply(
    document: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ js.Any,
    range: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VRange */ js.Any
  ): Anon_Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Anon_Document]
  }
}

