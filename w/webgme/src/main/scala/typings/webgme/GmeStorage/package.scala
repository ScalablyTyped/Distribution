package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeStorage {
  import typings.std.Error

  type CommitHash = String
  type CommitHashCallback = js.Function2[/* err */ Error | Null, /* result */ CommitHash, Unit]
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
}
