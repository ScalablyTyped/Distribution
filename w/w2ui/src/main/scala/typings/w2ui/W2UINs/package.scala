package typings.w2ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UINs {
  type W2EventHandler = (js.Function1[/* e */ W2Event, Unit]) | (js.Function2[/* id */ String, /* e */ W2Event, Unit])
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  StringDictionary[js.Any]
}
