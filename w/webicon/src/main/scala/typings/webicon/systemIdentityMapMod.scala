package typings.webicon

import org.scalablytyped.runtime.StringDictionary
import typings.webicon.systemIdentifiableMod.Identifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/System/IdentityMap", JSImport.Namespace)
@js.native
object systemIdentityMapMod extends js.Object {
  type IdentityMap[TSimple, TComplex] = (js.Array[Identifiable with TComplex]) | (StringDictionary[TSimple | TComplex])
}

