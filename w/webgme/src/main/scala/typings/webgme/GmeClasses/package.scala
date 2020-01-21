package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeClasses {
  type ArtifactCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* result */ typings.webgme.GmeClasses.Artifact, 
    scala.Unit
  ]
}
