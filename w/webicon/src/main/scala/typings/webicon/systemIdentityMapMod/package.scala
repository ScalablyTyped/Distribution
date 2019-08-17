package typings.webicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemIdentityMapMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.webicon.systemIdentifiableMod.Identifiable

  type IdentityMap[TSimple, TComplex] = (js.Array[Identifiable with TComplex]) | (StringDictionary[TSimple | TComplex])
}
