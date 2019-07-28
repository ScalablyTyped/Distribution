package typings.vscodeDashLanguageserverDashTypes

import typings.vscodeDashLanguageserverDashTypes.Anon_Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageserverDashTypesMod {
  type CodeActionKind = String
  type Declaration = Location | js.Array[Location]
  type DeclarationLink = LocationLink
  type Definition = Location | js.Array[Location]
  type DefinitionLink = LocationLink
  type MarkedString = String | Anon_Language
}
