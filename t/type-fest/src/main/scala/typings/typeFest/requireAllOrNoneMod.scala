package typings.typeFest

import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requireAllOrNoneMod {
  
  type RequireAllOrNone[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = ((Required[Pick[ObjectType, KeysType]]) & (Omit[ObjectType, KeysType])) | ((Partial[Record[KeysType, scala.Nothing]]) & (Omit[ObjectType, KeysType]))
}
