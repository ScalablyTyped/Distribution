package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeClasses {
  import typings.std.Error

  type ArtifactCallback = js.Function2[/* err */ Error, /* result */ Artifact, Unit]
}
