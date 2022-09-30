package typings.typeFest

import typings.std.Pick
import typings.typeFest.conditionalKeysMod.ConditionalKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalPickMod {
  
  type ConditionalPick[Base, Condition] = Pick[Base, ConditionalKeys[Base, Condition]]
}
