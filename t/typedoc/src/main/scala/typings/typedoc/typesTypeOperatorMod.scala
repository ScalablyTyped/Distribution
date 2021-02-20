package typings.typedoc

import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypeOperatorMod {
  
  @JSImport("typedoc/dist/lib/models/types/type-operator", "TypeOperatorType")
  @js.native
  class TypeOperatorType protected () extends Type {
    def this(target: Type, operator: keyof) = this()
    def this(target: Type, operator: readonly) = this()
    def this(target: Type, operator: unique) = this()
    
    def equals(`type`: TypeOperatorType): Boolean = js.native
    
    var operator: keyof | unique | readonly = js.native
    
    var target: Type = js.native
  }
}
