package typings.typeFest

import typings.std.Capitalize
import typings.typeFest.camelCaseMod.CamelCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pascalCaseMod {
  
  type PascalCase[Value] = CamelCase[Value] | Capitalize[CamelCase[Value]]
}
