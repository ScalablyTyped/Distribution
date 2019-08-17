package typings.vscodeDashLanguageserverDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageserverDashTypesMod {
  import typings.vscodeDashLanguageserverDashTypes.Anon_Language

  type CodeActionKind = String
  type Declaration = Location | js.Array[Location]
  type DeclarationLink = LocationLink
  type Definition = Location | js.Array[Location]
  type DefinitionLink = LocationLink
  type MarkedString = String | Anon_Language
}
