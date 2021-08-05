package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextFactory {
  
  @JSGlobal("TypeScript.TextFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createText(value: String): IText = ^.asInstanceOf[js.Dynamic].applyDynamic("createText")(value.asInstanceOf[js.Any]).asInstanceOf[IText]
}
