package typings.webgme

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeStorageNs {
  type CommitHash = String
  type CommitHashCallback = js.Function2[/* err */ Error | Null, /* result */ CommitHash, Unit]
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
}
