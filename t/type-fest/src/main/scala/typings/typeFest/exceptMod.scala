package typings.typeFest

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptMod {
  
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = Pick[ObjectType, Exclude[/* keyof ObjectType */ String, KeysType]]
}
