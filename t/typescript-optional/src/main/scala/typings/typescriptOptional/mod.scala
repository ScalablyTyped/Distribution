package typings.typescriptOptional

import typings.typescriptOptional.typesMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typescript-optional", "Optional")
  @js.native
  abstract class Optional[T] ()
    extends typings.typescriptOptional.optionalMod.Optional[T]
  /* static members */
  object Optional {
    
    @JSImport("typescript-optional", "Optional.empty")
    @js.native
    def empty[T](): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.from")
    @js.native
    def from[T](option: Option[T]): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.of")
    @js.native
    def of[T](value: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.ofNonNull")
    @js.native
    def ofNonNull[T](value: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    
    @JSImport("typescript-optional", "Optional.ofNullable")
    @js.native
    def ofNullable[T](): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    @JSImport("typescript-optional", "Optional.ofNullable")
    @js.native
    def ofNullable[T](nullable: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
  }
}
