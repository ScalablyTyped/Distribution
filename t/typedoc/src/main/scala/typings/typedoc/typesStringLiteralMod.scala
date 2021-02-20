package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStringLiteralMod {
  
  @JSImport("typedoc/dist/lib/models/types/string-literal", "StringLiteralType")
  @js.native
  class StringLiteralType protected () extends Type {
    def this(value: String) = this()
    
    def equals(`type`: StringLiteralType): Boolean = js.native
    
    var value: String = js.native
  }
}
