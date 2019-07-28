package typings.vueDashRx

import typings.rxjs.rxjsMod.Observable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueDashRxMod {
  type Observables = Record[String, Observable[js.Any]]
}
