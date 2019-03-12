package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeStorageNs {
  type CommitHash = java.lang.String
  type CommitHashCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ CommitHash, scala.Unit]
  type ErrorOnlyCallback = js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
}
