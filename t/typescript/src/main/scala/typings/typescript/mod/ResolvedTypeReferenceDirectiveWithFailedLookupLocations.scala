package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends js.Object {
  val failedLookupLocations: js.Array[java.lang.String]
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.undefined
}

object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  @scala.inline
  def apply(
    failedLookupLocations: js.Array[java.lang.String],
    resolvedTypeReferenceDirective: ResolvedTypeReferenceDirective = null
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal(failedLookupLocations = failedLookupLocations.asInstanceOf[js.Any])
    if (resolvedTypeReferenceDirective != null) __obj.updateDynamic("resolvedTypeReferenceDirective")(resolvedTypeReferenceDirective.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
}

