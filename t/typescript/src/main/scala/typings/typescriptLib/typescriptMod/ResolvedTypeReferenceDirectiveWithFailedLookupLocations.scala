package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends js.Object {
  val failedLookupLocations: js.Array[java.lang.String]
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective]
}

object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  @scala.inline
  def apply(
    failedLookupLocations: js.Array[java.lang.String],
    resolvedTypeReferenceDirective: ResolvedTypeReferenceDirective = null
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal(failedLookupLocations = failedLookupLocations)
    if (resolvedTypeReferenceDirective != null) __obj.updateDynamic("resolvedTypeReferenceDirective")(resolvedTypeReferenceDirective)
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
}

