package typings.vueDashRx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueDashRxMod {
  import typings.rxjs.rxjsMod.Observable
  import typings.std.Record

  type Observables = Record[String, Observable[js.Any]]
}
