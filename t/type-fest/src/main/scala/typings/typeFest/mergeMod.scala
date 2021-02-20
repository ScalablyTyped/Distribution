package typings.typeFest

import typings.std.Extract
import typings.typeFest.exceptMod.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  type Merge[FirstType, SecondType] = (Except[FirstType, Extract[/* keyof FirstType */ String, /* keyof SecondType */ String]]) with SecondType
}
