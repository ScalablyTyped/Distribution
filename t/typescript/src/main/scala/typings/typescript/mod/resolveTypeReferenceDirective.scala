package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "resolveTypeReferenceDirective")
@js.native
object resolveTypeReferenceDirective extends js.Object {
  /**
    * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
    * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
    * is assumed to be the same as root directory of the project.
    */
  def apply(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[java.lang.String],
    options: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def apply(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[java.lang.String],
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
}

