package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageVersion extends js.Object
@JSGlobal("TypeScript.LanguageVersion")
@js.native
object LanguageVersion extends js.Object {
  
  @js.native
  sealed trait EcmaScript3 extends LanguageVersion
  
  @js.native
  sealed trait EcmaScript5 extends LanguageVersion
}
